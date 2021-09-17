package com.mycompany.app;

/**
 * Hello world!
 *
 */
public class App {
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isOdd(int num) {
        return !isEven(num);
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
