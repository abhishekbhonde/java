package FirstJava;

import java.util.HashMap;
import java.util.Map;

public class StringPartition {
    public static void main(String[] args) {
        String s = "aabbccddee";
        findOptimalPartitions(s);
    }

    public static void findOptimalPartitions(String s) {
        Map<Character, Integer> charIndices = new HashMap<>();
        int start = 0;
        int end = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            charIndices.put(c, i);
        }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int lastIndex = charIndices.get(c);
            end = Math.max(end, lastIndex);

            if (i == end) {
                int partitionLength = end - start + 1;
                System.out.println(s.substring(start, end + 1));
                start = end + 1;
            }
        }
    }
}
