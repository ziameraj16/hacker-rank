package com.zia.countingvalley;

import java.util.Scanner;

public class CountValley {

    static int countingValleys(String s) {
        int seaLevel = 0;
        int valley = 0;
        boolean b = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'U') {
                seaLevel++;
            } else {
                seaLevel--;
            }
            if (seaLevel == 0) {
                b = false;
            } else if (seaLevel < 0 && !b) {
                valley++;
                b = true;
            }
        }
        return  valley;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int result = countingValleys(s);
        System.out.println(result);
        in.close();
    }

}
