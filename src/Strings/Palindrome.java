package Strings;

import java.util.Locale;

public class Palindrome {
    public static void main(String[] args) {
        String str = "";
        System.out.println(palindrome(str));
    }

    static boolean palindrome(String str) {
        str = str.toLowerCase();
        if(str.length()==0 || str == null){
            return true;
        }
        for (int i = 0; i <= str.length()/2; i++) {
            char start = str.charAt(i);
            char end = str.charAt(str.length() - 1 - i);

            if (start != end) {
                return false;
            }

        }
        return true;
    }

}
