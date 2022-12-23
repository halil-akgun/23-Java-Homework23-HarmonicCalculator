package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Java ile girilen sayının harmonik serisini bulan program yazacağız.
         */

        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int num = input.nextInt();
        double result = 0;

        for (double i = 1; i <= num; i++) {
            result += (1 / i);
        }

        System.out.println("Result: " + result);

    }
}