package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double num1;
    static double num2;
    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        inputs();
        double c = add(num1, num2);
        System.out.println(c);
        double d = multiply(num1, num2);
        System.out.println(d);
        double resultDivide = divide(num1, num2);
        System.out.println(resultDivide);
        double resultSubtract = subtract(num1, num2);
        System.out.println(resultSubtract);
    }

    private static double add(double a, double b) {
        return a + b;
    }

    private static double multiply(double a, double b) {
        return a * b;
    }

    private static double divide(double num1, double num2) {
        return num1 / num2;
    }

    private static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    private static void inputs() {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("Please enter num 1: ");
        num1 = scanner.nextDouble();
        System.out.println("Please enter num 2: ");
        num2 = scanner.nextDouble();
    }
}
