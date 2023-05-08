package ConditionalsLoops;

import java.util.Scanner;

public class sumuntilzero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int n=0;
       int sum=0;
        while((n= in.nextInt())!=0)
        {



            if(n!=0)
            {
                 sum = sum + n;
            }
            if (n==0)
            {
                System.out.println("The sum of numbers is "  + sum);
            }
        }
    }
}
