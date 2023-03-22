package Leetcode;

import java.util.*;


public class Main {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter side A: ");
        int A = input.nextInt();

        System.out.print("Enter side B: ");
        int B = input.nextInt();

        System.out.print("Enter side C: ");
        int C = input.nextInt();

        System.out.print("Enter side D: ");
        int D = input.nextInt();

        if ((A == C && B == D) || (A == B && C == D) || (A == D && B == C)) {
            System.out.println("These sides can form a rectangle.");
        } else {
            System.out.println("These sides cannot form a rectangle.");
        }
    }
}