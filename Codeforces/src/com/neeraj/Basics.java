package com.neeraj;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean isSquare = true;
        System.out.println("Enter the text cases:-");
        int t = in.nextInt();

        for(int i = 1; i <= t; i++) {
            System.out.print("Enter the four integers:- ");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();

            if ( a == b && b == c && c == d)
                System.out.println("Yes");
            else
                System.out.println("NO");
        }

    }
}
