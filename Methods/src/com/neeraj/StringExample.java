package com.neeraj;

public class StringExample {
    public static void main(String[] args)  {
//        String message = greet();
//        System.out.println(message);

        String personalised = myGreet("Neeraj");
        System.out.println(personalised);
    }

    // String function with arguments..
    static String myGreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "How are you";
        return greeting;
    }
}
