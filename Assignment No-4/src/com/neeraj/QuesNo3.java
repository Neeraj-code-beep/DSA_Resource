package com.neeraj;

import java.util.Scanner;

public class QuesNo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your age:- ");
        int age = in.nextInt();

        String checker = checker(age);
        System.out.printf(checker);
    }
    static String checker(int age) {
        if (age <= 18) {
            return "You are Eligible";
        } else {
            return "You are Not Eligible";
        }
    }
}
