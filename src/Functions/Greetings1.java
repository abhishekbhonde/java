package Functions;

import java.util.Scanner;

public class Greetings1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");

        String name = in.next();
        String message = greet(name);
        System.out.println(message);

    }
     static String greet(String name){
        String ans = "hello " + name;
        return ans;
    }
}
