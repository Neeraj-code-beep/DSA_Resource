package com.neeraj1;

import java.util.Scanner;

public class QuesNo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number :- ");
        int num1 = in.nextInt();

        System.out.println("Enter the second number :- ");
        int num2 = in.nextInt();

        if ( num1 > num2) {
            System.out.println("largest Number is " + num1);
        }  else if (num2 > num1) {
            System.out.println("largest Number is " + num2);
        }
    }
}
