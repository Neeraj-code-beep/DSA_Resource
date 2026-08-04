package com.neeraj;

import java.util.Scanner;

public class QuesNo19 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the cylinder :- ");
        double radius = in.nextDouble();

        System.out.println("Enter the height of the cylinder :- ");
        double height = in.nextDouble();
        double PI = 3.14;
        double CFA = 2*PI*radius*height;

        System.out.printf("Curved surface area of the cylinder = %2f ", CFA);

    }
}
