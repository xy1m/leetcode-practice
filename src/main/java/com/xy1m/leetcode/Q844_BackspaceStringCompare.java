package com.xy1m.leetcode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Q844_BackspaceStringCompare {
    public boolean backspaceCompare(String S, String T) {
        return effectiveStr(S).equals(effectiveStr(T));
    }

    public String effectiveStr(String s) {
        char[] chars = s.toCharArray();
        int p = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '#') {
                chars[p] = chars[i];
                p++;
            } else {
                if (p - 1 >= 0) {
                    p--;
                }
            }
        }
        return s.substring(0, p);
    }

    public static void main(String[] args) {
        Q844_BackspaceStringCompare main = new Q844_BackspaceStringCompare();
        System.out.println(main.backspaceCompare("ab#c", "ad#c"));
        System.out.println(main.backspaceCompare("ab##", "c#d#"));
        System.out.println(main.backspaceCompare("a##c", "#a#c"));
        System.out.println(main.backspaceCompare("a#c", "b"));
    }

}
