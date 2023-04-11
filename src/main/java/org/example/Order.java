package org.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

public class Order {
    private double totalPrice;
    private ArrayList<Seller> sellers = new ArrayList<>();
    private User buyer;
    private HashMap<Product, Integer> cart = new HashMap<>();

    public Order(double totalPrice, ArrayList<Seller> sellers, User buyer, HashMap<Product, Integer> cart) {
        this.totalPrice = totalPrice;
        this.sellers = sellers;
        this.buyer = buyer;
        this.cart = cart;
    }

    public void addSeller(Seller seller){
        sellers.add(seller);
    }
}
