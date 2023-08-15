package com.parfenov7233.easy;

public class Solution6 {

    public static void main(String[] args) {
        Solution6 solution6 = new Solution6();
        System.out.println(solution6.numberOfSteps(123));
    }
    public int numberOfSteps(int num) {
        int rsl = 0;
        while (num != 0) {
            if (num %2 == 0) {
                num = num / 2;
                rsl++;
            } else {
                num--;
                rsl++;
            }
        }
        return rsl;
    }
}
