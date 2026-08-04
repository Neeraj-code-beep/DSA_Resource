package com.neeraj1;

import java.util.Scanner;

public class QuesNo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number :-");
        int num = in.nextInt();

        if (num % 2 == 0) {
            System.out.println("It's an Even Number");
        } else {
            System.out.println("It's an Odd Number");
        }
    }
}
