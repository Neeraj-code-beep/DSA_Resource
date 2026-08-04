package com.neeraj;

import java.util.Scanner;

public class QuesNo1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number which factorial you want :- ");
        int num = in.nextInt();
        int factorial = 1;

        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.printf("The factorial of %d is %d.",num , factorial);
    }
}
