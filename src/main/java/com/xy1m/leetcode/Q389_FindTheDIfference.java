package com.xy1m.leetcode;

/**
 * Created by gzhenpeng on 10/21/18
 */
public class Q389_FindTheDIfference {
    public char findTheDifference(String s, String t) {
        int[] words = new int[26];
        for (int i = 0; i < s.length(); i++) {
            words[t.charAt(i) - 'a']++;
            words[s.charAt(i) - 'a']--;
        }
        words[t.charAt(t.length() - 1) - 'a']++;
        for (int i = 0; i < 26; i++) {
            if (words[i] != 0) {
                return (char) ('a' + i);
            }
        }
        return '\0';
    }

    public static void main(String[] args) {
        Q389_FindTheDIfference main = new Q389_FindTheDIfference();
        char result = main.findTheDifference("abcd", "abcde");
        System.out.println(result);
    }
}
