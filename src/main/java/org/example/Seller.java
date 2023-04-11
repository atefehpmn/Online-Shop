package org.example;

import java.util.ArrayList;

public class Seller extends Account{
    private double wallet = 0.0;
    private ArrayList<Product> products = new ArrayList<>();
    public Seller(String name, String password) {
        super(name, password);
    }
    public void addToWallet(double amount){
        wallet += amount;
    }
    public void addToProducts(Product product){
        products.add(product);
    }
    public void viewProducts(){
        for (Product product : products){
            System.out.println(product);
        }
    }

    public double getWallet() {
        return wallet;
    }

    @Override
    public String toString() {
        return super.toString() + " Seller{" +
                "wallet=" + wallet +
                ", products=" + products +
                "}";
    }
}
