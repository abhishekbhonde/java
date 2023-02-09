import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter temp in degree celsious");
        float tempC=input.nextFloat();
        float tempF= (tempC*5/9) +32;
        System.out.println("The tempreature in F is " + tempF);
    }
}
