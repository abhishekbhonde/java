import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the value of principle");
        float principle = input.nextFloat();
        System.out.println("Enter the value of time");
        float time = input.nextFloat();
        System.out.println("Enter the value of Annual Interest Rate");
        float interestrate = input.nextFloat();

        float simpleinterest= principle * time * interestrate;
        System.out.println("The value of simple interest is :" + simpleinterest);



    }
}
