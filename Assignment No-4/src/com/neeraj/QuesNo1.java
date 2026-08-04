package com.neeraj;

import java.util.Scanner;

public class QuesNo1 {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number:- ");
        int first = in.nextInt();

        System.out.println("Enter the second number:- ");
        int second = in.nextInt();

        System.out.println("Enter the third number:- ");
        int third = in.nextInt();

        int maximum = maximum(first, second, third);
        System.out.printf("The Maximun Number among this three is %d.", maximum);

        System.out.println();

        int minimum = minimum(first, second, third);
        System.out.printf("The Minimun Number among this three is %d.", minimum);
    }

    static int maximum(int first , int second, int third) {
        int max = first;
        if (second > max) {
            max = second;
            if (third > max) {
                max = third;
            }
        }
        return max;
    }

    static int minimum(int first, int second, int third) {
        int min = first;
        if(second < min) {
            min = second;
            if(third < min) {
                min = third;
            }
        }
        return min;
    }
}
