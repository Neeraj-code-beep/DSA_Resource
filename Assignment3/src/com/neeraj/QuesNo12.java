package com.neeraj;

import java.util.Scanner;

public class QuesNo12 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        System.out.println("Enter the side of square :-");
        double side = in.nextDouble();
        double perimeter =  4* side;

        System.out.printf("The Perimeter of Square = %.2f ", perimeter);
    }
}
