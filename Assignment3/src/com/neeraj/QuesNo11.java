package com.neeraj;

import java.util.Scanner;

public class QuesNo11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the lenght of the rectangle :- ");
        float lenght = in.nextFloat();

        System.out.println("Enter the breath of the rectangle :- ");
        float breath = in.nextFloat();

        float Area = 2*(lenght + breath);

        System.out.printf("The perimeter of the rectangle is %.2f", Area);
    }
}
