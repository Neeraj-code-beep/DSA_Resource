package com.neeraj;

import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
//
//        if(a > b &&  a > c) {
//            System.out.println("a is the greatest");
//        } else if (b > a  && b > c) {
//            System.out.println("b is the greatest");
//        } else if (c > a  && c > b) {
//            System.out.println(c +" is the greatest");
//        }  else {
//            System.out.println("Bro you're doing so mistake that's why you did not find your answer");
//        }

        // Q: Find the largest of the 3 numbers.
//
//        int max = a;
//        if (b > max) {
//            max = b;
//        } if (c > max) {
//            max = c;
//        }

        int max = Math.max(c, Math.max(a, b));

        System.out.println(max);
    }

}
