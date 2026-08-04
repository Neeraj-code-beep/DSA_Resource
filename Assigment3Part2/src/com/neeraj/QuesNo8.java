package com.neeraj;

import java.util.Scanner;

public class QuesNo8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the total numbers of items :- " );
        int n = in.nextInt();
        int factorialofn = 1;
        int factorialofr = 1;
        int factorialofnr = 1;

        System.out.println("Enter the numbers of items to choose or arrange :- ");
        int r = in.nextInt();

        for (int i =1; i <=n; i++) {
            factorialofn *= i;
        }

        for (int j =1; j <=r; j++) {
            factorialofr *= j;
        }
        for (int k = 1; k <= (n-r); k++) {
            factorialofnr *= k;
        }

        int Combinations = (factorialofn)/(factorialofr*factorialofnr);
        int Permutations = (factorialofn)/(factorialofnr);

        System.out.printf("The possible combinations of given n and r = %d\n",Combinations);
        System.out.printf("The possible Permutations of given n and r = %d",Permutations);
    }
}
