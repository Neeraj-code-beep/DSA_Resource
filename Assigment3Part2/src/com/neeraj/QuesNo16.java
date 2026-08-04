package com.neeraj;

import java.util.Scanner;

public class QuesNo16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sumofnegative = 0;
        int sumofposieven = 0;
        int sumofposiodd = 0;

        do {
            System.out.println("Enter a number or 0 to stop :-");
            num = in.nextInt();
            if (num < 0) {
                sumofnegative += num;
            } else if (num > 0 && num% 2 == 0) {
                sumofposieven += num;
            } else if(num > 0 && num%2 != 0) {
                sumofposiodd += num;
            }
        } while (num!= 0);

        System.out.printf("The sum of negative numbers entered by you is %d.\n",sumofnegative);
        System.out.printf("The sum of positive even numbers entered by you is %d.\n",sumofposieven);
        System.out.printf("The sum of positive odd numbers entered by you is %d.\n",sumofposiodd);
    }
}
