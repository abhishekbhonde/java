package Searching;

public class minnumber {
    public static void main(String[] args) {
            int [] arr = {1,23,4,5,6,7,78,9,676};
        System.out.println(min(arr));
    }
    static int min(int [] arr){
        int ans = arr[0];
        for(int i=0; i< arr.length;i++){
            if(arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;
    }
}
