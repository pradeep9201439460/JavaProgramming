package com.example.javaprogram;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        fibonacciSeriesUsingForLoop(getUserInput());
        fibonacciSeriesUsingWhileLoop(getUserInput());
        fibonacciSeriesUsingWhileLoopFibonacciNumber(getInputFibonacciNumber());
    }

    private static void fibonacciSeriesUsingForLoop(int userInput) {
        int t1 = 0, t2 = 1, sum;
        for (int i = 0; i < userInput; i++) {
            printData(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        printDataNextLine("\n");
    }

    private static void fibonacciSeriesUsingWhileLoop(int userInput) {
        int t1 = 0, t2 = 1, sum, i = 0;
        while (i < userInput) {
            printData(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
        printDataNextLine("\n");
    }

    private static void fibonacciSeriesUsingWhileLoopFibonacciNumber(int userInput) {
        int t1 = 0, t2 = 1, sum, i = 0;
        while (t1 <= userInput) {
            printData(t1 + " ");
            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
            i++;
        }
        printDataNextLine("\n");
    }

    private static int getUserInput() {
        Scanner scanner = new Scanner(System.in);
        printData("Enter the size of the Fibonacci Series : ");
        return scanner.nextInt();
    }

    private static int getInputFibonacciNumber() {
        Scanner scanner = new Scanner(System.in);
        printData("Enter Fibonacci Series Number : ");
        return scanner.nextInt();
    }

    private static void printData(Object printData) {
        System.out.print(printData);
    }

    private static void printDataNextLine(Object printData) {
        System.out.println(printData);
    }
}
