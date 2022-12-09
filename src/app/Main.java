package app;

public class Main {

    public static void main(String[] args) {
        System.out.println("My app for Users!");
        System.out.println("Version 1.0");
        double num1 = 8;
        double num2 = 2;
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
}
