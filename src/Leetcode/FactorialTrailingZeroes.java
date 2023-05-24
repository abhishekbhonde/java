package Leetcode;

public class FactorialTrailingZeroes {
    public static int factorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int countTrailingZeroes(int factorial) {
        int zerosCount = 0;
        while (factorial % 10 == 0) {
            zerosCount++;
            factorial /= 10;
        }
        return zerosCount;
    }

    public static void main(String[] args) {
        int n = 3; // Example input
        int factorial = factorial(n);
        int trailingZeroes = countTrailingZeroes(factorial);
        System.out.println("Factorial of " + n + " is: " + factorial);
        System.out.println("Number of trailing zeroes: " + trailingZeroes);
    }
}
