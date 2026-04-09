package com.deepu;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    class myRuntimeException extends RuntimeException{
        public myRuntimeException(String message){
            super(message);
        }
    }
    public static void main(String[] args) {
        try {
            File file = new File("data.txt");  // file name
            Scanner sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

            sc.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
            System.out.println("Error: " + e.getMessage());
        }
    }
}