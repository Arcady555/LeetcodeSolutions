package com.parfenov7233.easy;

import java.util.Arrays;

public class Solution8 {
    public static void main(String[] args) {
        Solution8 solution8 = new Solution8();
        int[][] accounts = {{1,5}, {7,3}, {3,5}};
        System.out.println(solution8.maximumWealth(accounts));
    }

    public int maximumWealth(int[][] accounts) {
        int[] arrayOfSums = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            arrayOfSums[i] = sum(accounts[i]);
        }
        Arrays.sort(arrayOfSums);
        return arrayOfSums[arrayOfSums.length - 1];
    }

    private int sum(int[] array) {
        int rsl = 0;
        for (int element : array) {
            rsl += element;
        }
        return rsl;
    }
}
