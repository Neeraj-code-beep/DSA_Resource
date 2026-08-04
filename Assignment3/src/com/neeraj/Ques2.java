package com.neeraj;

import java.util.Scanner;

public class Ques2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the base of the triangle :- ");
        float base = in.nextFloat();

        System.out.println("Enter the height of the triangle :- ");
        float height = in.nextFloat();

        float Area = (base*height)/2;

        System.out.printf("The area of the triangle is %.2f", Area);
    }

}
