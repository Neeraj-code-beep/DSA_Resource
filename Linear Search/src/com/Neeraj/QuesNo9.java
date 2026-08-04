package com.Neeraj;

import java.util.Scanner;

public class QuesNo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the start number: ");
        int start = in.nextInt();

        System.out.print("Enter the end number: ");
        int end = in.nextInt();

        System.out.println("Armstrong numbers between " + start + " and " + end + " are:");

        for (int num = start; num <= end; num++) {
            int original = num;
            int sum = 0;
            int digits = String.valueOf(num).length();  // number of digits
            int temp = num;

            while (temp > 0) {
                int digit = temp % 10;
                int power = 1;

                for (int i = 0; i < digits; i++) {  // calculate digit^digits
                    power *= digit;
                }

                sum += power;
                temp /= 10;
            }

            if (sum == original) {
                System.out.println(original);
            }
        }
    }
}

