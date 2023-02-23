package Arrays;

public class FindNumbers1295L {
    public static void main(String[] args) {
        int[] num = {12, 345, 2, 6, 7896, 324};
        System.out.println(findNumbers(num));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {
        int NumberofDigit = digit(num);
        return NumberofDigit % 10 == 0;
    }

    static int digit(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;

        }
        return num;
    }


}
