package com.neeraj;

import java.util.ArrayList;

public class PhonePad {

    public static void main(String[] args) {

        ArrayList<String> ans = pad("", "23");

        System.out.println(ans);
    }

    static ArrayList<String> pad(String p, String up) {

        if (up.isEmpty()) {

            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        int digit = up.charAt(0) - '0';

        String[] mapping = {
                "", "",
                "abc",
                "def",
                "ghi",
                "jkl",
                "mno",
                "pqrs",
                "tuv",
                "wxyz"
        };

        String letters = mapping[digit];

        ArrayList<String> ans = new ArrayList<>();

        for (int i = 0; i < letters.length(); i++) {

            char ch = letters.charAt(i);

            ans.addAll(
                    pad(p + ch, up.substring(1))
            );
        }

        return ans;
    }
}
