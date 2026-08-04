package com.neeraj;

import java.util.Scanner;

public class QuesNo15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base area :- ");
        double basearea = in.nextDouble();

        System.out.println("Enter the height :- ");
        double height = in.nextDouble();

        double volume = basearea*height;
        System.out.printf("The Volume of Prism = %.2f", volume);

    }
}
