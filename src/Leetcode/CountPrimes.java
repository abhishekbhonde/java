package Leetcode;

public class CountPrimes {
    public static int countPrimes(int n) {
        boolean[] isPrime = new boolean[n];
        // Initialize the boolean array with true
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Apply the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // Count the number of primes
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int limit = 30;
        int numPrimes = countPrimes(limit);
        System.out.println("The number of prime numbers up to " + limit + " is: " + numPrimes);
    }
}
