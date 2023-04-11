package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Shop shop = new Shop();
        shop.setSellerEnterRequest(new Seller("atefeg", "sdkj"));
        shop.setSellerEnterRequest(new Seller("sara", "sdfghj"));
        Scanner in = new Scanner(System.in);
        boolean continued = true;
        while (continued){
            System.out.println("1. Log in");
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
            switch (Integer.parseInt(in.nextLine())) {
                case 1:
                    System.out.println("Which kind of account do you want to login as?");
                    System.out.println("1. Admin");
                    System.out.println("2. Seller");
                    System.out.println("3. User");
                    int choice = Integer.parseInt(in.nextLine());
                    String username = Enter.login(shop, choice);
                    if (username != null) {
                        switch (choice) {
                            case 1:
                                while (runAdmin(shop)){}
                                break;
                            case 2:
                                while (runSeller(shop.findSeller(username), shop)){}
                                break;
                            case 3:
                                while (runUser(shop.findUser(username), shop)){}
                        }
                    }
                    break;
                case 2:
                    System.out.println("Which kind of account do you want to create?");
                    System.out.println("1. Seller");
                    System.out.println("2. User");
                    Enter.signUp(shop, Integer.parseInt(in.nextLine()));
                    break;
                case 3:
                    continued = false;
            }
        }
    }
    public static boolean runAdmin(Shop shop){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Add Admin");
        System.out.println("2. View Requests");
        System.out.println("3. View users");
        System.out.println("4. log out");
        switch (Integer.parseInt(in.nextLine())){
            case 1:
                Enter.addAdmin(shop);
                return true;
            case 2:
                if (shop.doesUserReqExist()) {
                    System.out.println("User Requests:");
                    shop.viewUserRequests();
                    System.out.println("Which one(s) do you want to accept? when you're finished, please enter E");
                    String req = in.nextLine();
                    while (!req.equals("E")) {
                        shop.acceptUserRequest(Integer.parseInt(req));
                        System.out.println("Request accepted successfully.");
                        if (shop.doesUserReqExist()) {
                            shop.viewUserRequests();
                            req = in.nextLine();
                        } else {
                            req = "E";
                        }
                    }
                }
                if (shop.doesSellerReqExist()){
                    System.out.println("Seller Requests:");
                    shop.viewSellerRequests();
                    System.out.println("Which one(s) do you want to change? when you're finished, please enter E");
                    String req = in.nextLine();
                    while (!req.equals("E")){
                        System.out.println("1. Accept / 2. Reject");
                        switch (Integer.parseInt(in.nextLine())){
                            case 1:
                                shop.confirmSellerEnterRequest(Integer.parseInt(req));
                                System.out.println("Request accepted successfully.");
                                break;
                            case 2:
                                shop.rejectSellerEnterRequest(Integer.parseInt(req));
                                System.out.println("Request rejected.");
                                break;
                        }
                        if (shop.doesSellerReqExist()) {
                            shop.viewSellerRequests();
                            req = in.nextLine();
                        } else {
                            req = "E";
                        }
                    }
                }
                return true;
            case 3:
                shop.viewUsers();
                break;
            case 4:
                return false;
        }
        return false;
    }
    public static boolean runSeller(Seller seller, Shop shop){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Add product");
        System.out.println("2. View products");
        System.out.println("3. Wallet");
        System.out.println("4. log out");
        int op = Integer.parseInt(in.nextLine());
        switch (op){
            case 1:
                switch (GetProductInfo.kind()){
                    case 1:
                        Phone phone = GetProductInfo.phone();
                        seller.addToProducts(phone);
                    case 2:
                        seller.viewProducts();
                    case 3:
                        System.out.println("Your current wallet has " + seller.getWallet() + " money");
                    case 4:
                        return false;
                }

        }
        return true;
    }
    public static boolean runUser(User user, Shop shop){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Search");
        System.out.println("2. view cart");
        System.out.println("3. Add money to wallet");
        System.out.println("4. exit");
        switch (Integer.parseInt(in.nextLine())){
            case 1:
                System.out.println("What are you looking for?");
                if (shop.searchProduct(in.nextLine())){
                    System.out.println("If you want to add one to your cart please enter the number, if not, press E");
                    String op = in.nextLine();
                    if (!op.equals("E")){
                        System.out.println("How many do you want to add?");
                        user.addToCart(shop.findProduct(Integer.parseInt(op)), Integer.parseInt(in.nextLine()));
                    }
                }
                break;
            case 2:
                user.viewCart();
                System.out.println("Do you want to purchase the cart? y/n");
                if (in.nextLine().equals("y")){
                    user.addOrder(user);
                    shop.addToProfit(0.9 * user.getCartPrice());
                }
                break;
            case 3:
                System.out.println("How much do you request to add to wallet?");
                shop.addUserRequest(user, Integer.parseInt(in.nextLine()));
                System.out.println("Your request has been sent.");
                break;
            case 4:
                return false;
        }
        return true;
    }
}