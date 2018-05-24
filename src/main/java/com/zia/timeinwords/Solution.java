package com.zia.timeinwords;

import java.util.Scanner;

public class Solution {

    static String hour_mint[] = {
            "",
            "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
            "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine"
    };

    static String timeInWords(int h, int m) {
        String value = "";
        String d = m > 9 ? "s" : "";
        if (m == 0) {
            value = hour_mint[h] + " o' clock";
        } else if (m == 30) {
            value = "half past " + hour_mint[h];
        } else if (m == 15) {
            value = "quarter past " + hour_mint[h];
        } else if (m == 45) {
            value = "quarter to " + hour_mint[h+1];
        } else if (m < 30) {
            value = hour_mint[m] + " minute" + d + " past " + hour_mint[h];
        } else {
            value = hour_mint[60 - m] + " minute" + d + " to " + hour_mint[h+1];
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println(timeInWords(h, m));
        scanner.close();
    }
}
