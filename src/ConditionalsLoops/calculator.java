package ConditionalsLoops;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true) {
            System.out.println("Enter the opreators which you want");
            char op = in.next().trim().charAt(0);

            if(op == '+' || op == '-' || op == '*' || op == '/')
            {
                System.out.println("Enter two numbers:");
                int n1= in.nextInt();
                int n2=in.nextInt();

                if(op== '+')
                {
                    ans=n1+n2;
                }
                if(op== '-')
                {
                    ans=n1-n2;
                }
                if(op== '*')
                {
                    ans=n1*n2;
                }
                if(op=='/')
                {
                    ans=n1/n2;
                }

            }
            else if (op =='X' || op == 'x')
            {
                break;
            }
            else
            {
                System.out.println("Invalid Statement");
            }
            System.out.println("The ans is " +ans);


        }
    }
}