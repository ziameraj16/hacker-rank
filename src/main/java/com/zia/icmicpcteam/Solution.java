package com.zia.icmicpcteam;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] acmTeam(String[] topic) {
        // Complete this function
        int max = 0;
        int num = 0;
        for (int i = 0; i < topic.length; i++) {
            for (int j = i+1; j < topic.length; j++) {
                int k = 0;
                int ones = 0;
                while (k < topic[i].length()) {
                    if (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') {
                        ones++;
                    }
                    k++;
                }
                if (ones > max) {
                    max = ones;
                    num = 1;
                } else if (ones == max) {
                    num++;
                }
            }
        }
        return new int[] {max, num};
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        String[] topic = new String[n];
        for(int topic_i = 0; topic_i < n; topic_i++){
            topic[topic_i] = in.next();
        }
        int[] result = acmTeam(topic);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }
}
