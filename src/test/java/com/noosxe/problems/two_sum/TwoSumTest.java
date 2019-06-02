package com.noosxe.problems.two_sum;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class TwoSumTest {

    private TwoSum twoSum;

    @Before
    public void init() {
        twoSum = new TwoSum();
    }

    @Test
    public void test1() {
        int[] nums = new int[] {10, 15, 3, 7};
        assertTrue(twoSum.twoSum(nums, 17));
    }

    @Test
    public void test2() {
        int[] nums = new int[] {10, 15, 3, 7};
        assertFalse(twoSum.twoSum(nums, 16));
    }
}
