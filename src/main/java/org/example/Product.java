package org.example;

import java.util.ArrayList;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private int stack;
    private Seller seller;
    private ArrayList<String> comments = new ArrayList<>();
    public Product(){}
    public Product(String name, double price, int stack) {
        this.name = name;
        this.price = price;
        this.stack = stack;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public void addComment(String comment){
        comments.add(comment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && stack == product.stack && Objects.equals(name, product.name) && Objects.equals(comments, product.comments);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", stack=" + stack +
                ", comments=" + comments +
                '}';
    }

    public void addToStack(int number){
        stack += number;
    }
}
