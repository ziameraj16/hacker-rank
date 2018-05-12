package com.zia.isfibo;

import java.util.Scanner;

public class Solution {

    static String solve(long n) {
        long first = 0;
        long second = 1;

        while (second <= n){
            if (second == n) {
                return "IsFibo";
            }
            long temp = second;
            second = first + second;
            first = temp;
        }
        return "IsNotFibo";


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        for (int i = 0; i < l; i++) {
            System.out.println(solve(scanner.nextLong()));
        }
        scanner.close();
    }
}
