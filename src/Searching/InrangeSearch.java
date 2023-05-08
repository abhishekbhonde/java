package Searching;

public class InrangeSearch {
    public static void main(String[] args) {
            int [] arr ={3,345,53,2,23,9,6,7,5};
            int target= 23432;
            int ans=search(arr, target, 3,6);
        System.out.println(ans);
    }
    static int search(int [] arr, int target, int start, int end){
        if(arr.length==0){
            return -1;
        }
        for(int index=0; index<=end; index++) {
            int element = arr[index];
            if (element == target) {
                return index;
            }
        }
        return -1;
    }

}
