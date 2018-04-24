package com.zia.viraladvertising;

import java.util.Scanner;

public class ViralAdvertising {

    static int viralAdvertising(int n) {
        int cumulative = 2;
        int shared = 5;
        int liked = Double.valueOf(Math.floor(shared/2)).intValue();
        for (int i = 2; i <= n; i++) {
            shared = liked * 3;
            liked = Double.valueOf(Math.floor(shared/2)).intValue();
            cumulative = cumulative + liked;
        }
        return cumulative;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int result = viralAdvertising(n);
        System.out.println(result);
        in.close();
    }
}
