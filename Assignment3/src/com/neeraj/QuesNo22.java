package com.neeraj;

import java.util.Scanner;

public class QuesNo22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of your choice :- ");
        int n = in.nextInt();

        int n1 = n;
        int n2 = n;
        int sum = 0;
        int product = 1;
        int difference = 0;

        for(int i =0; n1 > 0; i++) {
            int digit1 = n1 % 10;

            sum += digit1;
            n1 = n1/10;
        }

        System.out.println(sum);

        for (int j = 0; n2 >0; j++) {
            int digit2 = n2%10;


            product *= digit2;
            n2 = n2/10;
            System.out.println(product);
        }

        difference = product - sum;

        System.out.println(product);
    }
}
