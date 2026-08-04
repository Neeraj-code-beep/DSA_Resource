package com.Neeraj;

public class SearchInStrings {
    public static void main(String[] args) {
        String name = "Neeraj";
        char target = 'e';
        System.out.println(Search(name, target));
       }
       static boolean Search(String str, char target) {
        if (str.length() == 0) {
            return false;
        }

        for(int i = 0; i < str.length(); i++) {
            if(target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }
}