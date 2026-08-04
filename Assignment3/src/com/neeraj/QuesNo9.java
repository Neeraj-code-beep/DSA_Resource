package com.neeraj;

import java.util.Scanner;

public class QuesNo9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of the triangle :-");
        double side = in.nextDouble();
        double perimeter = 3*side;

        System.out.printf("The perimeter of Equilateral triangle = %.2f", perimeter);
    }
}
