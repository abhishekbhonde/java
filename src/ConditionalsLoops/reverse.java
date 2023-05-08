package ConditionalsLoops;

import java.util.Scanner;

public class reverse {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want to reverse");
        int n = in.nextInt();
        int ans =0;

        while(n>0){
            int rem=n%10;
            n=n/10;

            ans=ans*10+rem;
        }
        System.out.println("The reverse number is " +ans);

    }
}

