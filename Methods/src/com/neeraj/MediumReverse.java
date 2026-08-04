package com.neeraj;

public class MediumReverse {
    public static void main(String[] args) {
        int x = -2147483412;
        int rev = 0;
        while (x != 0) {
            int num = x;
            int rem = num % 10;
            System.out.println(rem);
            System.out.println(rev);
            if (rev > Integer.MAX_VALUE / 10 ||
                    (rev == Integer.MAX_VALUE / 10 && rem > 7)) {
                rev = 0;
                break;
            }

            if (rev < Integer.MIN_VALUE / 10 ||
                    (rev == Integer.MIN_VALUE / 10 && rem < -8)) {
                rev = 0;
                break;
            }
            System.out.println(rev);
            rev = rev*10 + rem ;
            x = x/10;
        }

        System.out.println(rev);
    }
}
