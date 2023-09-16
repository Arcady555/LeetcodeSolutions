package com.parfenov7233.easy;

import java.util.*;

/**
 * You are given an m x n binary matrix mat of 1's (representing soldiers) and 0's (representing civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.
 *
 * A row i is weaker than a row j if one of the following is true:
 *
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest to strongest.
 */

public class Solution7 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int[][] mat = {
                {1,1,0,0,0},
                {1,1,1,1,0},
                {1,0,0,0,0},
                {1,1,0,0,0},
                {1,1,1,1,1}
        };
        int[] rsl = solution7.kWeakestRows(mat, 3);
        for (int element: rsl) {
            System.out.print(element + " ");
        }
    }
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] rsl = new int[k];
        int[] rslGross = sort(mat);
        System.arraycopy(rslGross, 0, rsl, 0, k);
        return rsl;
    }

    private int[] sort (int[][] mat) {
        int[] rsl = new int[mat.length];
        int[] arrayOfSums = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            arrayOfSums[i] = sum(mat[i]);
        }
        int[] arrayForSort = new int[mat.length];
        System.arraycopy(arrayOfSums, 0, arrayForSort, 0, arrayForSort.length);
        Arrays.sort(arrayForSort);
        for (int i = 0; i < arrayForSort.length; i++) {
            for (int j = 0; j < arrayOfSums.length; j++) {
                if (arrayForSort[i] == arrayOfSums[j]) {
                    rsl[i] = j;
                    arrayOfSums[j] = -1;
                    break;
                }
            }
        }
        return rsl;
    }

    private int sum(int[] array) {
        int rsl = 0;
        for (int element : array) {
            rsl += element;
        }
        return rsl;
    }
}