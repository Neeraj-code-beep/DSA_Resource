package com.neeraj;

import java.util.Scanner;

public class Ques1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float PI = 3.14f;
        System.out.println("Enter the radius of the circle :-");
        float r = in.nextFloat();

        float area = PI*r*r;

        System.out.println(area);
    }

}
