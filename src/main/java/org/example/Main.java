package org.example;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("1. Log in");
        System.out.println("2. Sign up");
        switch (Integer.parseInt(in.nextLine())){
            case 1:
                System.out.println("Which kind of account do you want to login as?");
                System.out.println("1. Admin");
                System.out.println("2. Seller");
                System.out.println("3. User");
                int choice = Integer.parseInt(in.nextLine());
                if (Enter.login(shop, choice) != null){
                    switch (choice){
                        case 1:
                            runAdmin(shop);
                        case 2:

                    }
                }
            case 2:
                System.out.println("Which kind of account do you want to create?");
                System.out.println("1. Seller");
                System.out.println("2. User");
                Enter.signUp(shop, Integer.parseInt(in.nextLine()));
        }
    }
    public static void runAdmin(Shop shop){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Add Admin");
        System.out.println("2. View Requests");
        System.out.println("3. View users");
        switch (Integer.parseInt(in.nextLine())){
            case 1:
                Enter.addAdmin(shop);
                break;
            case 2:
                if (shop.doesUserReqExist()) {
                    shop.viewUserRequests(); //or order request
                    System.out.println("Which one(s) do you want to accept? when you're finished entering number of requests, please enter E");
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
                if (!shop.viewSellerRequests()){
                    System.out.println("Which one(s) do you want to accept? when you're finished entering number of requests, please enter E");
                    String req = in.nextLine();
                    while (!req.equals("E")){
                        shop.confirmSellerEnterRequest(Integer.parseInt(req));
                        System.out.println("Request accepted successfully.");
                        req = in.nextLine();
                    }
                }
                break;
            case 3:
                shop.viewUsers();
                break;
        }
    }
    public static void runSeller(Seller seller, Shop shop){
        Scanner in = new Scanner(System.in);
        System.out.println("1. Add product");
        System.out.println("2. View products");
        System.out.println("3. Wallet");
        switch (Integer.parseInt(in.nextLine())){
            case 1:

        }
    }
    public static void runUser(Shop shop){}
}