package com.neeraj;

import java.util.Scanner;

public class QuesNo13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side lenght fo the rhombus :- ");
        double sideL = in.nextDouble();
        double perimeter = 4 * sideL;

        System.out.printf("The perimeter of Rhombus = %.2f" , perimeter);
    }
}
