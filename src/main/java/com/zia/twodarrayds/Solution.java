package com.zia.twodarrayds;

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int[][] arr = new int[6][6];
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        System.out.println(hourglassSum(arr));

    }

    static int hourglassSum(int[][] arr) {
        int maxSum = 0;
        for (int i = 0; i < 4; i++) {
            int sum;
            for (int j = 0 ; j < 4; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                if (sum > maxSum) {
                    maxSum = sum;
                }
            }
        }

        return maxSum;


    }
}
