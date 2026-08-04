package com.neeraj;

import java.util.Scanner;

import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input equal side and base
        System.out.print("Enter the length of equal side (a): ");
        double a = in.nextDouble();

        System.out.print("Enter the length of base (b): ");
        double b = in.nextDouble();

        // Formula: Area = (b/4) * √(4a² - b²)
        double area = (b / 4.0) * Math.sqrt((4 * a * a) - (b * b));

        // Print result up to 2 decimal places
        System.out.printf("Area of Isosceles Triangle = %.2f", area);
    }
}

