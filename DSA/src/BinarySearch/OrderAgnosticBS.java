package BinarySearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
            int [] arr = {2,3,4,6,7,89,90,344,532,643,2342};
            int target = 532;
            int ans = orderAgnosticBS(arr , target);
        System.out.println(ans);
    }
    static int orderAgnosticBS(int [] arr , int target){

        int start =0;
        int end = arr.length-1;

        boolean IsAsc = arr[start] > arr [end];

        while(start <= end){

            int mid = start + (end - start) /2;

            if (arr[mid] == target){
                return mid;
            }

            if(IsAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
             else{
                 if(target>arr[mid]){
                     start = mid +1;

                 }
                else {
                    end = mid - 1;
                }

            }
        }
        return -1;
    }

}
