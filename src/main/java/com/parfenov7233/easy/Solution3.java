package com.parfenov7233.easy;

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 *
 *
 *
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */

public class Solution3 {
    public static void main(String[] args) {
        System.out.println(canConstruct("aa", "aab"));
    }
    public static boolean canConstruct(String ransomNote, String magazine) {
        boolean rsl = false;
        char[] ransomNoteArray = ransomNote.toCharArray();
        char[] magazineArray = magazine.toCharArray();
        for (char elementNote : ransomNoteArray) {
            rsl = false;
            for (int i = 0; i < magazineArray.length; i++) {
                if (elementNote == magazineArray[i]) {
                    rsl = true;
                    magazineArray[i] = '\u0000';
                    break;
                }
            }
            if (!rsl) {
                return rsl;
            }
        }
        return rsl;
    }
}