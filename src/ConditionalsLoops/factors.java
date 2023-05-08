package ConditionalsLoops;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of which you want to find out factors");
        int n= in.nextInt();
        for(int i=1; i<=n; i++)
        {
           if(n%i==0){
               System.out.println("The factors are " + i);
           }
        }
    }
}
