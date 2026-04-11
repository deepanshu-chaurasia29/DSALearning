package com.deepu;

import java.util.HashMap;
import java.util.Scanner;

public class GroceryShop {
    static Scanner sc = new Scanner(System.in);

    static void main() {
        String[] items = {
                "milk", "bread", "rice", "sugar", "salt",
                "tea", "coffee", "oil", "eggs", "butter"
        };
        float[] price = {
                50, 30, 60, 40, 20,
                100, 120, 150, 70, 90
        };

        while(true){
            System.out.println("type 1 to buy groceries");
            System.out.println("type exit to close groceries");

            String ip1 = sc.next();
            if(ip1.equalsIgnoreCase("exit")){
                break;
            }
            else if(ip1.equalsIgnoreCase("1")){
                float totalBill = purchases(items,price);
                System.out.println("Total bill : " + totalBill);
            }
        }
    }
    static float purchases(String[] items, float[] price){
        float bill = 0;
        while(true){
            System.out.println("Enter item name ( or complete to finish ) ");
            String ip2 = sc.next();
            if(ip2.equalsIgnoreCase("complete")){
                break;
            }

            boolean found = false;
            // bas ek hee baar chalega jab item match hoga
            for(int i=0; i< items.length; i++){
                if(ip2.equalsIgnoreCase(items[i])){
                    found = true;
                    System.out.println("Enter Quantity: ");
                    int quantity = sc.nextInt();
                    bill += quantity * price[i];
                    break;
                }
            }

            if(!found){
                System.out.println("Item not found");
            }

        }
        return bill;
    }
}
