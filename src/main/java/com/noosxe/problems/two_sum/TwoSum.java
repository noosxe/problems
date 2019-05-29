package com.noosxe.problems.two_sum;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    private boolean twoSum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(k - num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        int[] nums = new int[] {10, 15, 3, 7};
        System.out.println(Arrays.toString(nums) + " " + 17 + " " + twoSum.twoSum(nums, 17));
        System.out.println(Arrays.toString(nums) + " " + 16 + " " + twoSum.twoSum(nums, 16));
    }
}
