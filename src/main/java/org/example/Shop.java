package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Shop {
    private String name;
    private String web;
    private int phone;
    private double profit;
    private ArrayList<Admin> admins = new ArrayList<>(Arrays.asList(new Admin("admin", "admin", "admin@gmail.com")));
    private ArrayList<Seller> sellers = new ArrayList<>();
    private ArrayList<User> users = new ArrayList<>();
    private ArrayList<Product> products;
    private ArrayList<Order> orders;
    private HashMap<Seller, String> sellerEnterRequest = new HashMap<>();
    private ArrayList<Seller> sellerReq = new ArrayList<>();
    private HashMap<User, Double> userRequest = new HashMap<>();
    private ArrayList<User> userReq = new ArrayList<>();
    public Shop(){};

    public void addAdmin(Admin newAdmin){
        admins.add(newAdmin);
    }
    public void addUser(User user){
        users.add(user);
    }
    public void addSeller(Seller seller){
        sellers.add(seller);
    }
    public void addProduct(Product product){
        products.add(product);
    }
    public boolean doesUsernameExist(String username){
        for (User user : users){
            if (user.getName().equals(username)){
                return true;
            }
        }
        for (Admin admin : admins){
            if (admin.getName().equals(username)){
                return true;
            }
        }
        for (Seller seller : sellers){
            if (seller.getName().equals(username)){
                return true;
            }
        }
        return false;
    }
    public boolean doesUserExist(String username){
        for (User user : users){
            if (user.getName().equals(username)){
                return true;
            }
        }
        return false;
    }
    public boolean dossAdminExist(String username){
        for (Admin admin : admins){
            if (admin.getName().equals(username)){
                return true;
            }
        }
        return false;
    }
    public boolean doesSellerExist(String username){
        for (Seller seller : sellers){
            if (seller.getName().equals(username)){
                return true;
            }
        }
        return false;
    }
    public boolean isUserPasswordCorrect(String username, String password){
        for (User user : users){
            if (user.getName().equals(username) && user.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public boolean isSellerPasswordCorrect(String username, String password){
        for (Seller seller : sellers){
            if (seller.getName().equals(username) && seller.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public boolean isAdminPasswordCorrect(String username, String password){
        for (Admin admin : admins){
            if (admin.getName().equals(username) && admin.getPassword().equals(password)){
                return true;
            }
        }
        return false;
    }
    public Admin findAdmin(String username){
        for (Admin admin : admins){
            if (admin.getName().equals(username)){
                return admin;
            }
        }
        return null;
    }
    public Seller findSeller(String username){
        for (Seller seller : sellers){
            if (seller.getName().equals(username)){
                return seller;
            }
        }
        return null;
    }
    public User findUser(String username){
        for (User user : users){
            if (user.getName().equals(username)){
                return user;
            }
        }
        return null;
    }
    public boolean viewSellerRequests(){
        int n = 1;
        for (Map.Entry<Seller, String> mapElement : sellerEnterRequest.entrySet()){
            Seller seller = mapElement.getKey();
            String status = (mapElement.getValue());
            if (!status.equals("authorized")) {
                System.out.println(n + ". " + seller + " status: " + status);
                n++;
            }
        }
        return n != 1;
    }
    public void viewUserRequests(){
        for (int i = 0 ; i < userReq.size(); i++) {
            System.out.print(i + 1);
            System.out.println(". " + userReq.get(i) + " amount: " + userRequest.get(userReq.get(i)));
        }
    }
    public void acceptUserRequest(int number){
        number--;
        userReq.get(number).addToWallet(userRequest.get(userReq.get(number)));
        userRequest.remove(userReq.get(number), userRequest.get(userReq.get(number)));
        userReq.remove(number);
        System.out.println(userReq.size());
    }
    public boolean doesUserReqExist(){
        return userReq.size()!=0;
    }
    public void addUserRequest(User user, double amount){
        userRequest.put(user, amount);
        userReq.add(user);
    }
    public void setSellerEnterRequest(Seller seller){
        sellerEnterRequest.put(seller, "notChecked");
    }
    public void confirmSellerEnterRequest(int number){
        sellerEnterRequest.put(sellerReq.get(--number), "authorized");
    }
    public void rejectSellerEnterRequest(Seller seller){
        sellerEnterRequest.put(seller, "unauthorized");
    }
    public String findSellerEnterRequest(Seller seller){
        return sellerEnterRequest.get(seller);
    }
    public void viewUsers(){
        for (int i = 0; i < users.size(); i++){
            System.out.print(i + 1);
            System.out.println(" " + users.get(i));
        }
    }
    public void addToProfit(double amount){
        profit += amount;
    }
}
