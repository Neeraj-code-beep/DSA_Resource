package com.Neeraj;

import java.util.Arrays;

import java.util.Arrays; // you also need this import!

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34},
                {18, 12}
        };
        int target = 34;
        int[] ans = Search(arr, target);
        System.out.println(Arrays.toString(ans)); // format of return value {row, col }
    }

    static int[] Search(int[][] arr, int target) {  // <-- fixed return type
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}

