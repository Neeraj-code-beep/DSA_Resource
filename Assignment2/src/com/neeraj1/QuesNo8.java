package com.neeraj1;

import java.util.Scanner;

public class QuesNo8 {
    public static void main(String[] args) {

        // For checking that any number is palindrome or not.

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int original = num;
        int reversed = 0;
        boolean palindrome = true;

        for (int i = 0; num > 0; i++) {

            int digit = num%10;
            reversed = reversed*10 + digit;

            num = num/10;
        }

        if(original == reversed) {
            palindrome = true;
        } else {
            palindrome = false;
        }

        if (palindrome) {
            System.out.println("It's an palindrome number.");
        } else {
            System.out.println("It's not an palindrome number.");
        }
//
        // Now checking that any String is palindrome or not.

//        Scanner in = new Scanner(System.in);
//
//        System.out.printf("Enter the line or word you want :- ");
//        String str = in.nextLine();
//        int n = str.length();
//        boolean palindrome = true;
//
//        for (int i = 0; i < n/2; i++) {
//            if (str.charAt(i) != str.charAt(n - 1 - i)) {
//                palindrome = false;
//            }
//        }
//
//        if (palindrome) {
//            System.out.println("The given String is an palindrome");
//        } else {
//            System.out.println("The given String is not an palindrome");
//        }
    }
}

