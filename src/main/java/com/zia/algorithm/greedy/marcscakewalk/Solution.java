package com.zia.algorithm.greedy.marcscakewalk;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {
        Arrays.sort(calorie);
        double sum = 0;
        for (int i = calorie.length - 1; i >= 0; i--) {
            sum = sum + (Math.pow(Integer.valueOf(2).doubleValue(), Integer.valueOf(calorie.length - 1- i).doubleValue()) * calorie[i]);
        }
        return Double.valueOf(sum).longValue();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = s.nextInt();
        }
        final long l = marcsCakewalk(arr);
        System.out.println(l);
    }
}
