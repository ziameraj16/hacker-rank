package com.zia.beautifultriplet;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {

    // Complete the beautifulTriplets function below.
    static int beautifulTriplets(int d, int[] arr) {

        final List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());

        int count = 0;
        for(int i = 0; i < arr.length -2; i++) {
            if (list.contains(arr[i] + d) && list.contains(arr[i] + d + d)) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int d = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println(beautifulTriplets(d, arr));
    }


}
