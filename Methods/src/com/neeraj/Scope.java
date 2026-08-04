package com.neeraj;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        String name = "Dheeraj";

        {
            //    int a = 78; // already intialised outside the block in the same..
            a = 100;  // reassign the origin ref variable to some other value..
            System.out.println(a);
            int c = 99;
            name = "Neeraj";
            System.out.println(name);
            // values intialised in this block , will remain in block..
        }
        int c = 999;
        System.out.println(a);
        System.out.println(name);
        // System.out.println(c);  // cannot use outside the block..

        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
        }
        System.out.println();
    }

    static void random(int marks)  {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
