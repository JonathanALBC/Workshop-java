package com.github.username.workshop;

public class Fibonacci {
    public static int recursiveFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    public static int iterativeFibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        int n = 10;
        if (args.length >= 1) {
            n = Integer.parseInt(args[0]);
        }
        System.out.println("Suite de Fibonacci de " + n + ":");
        System.out.println("Recursive: " + recursiveFibonacci(n));
        System.out.println("Iterative: " + iterativeFibonacci(n));
    }
}
