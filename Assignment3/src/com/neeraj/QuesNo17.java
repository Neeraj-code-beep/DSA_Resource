package com.neeraj;

import java.util.Scanner;

public class QuesNo17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius of the circle :- ");
        double radius = in.nextDouble();
        double PI = 3.14;
        double Volume = (4*PI*radius*radius*radius)/3;

        System.out.printf("The Volume of Sphere = %.2f ", Volume);

    }
}
