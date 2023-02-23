package Searching;

public class linearSearch {
    public static void main(String[] args) {
            int [] arr = {23,34,2,5,6,4,8,6,9,0,24};
            int target=6;
            int ans = linearsearch(arr, target);
        System.out.println(ans);
    }

    static int linearsearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;


        }

        for (int index=0; index< arr.length; index++) {
            int element = arr[index];
            if(element==target ){
                return index;
            }
        }
        return 1;
    }
}