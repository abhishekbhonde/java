package Recursion;

public class Nto1Numbers {
    public static void main(String[] args) {

        fun(6);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
}
