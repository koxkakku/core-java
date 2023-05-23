package com.sharad.learn.corejava.basic;

import java.util.HashMap;
import java.util.Map;

public class CountDitinct {

	public static void main(String[] args) {
		String str1 = "abcdABCDabcd";
		countDistinctChars(str1);

	}
	private static void countDistinctChars(String str1) {
		char[] chars = str1.toCharArray();

		Map<Character, Integer> charsCount = new HashMap<>();

		for(char c : chars) {
			if(charsCount.containsKey(c)) {
				charsCount.put(c, charsCount.get(c)+1);
			}else
				charsCount.put(c, 1);
		}

		System.out.println(charsCount); 
	}
}
