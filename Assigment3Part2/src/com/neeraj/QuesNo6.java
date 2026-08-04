package com.neeraj;

import java.util.Scanner;

public class QuesNo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many numbers sum you want :- ");
        int n = in.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter Number %d :- ",i);
            int num = in.nextInt();
            sum += num;
        }

        System.out.printf("The sum of %d number have you entered is %d", n , sum);
    }
}
