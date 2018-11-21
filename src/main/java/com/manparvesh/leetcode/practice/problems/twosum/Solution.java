package com.manparvesh.leetcode.practice.problems.twosum;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numbers = new HashMap<>();
        for (int i = 0; i<nums.length;i++) {
            numbers.put(nums[i], i);
        }
        for (int i = 0; i<nums.length;i++) {
            int num = nums[i];
            if (numbers.containsKey(target - num) && i != numbers.get(target - num)) {
                return new int[]{i, numbers.get(target - num)};
            }
        }
        return null;
    }
}