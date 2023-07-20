package com.sharad.learn.corejava.basic;
/**
 * @author koxkakku
 */
public class Factorial {
	private static int factorial(int number) {
		if (number == 0)
			return 1;
		else
			return number * factorial(number - 1);
	}

	public static void main(String[] args) {
		int number = 5;
		System.out.println("Factorial of " + number + " is " + factorial(number));

	}

}
