package com.neeraj1;

import java.util.Scanner;

public class QuesNo3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the principal amount :- ");
        int P = in.nextInt(); // Amount in Rs..

        System.out.println("Enter the duration :- ");
        int T = in.nextInt(); // Time in years..

        System.out.println("Enter the interest rate :- ");
        int R = in.nextInt(); // Interest in percentage..

        int SI = (P*R*T)/100;

        System.out.println("The simple interest :- " + SI);


    }
}
