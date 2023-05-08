package Functions;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
            int ans = sum();
    }
    static int sum(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first number");
        int num1=in.nextInt();

        System.out.println("Enter the second number");
        int num2=in.nextInt();
        int ans = num1+num2;
        System.out.println(ans);
        return sum();

    }

}
