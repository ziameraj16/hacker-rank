package com.zia.algorithm.search.icecreamparlor;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        for (int i = 0; i < cases; i++) {
            int money = s.nextInt();
            int size = s.nextInt();
            int[] arr = new int[size];
            for (int j = 0; j < size; j++) {
                arr[j] = s.nextInt();
            }
            Arrays.stream(icecreamParlor(money, arr)).forEach(System.out::println);
        }

    }

    static int[] icecreamParlor(int m, int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == m) {
                    return new int[] {i+1, j+1};
                }
            }
        }
        return new int[] {0,0};
    }
}
