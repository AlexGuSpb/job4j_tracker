package ru.job4j.oop;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int up) {
        return up > max(left, right) ? up : max(left, right);
    }

    public static int max(int left, int right, int up, int down) {
        return down > max(left, right, up) ? down : max(left, right, up);
    }

    public static int summation(int first, int second) {
        return first + second;
    }

    public static int summation(int first, int second, int three) {
        return first + second + three;
    }

    public static void main(String[] args) {
        int maximum = Max.max(10, 5);
        System.out.println(maximum);
        maximum = Max.max(3, 4, 1);
        System.out.println(maximum);
        maximum = Max.max(1, 2, 3, 5);
        System.out.println(maximum);
        int sum = Max.summation(10, 5);
        System.out.println(sum);
        sum = Max.summation(4, 5, 10);
        System.out.println(sum);
    }
}
