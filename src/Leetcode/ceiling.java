package Leetcode;

public class ceiling {
    public static void main(String[] args) {
            int [] arr = {4,5,3,4,23,24,56,67,87,90};
            int target = 22;
            int ans = ceilingnum(arr,target);
        System.out.println(ans);
    }
    static int ceilingnum(int [] arr, int target){
        int start = 0;
        int end = arr.length-1;


        while(start <= end){
            int  mid = start + (end -start)/2;

            if(target>arr[mid]){
                start = mid+1;
            }
            else if(target<arr[mid]){
                end = mid -1;
            }
            else{
                return mid;
            }
        }
        return start;
    }
}
