package com.zia.equalizearray;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {

    static int equalizeArray(int[] arr) {
        // Complete this function
        Integer[] integers = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Set<Integer> unique = new HashSet(Arrays.asList(integers));
        int max = 0;
        int curr;
        for (int key : unique) {
            curr = Collections.frequency(Arrays.asList(integers), key);
            if(max < curr){
                max = curr;
            }
        }
        return arr.length - max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = equalizeArray(arr);
        System.out.println(result);
        in.close();
    }
}
