package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {

        System.out.println('a' + 'b');

        System.out.println("a"+ "b");

        System.out.println((char)('a' + 3));

        System.out.println("a"+ 1);

        System.out.println("Abhishek" + new ArrayList<>());

        System.out.println("Abhishek" + new ArrayList<> (34));

//        System.out.println("Abhishek" + new Integer (345));

        System.out.println(new Integer(34)+""+new ArrayList<>(34) );
    }
}
