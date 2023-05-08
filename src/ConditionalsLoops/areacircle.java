package ConditionalsLoops;

import java.util.Scanner;

public class areacircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter value of radius");
        float r = in.nextFloat();
        float area = r * r;
        System.out.println("The are of circle is " + area);

    }
}
