package com.sharad.learn.corejava.basic;

import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter two numbers : ");
			double num1 = sc.nextDouble();
			double num2 = sc.nextDouble();
			System.out.println("Enter one operator (+,-,*,/)");
			char ch = sc.next().charAt(0);
			double result = 0;
			switch (ch) {

			case '+':
				result = num1 + num2;
				break;

			case '-':
				result = num1 - num2;
				break;

			case '*':
				result = num1 * num2;
				break;

			case '/':
				result = num1 / num2;
				break;

			default:
				System.out.println("Wroung input");
				break;
			}

			System.out.println(String.format("%.2f %c %.2f = %.2f ", num1, ch, num2, result));
		}

	}
}
