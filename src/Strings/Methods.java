package Strings;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Abhishek Bhonde";

        System.out.println(Arrays.toString(name.toCharArray()));

        System.out.println(name.indexOf('h'));

        System.out.println(name.toLowerCase());

        System.out.println("  Abhiishek" .strip());

        System.out.println(Arrays.toString(name.split(" ")));
    }
}
