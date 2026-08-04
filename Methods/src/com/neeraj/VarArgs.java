package com.neeraj;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        fun(2, 3, 4, 5, 6, 78, 23);
        multiple(2, 5, "Kunal", "Rahul", "Dheeraj");
    }

    // Mixing the arguments and variable arguments..

    static void multiple (int a, int b, String ...v) {  // Variable arguments must be at the last..

    }

    static void fun(int ...v) { // We use that ... for variable arguments..
        System.out.println(Arrays.toString(v));
    }
}
