package Leetcode;

import java.util.Arrays;

public class MissingNum268 {
    public static void main(String[] args) {
        int [] arr = {0,3,1,2,4};

        System.out.println(missingNumber(arr));
    }
    public static int missingNumber(int[] arr) {
        int i =0;
        while(i<arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else {
                i++;
            }
        }
            for (int index = 0; index < arr.length; index++) {
                if(arr[index] != index){
                return index;
            }

        }
        return arr.length;
        }

        static void swap(int [] arr, int i, int correct){
            int temp = arr[i];
            arr[i]=arr[correct];
            arr[correct]=temp;
        }
    }

