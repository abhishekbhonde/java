package Recursion;

public class FIbonacci {
    public static void main(String[] args) {
        System.out.println(fibo(6));
    }

    static int fibo(int n){
        if(n <2){
            return n;
        }
        return fibo(n-2) + fibo(n-1);
    }
}
