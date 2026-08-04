package com.neeraj1;

import java.util.Scanner;

public class QuesNo6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the currency in rupees :- ");
        float currency = in.nextFloat(); // Amount in the INR.
        float exchangeRate = 83;  // value of 1 usd according to current market rate.
        float USD = currency / exchangeRate;  // USD = (INR)/ (Exchange Rate)

        System.out.printf("Your Entered currency is equal to %.2f USD dollars.", USD );

    }
}
