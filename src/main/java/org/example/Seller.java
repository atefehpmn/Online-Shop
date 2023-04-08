package org.example;

import java.util.ArrayList;

public class Seller extends Account{
    private double wallet = 0.0;
    public ArrayList<Product> products = new ArrayList<>();
    public Seller(String name, String password) {
        super(name, password);
    }
    public void addToWallet(double amount){
        wallet += amount;
    }

    @Override
    public String toString() {
        return super.toString() + " Seller{" +
                "wallet=" + wallet +
                ", products=" + products +
                "}";
    }
}
