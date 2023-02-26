package Searching;

public class maxwealth {
    public static void main(String[] args) {

    }
    public int maximumWealth(int[][] accounts) {
            int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                sum = ans;

            }

        }
        return ans;
        }
}

