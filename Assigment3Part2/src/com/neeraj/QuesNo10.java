package com.neeraj;

import java.util.Scanner;

public class QuesNo10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the Number of your Choice :- ");
        int num = in.nextInt();
        int original = num;
        int reversed = 0;

        for (int i =0; num > 0; i++) {
            int digit = num%10;
            reversed = reversed*10 + digit;
            num = num/10;
        }
        if (original == reversed) {
            System.out.printf("%d is an Palindrome Number.",original);
        } else {
            System.out.printf("%d is not an Palindrome Number.",original);
        }
    }
}
