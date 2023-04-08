package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test {
    public static void main(String[] args){
        /*Electronic phone = new Electronic("s22", 200, 5);
        Electronic laptop = new Electronic("ideapad5", 500, 2);
        User me = new User("atefeh", "1234", "atefehpeimani@gmail.com", "9102473447", "Isfahan");
        if (me.addToCart(phone, 2)){
            System.out.println("yasss");
        }
        else {
            System.out.println("Naaa");
        }
        me.viewCart();
        if(me.removeFromCart(phone, 3)){
            System.out.println("hmmm");
        }
        else {
            System.out.println("nope");
        }
        me.viewCart();
        if (me.updateCart(laptop, 3)){
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
        me.viewCart();*/
        /*Shop shop = new Shop();
        Scanner in = new Scanner(System.in);
        System.out.println("Which kind of account do you want to login as?");
        System.out.println("1. Admin");
        System.out.println("2. Seller");
        System.out.println("3. User");
        int choice = Integer.parseInt(in.nextLine());
        Enter.login(shop, choice);*/
        HashMap<Integer, String> haha = new HashMap<>();
        haha.put(1, "fsf");
        haha.put(5, "sdksjd");
        int n = 0;
        for (Map.Entry<Integer, String> mapElement : haha.entrySet()){
            if (n != 1){
                continue;
            }
            System.out.println(mapElement.getKey());
        }


    }
}