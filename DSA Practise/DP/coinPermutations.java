package DP;

import java.io.*;
import java.util.*;

public class coinPermutations {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int amt = scn.nextInt();

        HashMap<Integer, Integer> dp = new HashMap<>();

        // memoization
        int c = countPermutationsMemoization(arr, amt, dp);
        System.out.println(c);

    }

    public static int countPermutationsMemoization(int[] arr, int amt, HashMap<Integer, Integer> dp) {
        if (amt == 0) {
            return 1;
        } else if (amt < 0) {
            return 0;
        }

        if (dp.containsKey(amt)) {
            return dp.get(amt);
        }

        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            c += countPermutationsMemoization(arr, amt - arr[i], dp);
        }
        dp.put(amt, c);
        return c;

    }
}