package com.neeraj;

import java.util.Scanner;

public class QuesNo24 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num;
        int sum = 0;

        do {
             System.out.println("Enter Number (0 to stops) :-");
             num = in.nextInt();
             sum += num;

        } while(num != 0);

        System.out.println(sum);
    }
}
