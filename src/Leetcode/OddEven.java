package Leetcode;

public class OddEven {
    public static void main(String[] args) {
        int n =45;
        System.out.println(oddeven(n));
    }

    public static boolean oddeven(int n) {
        return (n & 1) == 1;
    }


}
