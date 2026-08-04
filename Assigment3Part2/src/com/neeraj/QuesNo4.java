package com.neeraj;

import java.util.Scanner;

public class QuesNo4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of subjects do you had :- ");
        int n = in.nextInt();
        float sum = 0;
        float totalofGPI = 1;
        float totalCredits = 0;

        for (int i = 1; i <= n; i++) {
            System.out.printf("Enter the Subject %d grade points :- ", i);
            int GP = in.nextInt();
            System.out.printf("Enter the Subject %d Credits :- ", i);
            int Credit = in.nextInt();

            totalofGPI = GP*Credit;
            totalCredits += Credit;
            sum += totalofGPI;
        }

        float CGPA = (sum/totalCredits);

        System.out.printf("The CGPA You gainded this Semester is %.2f ", CGPA);
    }
}
