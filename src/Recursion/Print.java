package Recursion;

public class Print {
    public static void main(String[] args) {
        Print(1);
    }
    static void Print(int n){
        if(n==10){
            return;
        }
        System.out.println(n);
        Print(n+1);
    }
}
