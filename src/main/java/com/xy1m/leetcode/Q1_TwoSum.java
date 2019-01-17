package com.xy1m.leetcode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * Given nums = [2, 7, 11, 15], target = 9,
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 *
 * @link{https://leetcode.com/problems/two-sum/}
 */
public class Q1_TwoSum {
    // 1 brute force 2 loops
    // 2 sort, binary search, doesn't work because return is indices not value
    // 3 set


    public int[] twoSumByBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumByTwoPointers(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        Arrays.sort(nums);
        while (lo < hi) {
            int sum = nums[lo] + nums[hi];
            if (sum == target) {
                return new int[]{nums[lo], nums[hi]};
            } else if (sum < target) {
                lo++;
            } else {
                hi--;
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public int[] twoSumBySet(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[]{i, map.get(complement)};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }

    public static void main(String[] args) {
        Q1_TwoSum main = new Q1_TwoSum();

        /*int[] res1 = main.twoSumByBruteForce(new int[]{2, 7, 11, 15}, 9);
        int[] res2 = main.twoSumByBruteForce(new int[]{2, 21, 11, 13}, 15);
        int[] res3 = main.twoSumByBruteForce(new int[]{2, 3, 4, 4}, 8);

        System.out.println(res1[0] + " " + res1[1]);
        System.out.println(res2[0] + " " + res2[1]);
        System.out.println(res3[0] + " " + res3[1]);*/

        /*int[] res1 = main.twoSumByTwoPointers(new int[]{2, 7, 11, 15}, 9);
        System.out.println(9 + "=" + res1[0] + "+" + res1[1]);

        int[] res2 = main.twoSumByTwoPointers(new int[]{2, 21, 11, 13}, 15);
        System.out.println(15 + "=" + res2[0] + "+" + res2[1]);

        int[] res3 = main.twoSumByTwoPointers(new int[]{2, 3, 4, 4}, 8);
        System.out.println(8 + "=" + res3[0] + "+" + res3[1]);*/

        int[] res1 = main.twoSumBySet(new int[]{2, 7, 11, 15}, 9);
        int[] res2 = main.twoSumBySet(new int[]{2, 21, 11, 13}, 15);
        int[] res3 = main.twoSumBySet(new int[]{2, 3, 4, 4}, 8);

        System.out.println(res1[0] + " " + res1[1]);
        System.out.println(res2[0] + " " + res2[1]);
        System.out.println(res3[0] + " " + res3[1]);
    }

}
