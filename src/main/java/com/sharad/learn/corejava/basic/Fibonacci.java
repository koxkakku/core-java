package com.sharad.learn.corejava.basic;

import java.util.Arrays;
/**
 * @author koxkakku
 */
public class Fibonacci {

	public static void main(String[] args) {
		int num = 10;
		printFibonacciSeries(num);
		System.out.println(String.format("fibonacci of %d is %d",num,fibonacci(num)));
	}

	private static void printFibonacciSeries(int terms) {
		int a = 0;
		int b = 1;
		int c = 1;
		int [] series = new int[terms];
		for (int i = 1; i <= terms; i++) {
			series[i-1]=a;
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(String.format("First %d terms of fibonacci series : %s",terms,Arrays.toString(series)));
	}

	private static int fibonacci(int n) {
		if (n <= 1)
			return n;
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
