package org.example;

import java.util.Scanner;

public class GetProductInfo {
    public static Phone phone(String name, String price, int stack){
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
}
