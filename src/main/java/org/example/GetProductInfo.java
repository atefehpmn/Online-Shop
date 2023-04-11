package org.example;

import java.util.Scanner;

public class GetProductInfo {
    public static int kind(){
        Scanner in = new Scanner(System.in);
        System.out.println("Which kind of product do you want to add?");
        System.out.println("1. phone");
        System.out.println("2. laptop");
        System.out.println("3. Shoes");
        System.out.println("4. T-Shirt");
        System.out.println("5. bag");
        System.out.println("6. Book");
        System.out.println("7. Shampoo");
        System.out.println("8. Moisturizer");
        System.out.println("9. Perfume");
        return Integer.parseInt(in.nextLine());
    }
    public static Phone phone(){
        Scanner in = new Scanner(System.in);
        Phone phone = new Phone();
        System.out.println("brand:");
        phone.setBrand(in.nextLine());
        System.out.println("color:");
        phone.setColor(in.nextLine());
        System.out.println("CPU:");
        phone.setCPU(in.nextLine());
        System.out.println("Screen Resolution:");
        phone.setScreenResolution(in.nextLine());
        System.out.println("RAM:");
        phone.setRAM(Integer.parseInt(in.nextLine()));
        System.out.println("Size in inch:");
        phone.setSizeInInch(Double.parseDouble(in.nextLine()));
        System.out.println("Picture Resolution in pixel:");
        phone.setPictureResolution(Double.parseDouble(in.nextLine()));
        return phone;
    }
    public static Laptop laptop(){
        Scanner in = new Scanner(System.in);
        Laptop laptop = new Laptop();
        System.out.println("brand:");
        laptop.setBrand(in.nextLine());
        System.out.println("color:");
        laptop.setColor(in.nextLine());
        System.out.println("CPU:");
        laptop.setCPU(in.nextLine());
        System.out.println("Screen Resolution:");
        laptop.setScreenResolution(in.nextLine());
        System.out.println("RAM:");
        laptop.setRAM(Integer.parseInt(in.nextLine()));
        System.out.println("Size in inch:");
        laptop.setSizeInInch(Double.parseDouble(in.nextLine()));
        System.out.println("GPU:");
        laptop.setGPU(Integer.parseInt(in.nextLine()));
        return laptop;
    }
    public static Shoes shoes(){
        Scanner in = new Scanner(System.in);
        Shoes shoes = new Shoes();
        System.out.println("brand:");
        shoes.setBrand(in.nextLine());
        System.out.println("color:");
        shoes.setColor(in.nextLine());
        System.out.println("Material:");
        shoes.setMaterial(in.nextLine());
        System.out.println("Size:");
        shoes.setSize(Integer.parseInt(in.nextLine()));
        return shoes;
    }
    public static Shirt shirt(){
        Scanner in = new Scanner(System.in);
        Shirt shirt = new Shirt();
        System.out.println("brand:");
        shirt.setBrand(in.nextLine());
        System.out.println("color:");
        shirt.setColor(in.nextLine());
        System.out.println("Material:");
        shirt.setMaterial(in.nextLine());
        System.out.println("Size:");
        shirt.setSize(Integer.parseInt(in.nextLine()));
        System.out.println("Kind(V-neck, polo,..):");
        shirt.setKind(in.nextLine());
        return shirt;
    }
}
