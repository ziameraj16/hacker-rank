package com.zia.array.leftrotation;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int rotation = s.nextInt();
        int[] arr = new int[l];
        for (int i = 0; i < l; i++) {
            arr[i] = s.nextInt();
        }
        int[] ints = rotLeft(arr, rotation);
        Arrays.stream(ints).forEach(System.out::println);

    }

    static int[] rotLeft(int[] a, int d) {
        int[] array = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            array[(i + a.length - d) % a.length] = a[i];
        }
        return array;
    }
}
