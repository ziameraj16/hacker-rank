package com.zia.hashmap.ransomnote;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int m = s.nextInt();
        int n = s.nextInt();
        String[] magazine = new String[m];
        for (int i = 0; i < m; i++) {
            magazine[i] = s.next();
        }
        String[] note = new String[n];
        for (int i = 0; i < n; i++) {
            note[i] = s.next();
        }
        checkMagazine(magazine, note);
    }

    static void checkMagazine(String[] magazine, String[] note) {
        Map<String, Integer> magazineMap = new HashMap(magazine.length);
        for(String m : magazine) {
            if (magazineMap.containsKey(m)) {
                magazineMap.put(m, magazineMap.get(m) + 1);
            } else {
                magazineMap.put(m, 1);
            }
        }
        boolean present = true;
        for (String n : note) {
            if (magazineMap.containsKey(n) && magazineMap.get(n) > 0) {
                magazineMap.put(n, magazineMap.get(n) - 1);
            } else {
                present = false;
                break;
            }
        }
        if (present) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
