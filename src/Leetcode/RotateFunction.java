package Leetcode;

import java.util.Arrays;

public class RotateFunction {
    public static void main(String[] args) {
       int [] nums = {4,3,2,6};
        maxRotateFunction(nums);
        System.out.println(nums);

    }
        static void maxRotateFunction(int [] nums) {
            final int sum = Arrays.stream(nums).sum();
            int f = 0;


            for (int i = 0; i < nums.length; ++i)
                f += i * nums[i];

            int ans = f;

            for (int i = nums.length - 1; i >= 0; --i) {
                f += sum - nums.length * nums[i];
                ans = Math.max(ans, f);
            }

        }
}

