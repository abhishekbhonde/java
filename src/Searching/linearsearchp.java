package Searching;

public class linearsearchp {
    public static void main(String[] args) {
        int [] arr = { 34,2,3,4,6,7,8,9,0};
        int target = 8;
        int ans = search (arr , target);
        System.out.println(ans);
    }

    static int search( int [] arr , int target){
        if(arr.length==0){
            return -1;
        }

        for(int index =0; index<arr.length; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }

        }
        return 1;
    }
}
