package com.neeraj;

public class Overloading {
    public static void main(String[] args) {
//        fun(65);
//        fun("Neeraj Mishra");
    }
    static void fun(int a) {
        System.out.println("First One");
        System.out.println(a);
    }

    static void fun(String name) {
        System.out.println("Second one");
        System.out.println(name);
    }

}
