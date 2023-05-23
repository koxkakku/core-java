package com.sharad.learn.corejava.basic;

public class CheckPalindrome {

	public static void main(String[] args) {
		System.out.println(checkPalindromeString("MALAYALAM"));
		System.out.println(checkPalindromeString1("MALAYALAM"));

	}
	private static boolean checkPalindromeString(String input) {
		boolean result = true;
		int length = input.length();
		for(int i=0; i < length/2; i++) {
			if(input.charAt(i) != input.charAt(length-i-1)) {
				result = false;
				break;
			}
		}
		return result;
	}
	private static boolean checkPalindromeString1(String input) {
		StringBuilder sb = new StringBuilder(input).reverse();
		return input.equalsIgnoreCase(sb.toString());
	}
}
