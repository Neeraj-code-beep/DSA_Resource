package com.neeraj;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Syntax
        ArrayList<Integer> list = new ArrayList<Integer>(10);// mentioning the datatype second time is not mandatory.
//
//        list.add(54);
//        list.add(34);
//        list.add(24);
//        list.add(14);
//        list.add(74);
//        list.add(84);
//
//        System.out.println(list.contains(54));  //contains function tell us that particular element is there in list or not.
//        list.set(0, 99); // set function is for to replace any element 0 is an inexing position and 99 is what element you want to replace.
//        list.remove(2); // remove function is used to remove an element.
//        System.out.println(list);

        // input
        for(int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }

        // get item at any index.
        for (int i = 0; i < 5; i++)  {
            System.out.println(list.get(i)); // pass index here, list[index] syntax will not work here.
        }

        System.out.println(list);
    }
}
