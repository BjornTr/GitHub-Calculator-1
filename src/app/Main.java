package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double num1;
    static double num2;

    public static void main(String[] args) {
        baseInfo();
        inputs();
        results();
    }

    private static double add(double num1, double num2) {
        return num1 + num2;
    }

    private static double multiply(double num1, double num2) {
        return num1 * num2;
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

    private static void baseInfo() {
        System.out.println("Calculator for base calculations"
                + "\nVersion 1.0");
    }

    private static void results() {
        double resultAdd = add(num1, num2);
        System.out.println(resultAdd);
        double resultMultiply = multiply(num1, num2);
        System.out.println(resultMultiply);
        double resultDivide = divide(num1, num2);
        System.out.println(resultDivide);
        double resultSubtract = subtract(num1, num2);
        System.out.println(resultSubtract);
    }
}
