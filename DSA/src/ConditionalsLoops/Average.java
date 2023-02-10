package ConditionalsLoops;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the marks of CS");
        float CS = input.nextFloat();
        System.out.println("Enter the marks of FlAT");
        float FlAT= input.nextFloat();
        System.out.println("Enter the marks of OOPS");
        float OOPS = input.nextFloat();
        System.out.println("Enter the marks of SE");
        float SE = input.nextFloat();
        System.out.println("Enter the marks of COA");
        float COA = input.nextFloat();

        float average = (CS + FlAT + OOPS + SE + COA)/5;
        System.out.println("The average marks is " + average);


    }
}
