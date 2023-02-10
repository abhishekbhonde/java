package ConditionalsLoos;

import java.sql.SQLOutput;
import java.util.Scanner;
public class conditionals {
    public static void main(String[] args) {

//        int a = 20;
//        if(a>10)
//            System.out.println("A is greater");

        Scanner input = new Scanner(System.in);

        int a =input.nextInt();
        int b =input.nextInt();


//        if(a>1000)
//        {
//            System.out.println("The number is greater than 1000");
//        }
//        else {
//            System.out.println("The number is less than 1000");
//        }
        if(a>b){
            System.out.println("The number a is greater:" + a);
        }
        else if (b>a)
        {
            System.out.println("The number b is greater" +b);
        }
        else
        {
            System.out.println("The two numbers are equal");
        }
    }
}
