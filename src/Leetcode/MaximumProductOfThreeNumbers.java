package Leetcode;

import java.util.Arrays;

public class MaximumProductOfThreeNumbers {
    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);

        int n = nums.length;
        int maxProduct = nums[n - 1] * nums[n - 2] * nums[n - 3];
        int altMaxProduct = nums[0] * nums[1] * nums[n - 1];

        return Math.max(maxProduct, altMaxProduct);
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        int result = maximumProduct(nums);
        System.out.println("Maximum product of three numbers: " + result);
    }
}
