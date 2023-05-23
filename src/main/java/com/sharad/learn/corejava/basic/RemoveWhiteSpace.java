package com.sharad.learn.corejava.basic;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		System.out.println(removeWhiteSpaces("I N D I A"));
	}

	private static String removeWhiteSpaces(String input) {
		StringBuilder output = new StringBuilder();

		char[] charArray = input.toCharArray();

		for (char c : charArray) {
			if (!Character.isWhitespace(c))
				output.append(c);
		}

		return output.toString();
	}
}
