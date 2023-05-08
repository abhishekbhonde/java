package Recursion;

public class ProdDigit {
    public static void main(String[] args) {
        int n = 6543;
        System.out.println(prod(n));
    }

    static int prod(int n){
        if(n%10 == n){
            return n;
        }

        return n%10 * prod(n /10);
    }

}
