package Leetcode;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int number) {
        if (number <= 0) {
            return false;
        }

        while (number % 2 == 0) {
            number /= 2;
        }

        return number == 1;
    }

    public static void main(String[] args) {
        int number = 16;

        if (isPowerOfTwo(number)) {
            System.out.println(number + " is a power of two.");
        } else {
            System.out.println(number + " is not a power of two.");
        }
    }
}
