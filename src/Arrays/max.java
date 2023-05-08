package Arrays;

public class max {
    public static void main(String[] args) {
        int[] arr = {23, 34, 32, 234, 23};
        System.out.println(maxvalue(arr));
    }

    static int maxvalue (int [] arr) {
        int maxVal= arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxVal) {
                maxVal = arr[i];
            }

        }
        return maxVal;
    }
}