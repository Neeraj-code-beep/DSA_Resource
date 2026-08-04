package com.neeraj;

import java.util.Scanner;

public class QuesNo10 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter the first adjacent side of the parallelogram :- ");
            float a = in.nextFloat();

            System.out.println("Enter the second adjacent side of the parallelogram :- ");
            float b = in.nextFloat();

            float Area = 2*(a + b);

            System.out.printf("The perimeter of the parallelogram is %.2f", Area);
        }
    }

