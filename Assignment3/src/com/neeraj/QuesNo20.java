package com.neeraj;

import java.util.Scanner;

public class QuesNo20 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the side of the cube :- ");
        double side = in.nextDouble();
        double SFA = 6*side*side;

        System.out.printf("SFA of the cube = %2f",SFA);
    }
}
