package com.neeraj1;

import java.util.Scanner;

public class QuesNo7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number till fibonacci series you need :-");
        int n = in.nextInt();
        int first = 0;
        int next = 1;


        System.out.println(first);
        for (int i=0; i < n; i++) {
            System.out.println(next);
            int temp = next;
            next = first + next;
            first = temp;
        }

    }
}
