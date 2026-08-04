package com.neeraj;

import java.util.Scanner;

public class QuesNo23 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of your choice :- ");
        int num = in.nextInt();

        System.out.printf("The Factors of %d are :-\n" ,num);

        for (int i = 1; i < num; i++) {
            if(num%i == 0) {
                System.out.println(i);
            }
        }
    }
}
