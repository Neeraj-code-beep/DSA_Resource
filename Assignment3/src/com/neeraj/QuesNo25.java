package com.neeraj;

import java.util.Scanner;

public class QuesNo25 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int largest =0;
        int num;
        int next = 0;

        do {
            System.out.println("Enter the number(0 to stop) :- ");
            num = in.nextInt();

            if(num > next) {
                largest = num;
            } else if(num < next) {
                largest = next;
            }
            next = num;
        } while(num != 0);

        System.out.printf("The largest number from all the entered numbers is %d",largest);
    }
}
