package com.neeraj;

import java.util.Scanner;

public class QuesNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number :- ");
        int num = in.nextInt();

        String checker = checker(num);
        System.out.printf("It's an %s number.",checker);
    }
    static String checker(int num) {
        if (num%2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
