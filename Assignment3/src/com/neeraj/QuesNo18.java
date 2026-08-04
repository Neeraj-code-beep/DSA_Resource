package com.neeraj;

import java.util.Scanner;

public class QuesNo18 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base area :- ");
        double BaseArea = in.nextDouble();

        System.out.println("Enter the height of the Pyramid :- ");
        double height = in.nextDouble();

        double Volume = (BaseArea*height)/3;

        System.out.printf("The Volume of the pyramid = %2f ", Volume);

    }
}
