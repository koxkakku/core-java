package com.sharad.learn.corejava.basic;
/**
 * @author koxkakku
 */
public class ReverseString {

	private static String reverse(String str) {
		char[] temp = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			temp[str.length() - i - 1] = str.charAt(i);
		}
		return String.valueOf(temp);
	}

	private static String reverseSb(String str) {
		return new StringBuilder(str).reverse().toString();
	}

	private static String reverseRecursively(String str) {
		// base case to handle one char string and empty string
		if (str.length() < 2) {
			return str;
		}

		return reverseRecursively(str.substring(1)) + str.charAt(0);

	}

	public static void main(String[] args) {
		System.out.println(reverse("pool"));
		System.out.println(reverseSb("pool"));
		System.out.println(reverseRecursively("pool"));
	}
}
