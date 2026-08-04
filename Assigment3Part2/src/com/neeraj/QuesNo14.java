package com.neeraj;

import java.util.Scanner;

public class QuesNo14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the year of your choice :- ");
        int year = in.nextInt();

        if(year%4 == 0 && year%100 != 0 || year%400 ==0) {
            System.out.printf("%d is an leap year.",year);
        } else {
            System.out.printf("%d is not an leap year.",year);
        }
    }
}
