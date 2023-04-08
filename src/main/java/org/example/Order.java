package org.example;

import java.util.ArrayList;
import java.util.Date;

public class Order {
    private Date date;
    private double totalPrice;
    private Seller seller;
    private User buyer;
    private ArrayList<Product> cart;
}
