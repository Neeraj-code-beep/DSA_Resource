package com.neeraj;

import java.util.Scanner;

public class QuesNo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How may numbers average you want :- ");
        int n = in.nextInt();
        float average = 0;
        float sum = 0;
        int count = 0;

        do {
            System.out.println("Enter the number :-");
            int number = in.nextInt();
            sum += number;
            count++;
        } while (count < n);
        average = (sum/count);

        System.out.printf("The average of %d numbers is %2f",n,average);
    }
}
