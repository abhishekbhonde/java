package Leetcode;

import static Leetcode.InfiniteArr.ans;

public class NotRepeated {
    public static void main(String[] args) {
        int[] arr = {4,2,2,4,3,6,3};
        System.out.println(ans(arr));
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }

        return unique;
    }
}
