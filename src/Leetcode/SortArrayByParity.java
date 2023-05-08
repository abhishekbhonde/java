package Leetcode;

public class SortArrayByParity {
    public static void main(String[] args) {
       int [] nums = {3,1,2,4};
          sortArrayByParity(nums);
        System.out.println(nums);
    }
    public static int[] sortArrayByParity(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            if (nums[l] % 2 == 1 && nums[r] % 2 == 0) {
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
            }
            if (nums[l] % 2 == 0)
                ++l;
            if (nums[r] % 2 == 1)
                --r;
        }

        return nums;
    }
}


