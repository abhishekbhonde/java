package Recursion;

public class NumbersExample {
    public static void main(String[] args) {
        num(1);
    }

    static void num(int n) {
        System.out.println(n);
        num1(2);
    }

    static void num1(int n) {
        System.out.println(n);
        num2(3);
    }

    static void num2(int n) {
        System.out.println(n);
        num3(4);
    }

    static void num3(int n) {
        System.out.println(n);
        num5(5);
    }

    static void num5(int n) {
        System.out.println(n);

    }


}