package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class User extends Account {
    private String email;
    private String phone;
    private String address;

    public User(String name, String password, String email, String phone, String address) {
        super(name, password);
        this.email = email;
        this.phone = phone;
        this.address = address;
    }
    private double wallet = 0.0;
    HashMap<Product, Integer> cart = new HashMap<>();
    ArrayList<Order> orders = new ArrayList<>();
    ArrayList<Product> purchased = new ArrayList<>();

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public double getWallet() {
        return wallet;
    }
    public void setWallet(double wallet) {
        this.wallet = wallet;
    }

    public void addToWallet(double amount){
        wallet += amount;
    }
    public void viewCart(){
        for (Map.Entry<Product, Integer> mapElement : cart.entrySet()){
            Product product = mapElement.getKey();
            int value = (mapElement.getValue());
            System.out.println(product + " number: " + value);
        }
    }
    public boolean addToCart(Product product, int number){
        if (product.getStack() < number){
            return false;
        }
        cart.put(product, number);
        return true;
    }
    public boolean removeFromCart(Product product, int number){
        for (Map.Entry<Product, Integer> mapElement : cart.entrySet()){
            Product searchPro = mapElement.getKey();
            int value = (mapElement.getValue());
            if (product.equals(searchPro) && number < value){
                cart.replace(product, value - number);
                return true;
            } else if (product.equals(searchPro) && value == number) {
                cart.remove(product);
                return true;
            }
        }
        return false;


    }
    public boolean updateCart(Product product, int number){
        for (Map.Entry<Product, Integer> mapElement : cart.entrySet()){
            Product searchPro = mapElement.getKey();
            int value = (mapElement.getValue());
            if (product.equals(searchPro)){
                if (product.getStack() < number){
                    return false;
                }
                cart.replace(product, number);
                return true;
            }
        }
        return false;
    }
    public double getCartPrice(){
        double t = 0;
        for (Map.Entry<Product, Integer> mapElement : cart.entrySet()){
            Product searchPro = mapElement.getKey();
            int value = (mapElement.getValue());
            t += searchPro.getPrice() * value;
        }
        return t;
    }
    public void addOrder(User user){
        orders.add(new Order(getCartPrice(), allSellers(), user, cart));
    }
    public ArrayList<Seller> allSellers(){
        ArrayList<Seller> allSellers = new ArrayList<>();
        for (Map.Entry<Product, Integer> mapElement : cart.entrySet()){
            Product searchPro = mapElement.getKey();
            allSellers.add(searchPro.getSeller());
        }
        return allSellers;
    }

    @Override
    public String toString() {
        return  super.toString() + " User{" +
                "email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", wallet=" + wallet +
                "}";
    }
}
