package org.example;

import java.util.Scanner;

public class Enter {
    public static String signUp(Shop shop, int choice){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter name:");
        String username = in.nextLine();
        while (shop.doesUsernameExist(username)){
            System.out.println("Username is already taken, please try again:");
            username = in.nextLine();
        }
        System.out.println("Please enter password:");
        String password = in.nextLine();
        String passPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        while (!password.matches(passPattern)){
            System.err.println("Password must contain at least eight characters (at least one uppercase and lowercase letter and one number)");
            System.out.println("please try again:");
            password = in.nextLine();
        }
        String emailPattern = "^[a-zA-z0-9_.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{3}$";
        switch (choice){
            case 1:
                Seller seller = new Seller(username, password);
                shop.setSellerEnterRequest(seller);
                System.out.println("Your request to create an account has been sent to admin(s)");
                return username;
            case 2:
                System.out.println("Enter email:");
                String email = in.nextLine();
                while (!email.matches(emailPattern)){
                    System.out.println("Please enter a valid email address:");
                    email = in.nextLine();
                }
                System.out.println("Enter phone number:");
                String phone = in.nextLine();
                String phonePattern = "^09\\d{9}$";
                while (!phone.matches(phonePattern)){
                    System.out.println("Please enter a valid phone number:");
                    phone = in.nextLine();
                }
                System.out.println("Enter address:");
                String address = in.nextLine();
                User user = new User(username, password, email, phone, address);
                shop.addUser(user);
                System.out.println("Your account has created successfully!");
                return username;
        }
        return null;
    }
    public static String login(Shop shop, int choice){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter name:");
        String username = in.nextLine();
        switch (choice){
            case 1:
                if (shop.dossAdminExist(username)){
                    System.out.println("Please enter password:");
                    String password = in.nextLine();
                    if (shop.isAdminPasswordCorrect(username, password)){
                        return username;
                    }
                    else{
                        System.out.println("Password incorrect.");
                        return null;
                    }
                }
                else{
                    System.out.println("Username not found.");
                }
                break;
            case 2:
                if (shop.doesSellerExist(username)){
                    System.out.println("Please enter password:");
                    String password = in.nextLine();
                    if (shop.isSellerPasswordCorrect(username, password)){
                        if (shop.findSellerEnterRequest(new Seller(username, password)).equals("authorized")){
                            return username;
                        }
                        else if (shop.findSellerEnterRequest(new Seller(username, password)).equals("unauthorized")){
                            System.out.println("Request has been rejected by admins, You're not allowed to sell products.");
                        }
                        else {
                            System.out.println("Request hasn't been reviewed by admins, please check again in a few moments.");
                        }
                    }
                    else {
                        System.out.println("Password incorrect");
                    }
                }
                else{
                    System.out.println("Username not found.");
                }
                break;
            case 3:
                if (shop.doesUserExist(username)){
                    System.out.println("Please enter password:");
                    String password = in.nextLine();
                    if (shop.isUserPasswordCorrect(username, password)){
                        return username;
                    }
                    else {
                        System.out.println("Password incorrect");
                    }
                }
                else{
                    System.out.println("Username not found.");
                }
        }
        return null;

    }
    public static void addAdmin(Shop shop){
        Scanner in = new Scanner(System.in);
        Admin newAdmin = new Admin();
        System.out.println("Username:");
        String username = in.nextLine();
        while (shop.doesUsernameExist(username)){
            System.out.println("Username is already taken, please try again:");
            username = in.nextLine();
        }
        newAdmin.setName(username);
        System.out.println("Password:");
        String password = in.nextLine();
        String passPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        while (!password.matches(passPattern)){
            System.err.println("Password must contain at least eight characters (at least one uppercase and lowercase letter and one number)");
            System.out.println("please try again:");
            password = in.nextLine();
        }
        newAdmin.setPassword(password);
        System.out.println("Email:");
        String email = in.nextLine();
        String emailPattern = "^[a-zA-z0-9_.]+@[a-zA-Z0-9]+\\.[a-zA-Z]{3}$";
        while (!email.matches(emailPattern)){
            System.out.println("Please enter a valid email address:");
            email = in.nextLine();
        }
        newAdmin.setEmail(email);
        shop.addAdmin(newAdmin);
        System.out.println("Admin added successfully");
    }
}
