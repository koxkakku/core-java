package com.sharad.learn.corejava.basic;
/**
 * @author koxkakku
 */
public class Power {
	private static int calculate(int num, int power) {
		int p = 1;
		for (int i = 1; i <= power; i++) {
			// calculate Power of a number
			p *= num;
		}
		System.out.println(num + " to the power " + power + " is: " + p);
		return p;

	}

	public static void main(String[] args) {
		calculate(3, 2);

	}

}
