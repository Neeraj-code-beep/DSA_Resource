package com.neeraj;

import java.util.Scanner;

public class QuesNo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the total subjects :- ");
        int n = in.nextInt();
        float sum = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter the Subject %d marks :- " , i);
            float marks = in.nextFloat();
            sum += marks;
        }
        float average = (sum/n);
        System.out.printf("Your's Average marks is %.2f",average);
    }
}
