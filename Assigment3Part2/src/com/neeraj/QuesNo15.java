package com.neeraj;

public class QuesNo15 {
    public static void main(String[] args) {
        int augustdays = 31;
        int count = 0;

        for (int i = 1; i <= augustdays; i++) {
            if (i%2 == 0) {
                count++;
            }
        }
        System.out.printf("%d number of days he can go out in the month of August.",count);

    }
}
