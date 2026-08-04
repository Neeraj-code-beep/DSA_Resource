package com.neeraj;

import java.util.Scanner;

public class Ques3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the lenght of the rectangle :- ");
        float lenght = in.nextFloat();

        System.out.println("Enter the breath of the rectangle :- ");
        float breath = in.nextFloat();

        float Area = (lenght + breath);

        System.out.printf("The area of the rectangle is %.2f", Area);
    }
}
