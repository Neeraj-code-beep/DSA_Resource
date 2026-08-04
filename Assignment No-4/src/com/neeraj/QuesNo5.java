package com.neeraj;

import java.util.Scanner;

public class QuesNo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:- ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number:- ");
        int num2 = in.nextInt();

        int product = product(num1, num2);
        System.out.printf("The product is %d.", product);
    }
    static int product(int num1, int num2) {
        int product = num1*num2;
        return product;
    }
}
