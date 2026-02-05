package com.deepu.basics.mix;


import java.util.ArrayList;
import java.util.Scanner;

public class Multidimentional_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Creating arraylist indise the arraylist just like a multidimentional array.
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        //Creating arraylist inside the arraylist
        for (int i = 0; i <3 ; i++) {
            list.add(new ArrayList<>());  // it will create 3 arraylist inside the main arraylist
        }

        // filling data inside the arraylist
        System.out.println("Enter elements you want to store inside the arraylist of arraylist :");
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < 2 ; j++) {
                list.get(i).add(sc.nextInt());  // get(i) used to access the arraylists created inside the arraylist so that .add() can add elements into it
            }
//            System.out.println();
        }

        System.out.println(list);
    }
}
