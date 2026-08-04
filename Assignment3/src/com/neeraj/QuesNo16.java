package com.neeraj;

import java.util.Scanner;

public class QuesNo16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double PI = 3.14;
        System.out.println("Enter the radius of cone :- ");
        double radius = in.nextDouble();

        System.out.println("Enter the height of cone :- ");
        double height = in.nextDouble();

        double Volume = (PI*radius*radius*height)/3;

        System.out.printf("The Volume of cone = %.2f", Volume);


    }
}
