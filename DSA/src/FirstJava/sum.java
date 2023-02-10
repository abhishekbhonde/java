import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of first number");
        int a =input.nextInt();
        System.out.println("Enter the value of second number");
        int b=input.nextInt();
        int c;
        c=a+b;
        System.out.println("The sum of two numbers is " +c);

    }
}
