package com.neeraj;

import java.util.Scanner;

public class QuesNo12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of your choice :- ");
        int num = in.nextInt();
        int original = num;
        int sum = 0;

        for (int i =1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (original == sum) {
            System.out.printf("%d is an Perfect Number.",original);
        } else {
            System.out.printf("%d is not an Perfect Number.",original);
        }

    }
}
