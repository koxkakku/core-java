package com.sharad.learn.corejava.basic;

public class VowelCheck {
	public static void main(String[] args) {
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(countVowel("Hello"));
		System.out.println(stringContainsVowels("TV")); // false
	}

	public static boolean stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}
	
	private static int countVowel(String word) {
		return word.length()-word.replaceAll("[aeiou]", "").length();
	}
}
