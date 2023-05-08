package SwitchCase;

import java.util.Scanner;

public class fruit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the fruit name");

        String fruit = input.next();

        switch (fruit) {
            case "Apple" -> System.out.println("A red fruit");
            case "Grapes" -> System.out.println("A small fruit");
            case "mango" -> System.out.println("a yellow fruit");
            default -> System.out.println("Enter wrong output");
        }

    }
}
