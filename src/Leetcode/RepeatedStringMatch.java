package Leetcode;

public class RepeatedStringMatch {

        public static void main(String[] args) {
            RepeatedStringMatch matcher = new RepeatedStringMatch();
            String A = "abcd";
            String B = "cdabcdab";

            int count = matcher.repeatedStringMatch(A, B);
            System.out.println("Minimum number of times A needs to be repeated: " + count);
        }


    public int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (sb.length() < B.length()) {
            sb.append(A);
            count++;
        }

        if (sb.toString().contains(B)) {
            return count;
        }

        if (sb.append(A).toString().contains(B)) {
            return count + 1;
        }

        return -1;
    }
}

