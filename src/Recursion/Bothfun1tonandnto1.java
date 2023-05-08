package Recursion;

public class Bothfun1tonandnto1 {
    public static void main(String[] args) {
        funBoth(6);
    }
    static void fun(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funrev(n-1);
    }
    static void funBoth(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        funBoth(n-1);
        System.out.println(n);

    }
}
