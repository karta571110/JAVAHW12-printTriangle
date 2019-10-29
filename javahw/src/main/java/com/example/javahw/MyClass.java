package com.example.javahw;

import java.util.Scanner;

public class MyClass {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int b = scanner.nextInt();
            for (int i = b; i >0; i--) {

                for (int j = b-i; j>0 ; j--) {
                    System.out.print(" ");
                }
                for (int k = i; k >0; k--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
