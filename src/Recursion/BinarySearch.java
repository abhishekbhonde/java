package Recursion;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr = {1,2,5,6,7,89,90};
        int target = 7;
        System.out.println(BS(arr, target, 0 , arr.length-1));
    }

    static int BS(int [] arr, int target,int s, int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e-s)/2;
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid]> target){
            return BS(arr, target,s , mid-1);
        }
        return BS(arr, target, mid+1, e);
    }
}
