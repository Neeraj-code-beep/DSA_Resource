package com.neeraj;

import java.util.Scanner;

public class QuesNo21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number till you need the fibonacci series :- ");
        int n = in.nextInt();
        int a = 0;
        int b = 1;

        System.out.println(a);
        for (int i = 0; i < n; i++) {
            int temp = b;
            b = b + a;
            a = temp;

            System.out.println(b);
        }
    }
}
