package com.neeraj;

import java.util.Scanner;

public class QuesNo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Input both diagonal of rhombus..
        System.out.print("Enter the first diagonal side of rhombus (a): ");
        double a = in.nextDouble();

        System.out.print("Enter the second diagonal side of rhombus (b): ");
        double b = in.nextDouble();

        // Formula: Area = (b/4) * √(4a² - b²)
        double area = (a * b)/2;

        // Print result up to 2 decimal places
        System.out.printf("Area of Rhombus = %.2f", area);
    }
}
