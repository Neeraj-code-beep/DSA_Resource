package com.neeraj;

import java.util.Scanner;

public class QuesNo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the radius:- ");
        double radius = in.nextDouble();

        double circumference = circumference(radius);
        double area = area(radius);

        System.out.printf("The Circumference of the circle is %.2f.\n", circumference);
        System.out.printf("The Circumference of the circle is %.2f.", area);
    }
    static double circumference(double radius) {
        double PI = 3.14;
        double total = 2*PI*radius;
        return total;
    }
    static double area(double radius) {
        double PI = 3.14;
        double total = PI*radius*radius;
        return total;
    }
}
