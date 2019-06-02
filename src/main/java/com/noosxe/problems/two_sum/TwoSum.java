package com.noosxe.problems.two_sum;

import java.util.HashSet;
import java.util.Set;

public class TwoSum {

    public boolean twoSum(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(k - num)) {
                return true;
            }

            set.add(num);
        }

        return false;
    }
}
