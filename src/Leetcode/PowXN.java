package Leetcode;

public class PowXN {
    public static double myPow(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        if (n < 0) {
            x = 1.0 / x;
            n = -n;
        }

        return powRecursive(x, n);
    }

    private static double powRecursive(double x, int n) {
        if (n == 0) {
            return 1.0;
        }

        double temp = powRecursive(x, n / 2);

        if (n % 2 == 0) {
            return temp * temp;
        } else {
            return x * temp * temp;
        }
    }

    public static void main(String[] args) {
        double x = 2.0;
        int n = 10;

        double result = myPow(x, n);

        System.out.println(x + " raised to the power of " + n + " is: " + result);
    }
}
