package com.neeraj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
          1 2 3
          4 5 6
          7 8 9
         */
        Scanner in = new Scanner(System.in);
//        int[][] arr = new int[3][];  // first one is for row and its mandatory to add.
        // We can also do this directly:-

//        int[][] arr = {
//                {1, 3, 4}, // 0th index
//                {5, 6, 7}, // 1st index
//                {8, 9, 10} // 2nd index  ->  arr2D[2] = {6, 7, 8, 9}
//        };

        int[][] arr = new int[3][3];
        System.out.println(arr.length);  // no of rows
        // Input :-

        for(int row = 0; row < arr.length; row++) {
            // for each col in every row
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] = in.nextInt();
            }
        }
            // Output:-
//            for(int row = 0; row < arr.length; row++) {
//                // for each col in every row
//                for (int col = 0; col < arr[row].length; col++) {
//                    System.out.print(arr[row][col] + " ");
//                }
//                System.out.println();
//        }

        // output (alternate way)
//        for (int row = 0; row < arr.length; row++) {
//            System.out.println(Arrays.toString(arr[row]));
//        }
//
        // one more way
        for(int[] a : arr) {
            System.out.println(Arrays.toString(a));
        }
    }
}
