package Leetcode;

public class StringReversal {
    public static String reverseString(String s) {
        char[] charArray = s.toCharArray();
        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversed = reverseString(input);

        System.out.println("Input: " + input);
        System.out.println("Reversed: " + reversed);
    }
}
