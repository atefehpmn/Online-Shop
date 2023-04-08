package org.example;

public class Book extends Product{
    String author;
    int yearPublished;

    public Book(String name, double price, int stack, String author, int yearPublished) {
        super(name, price, stack);
        this.author = author;
        this.yearPublished = yearPublished;
    }
}
