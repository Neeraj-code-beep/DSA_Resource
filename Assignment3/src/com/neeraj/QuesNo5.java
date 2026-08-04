package com.neeraj;

import java.util.Scanner;

public class QuesNo5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base of the rectangle :- ");
        float base = in.nextFloat();

        System.out.println("Enter the height of the rectangle :- ");
        float height = in.nextFloat();

        float Area = (base * height);

        System.out.printf("The area of the rectangle is %.2f", Area);
    }
}
