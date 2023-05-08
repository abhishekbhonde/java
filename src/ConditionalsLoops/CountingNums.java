package ConditionalsLoops;

import java.util.Scanner;

public class CountingNums {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number in which you want to check");
        int n = in.nextInt();
        int count = 0;
        while(n > 0)
        {
            int rem= n % 10;
            if(rem == 5)
            {
                count++;
            }
            n=n/10;
        }
        System.out.println("The number is repeated this much time "  + count);

    }
}
