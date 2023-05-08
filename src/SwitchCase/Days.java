package SwitchCase;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number between 1 to 7");
        int num = in.nextInt();

        switch (num) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wed");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Sat");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter wrong input");
        }
    }
}
