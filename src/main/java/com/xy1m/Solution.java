package com.xy1m;

import java.util.HashSet;
import java.util.Set;

public class Solution {

    public boolean isSingleCompleteCycle(int[] arr) {
        if (arr.length < 1) return true;

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            int curValue = arr[i];
            int destIndex = curValue + i;

            destIndex = destIndex % arr.length;
            destIndex = Math.max(destIndex, 0);
            destIndex = Math.min(destIndex, arr.length);

            if (set.contains(destIndex)) {
                return false;
            } else {
                set.add(i);
            }
        }
        return true;
    }

    public static void main(String[] args) {


    }


}
