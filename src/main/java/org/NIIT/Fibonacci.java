package org.NIIT;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int n = sc.nextInt();

        Fibonacci fibonacci = new Fibonacci();

        int fib = fibonacci.getFibonacci(n);
        System.out.println("Fibonacci of " + n + ": " + fib);


    }

    public int getFibonacci(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 1;
        }
        return getFibonacci(n - 1) + getFibonacci(n - 2);
    }

}

