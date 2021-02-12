package com.company;

import java.util.Scanner;

public class Main {

    // int computeFib(int n)
    // if n <= 2 return 1
    // return fib(n-1) + fib(n-2)

    public static int computeFib(int n) {
        if (n <= 2) {
            return 1;
        }
        return computeFib(n - 1) + computeFib(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt()) {
            int n = scanner.nextInt();
            System.out.println("Fibonacci is " + computeFib(n));
        }
    }
}
