package Recursion;

public class starttoN {
    public static void main(String[] args) {
        funrev(6);
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

    public static class Nto1Numbers {
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
}
