package com.noosxe.problems.product_except;

import java.util.Arrays;

public class ProductExcept {
    private int[] productExcept(int[] nums) {
        int product = 1;

        for (int num: nums) {
            product *= num;
        }

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = product / nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        ProductExcept productExcept = new ProductExcept();

        int[] nums = new int[] {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(nums) + " " + Arrays.toString(productExcept.productExcept(nums)));
    }
}
