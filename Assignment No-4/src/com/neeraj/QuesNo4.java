package com.neeraj;

import java.util.Scanner;

public class QuesNo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:- ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number:- ");
        int num2 = in.nextInt();

        int sum = add(num1, num2);
        System.out.printf("The sum is %d.", sum);
    }
    static int add(int num1, int num2) {
        int add = num1 + num2;
        return add;
    }
}
