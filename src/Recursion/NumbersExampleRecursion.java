package Recursion;

public class NumbersExampleRecursion {
    public static void main(String[] args) {
        num(1);
    }

    static void num(int n) {
        if (n == 5) {
            System.out.println(5);
            return;
        }
            System.out.println(n);
            num(n+1);
        }
    }


