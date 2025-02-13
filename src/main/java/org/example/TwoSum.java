//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

package org.example;

import java.util.HashMap;

public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }

        throw new IllegalArgumentException("No solution found");
    }

    public static void main(String[] args) {
        TwoSum solution = new TwoSum();

        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println(result1[0] + ", " + result1[1]);

        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println(result2[0] + ", " + result2[1]);

        int[] result3 = solution.twoSum(new int[]{3, 3}, 6);
        System.out.println(result3[0] + ", " + result3[1]);
    }

}
