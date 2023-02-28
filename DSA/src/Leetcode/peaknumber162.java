package Leetcode;

public class peaknumber162 {
    public static void main(String[] args) {
            int [] arr ={4,5,3,4,356,23,24,24,5,2};
            int ans = peak(arr);
        System.out.println(ans);
    }
    static int peak(int [] arr ){
        int start =0;
        int end = arr.length -1;
        int mid = (start + end)/2;

        while(start < end){
            if(arr[mid]>=arr[mid+1]){
                end = mid;
                return end;
            }
            else{
                start = mid+1;
            }


        }
        return start;

    }
}
