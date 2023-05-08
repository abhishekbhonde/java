package Leetcode;

public class sumof1darray {
    public static void main(String[] args) {

            int nums[]={1,2,3,4};
            int res[]= runningSum(nums);
            System.out.print("[");
            for(int i=0;i<res.length-1;i++) System.out.print(res[i]+",");
            System.out.println( res[res.length-1] + "]");



    }


    public static int[] runningSum(int[] nums)
    {
        int[] res= new int[nums.length];
        if(nums.length==0) return res;
        res[0]=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            res[i]=res[i-1]+ nums[i];
        }
        return res;
    }
}
