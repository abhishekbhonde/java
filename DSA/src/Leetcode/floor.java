package Leetcode;

public class floor {
    public static void main(String[] args) {
        int [] arr = {4,5,3,4,23,24,56,67,87,90};
        int target = 55;
        int ans = floornum(arr,target);
        System.out.println(ans);
    }
    static int floornum(int [] arr, int target){
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
        return end;
    }
}
