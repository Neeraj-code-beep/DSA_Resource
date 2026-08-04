package com.neeraj;

import java.util.Scanner;

public class QuesNo7 {
    public static void main(String[] args) {
        // Checking that entered number is armstrong or not;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of your choice :- ");
        int num = in.nextInt();
        int original = num;
        int temp = num;
        int sum = 0;
        int digits = String.valueOf(num).length();

        for (int i = 0; temp > 0; i++) {
            int rem = temp%10;
            int power = 1;
            for (int j=0; j <digits ; j++) {
                power *= rem;
            }
            sum += power;
            temp = temp/10;
        }
        if (sum == original) {
            System.out.printf("%d is an Armstrong Number.",original);
        } else {
            System.out.printf("%d is not an Armstrong Number.",original);
        }
    }
}
