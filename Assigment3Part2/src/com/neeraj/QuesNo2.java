package com.neeraj;

import java.util.Scanner;

public class QuesNo2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Ente the amount of electricity you used this month in units :- ");
        float units = in.nextFloat();
        float rupees = 5;
        float total = 0;

        if (units <= 100) {
            total = units*rupees;
        } else if (units > 100 && units <= 200) {
            units = units - 100;
            rupees = 6;
            total = (100*5) +  units*rupees;
        } else if(units > 200 && units <=300) {
            units = units - 200;
            rupees = 8;
            total = (100*5) + (100*6) + (units*rupees);
        }

        System.out.printf("Your total electricity bill = %2f", total);
    }

}
