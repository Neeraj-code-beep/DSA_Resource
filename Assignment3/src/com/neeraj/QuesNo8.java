package com.neeraj;

import java.util.Scanner;

public class QuesNo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle :- ");
        double radius = in.nextFloat();
        double perimeter = (2*3.14)*radius;

        System.out.printf("Perimeter of Circle = %.2f", perimeter);
    }
}
