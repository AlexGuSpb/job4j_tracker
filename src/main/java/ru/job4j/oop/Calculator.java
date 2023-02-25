package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return x - y;
    }

    public int multiply(int a) {
        return x * a;
    }

    public int divide(int a) {
        return x / a;
    }

    public int sumAllOperation(int total) {
        return total;
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        int rsl = calculator.multiply(5);
        int rsl2 = Calculator.minus(2);
        int rsl3 = calculator.divide(1);
        int rsl4 = calculator.sumAllOperation(result + rsl + rsl2 + rsl3);
        System.out.println(rsl);
        System.out.println(rsl2);
        System.out.println(rsl3);
        System.out.println(rsl4);
    }
}
