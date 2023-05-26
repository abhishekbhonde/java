package Leetcode;

import java.util.Arrays;

public class Searcha2DMatrix74 {
    public static void main(String[] args) {
        int [] [] arr = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 60}
        };
       boolean ans = searchMatrix(arr, 7);
        System.out.println(ans);

    }
    public static boolean searchMatrix(int[][] arr, int target) {
            if( arr== null || arr.length == 0 || arr[0].length==0){
                return false;
            }
            int rows = arr.length;
            int cols = arr[0].length;

            int left = 0;
            int right = rows * cols -1;

            while(left <= right){
                int mid = left + (right-left)/2;
                int midValue = arr[mid / cols][mid % cols];

                if (midValue == target) {
                    return true;
                } else if (midValue < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
    }
}
