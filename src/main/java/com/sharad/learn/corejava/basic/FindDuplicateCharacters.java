package com.sharad.learn.corejava.basic;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Java Program to find duplicate characters in String.
 *
 *
 * @author koxkakku
 */
public class FindDuplicateCharacters {

	public static void main(String[] args) {
		printDuplicateCharacters("Programming");
		findrepeatingCharacters("Programming");
		findFirstRepeatingCharacter("Programming");
		printDuplicateCharactersStream("Combination");
		printDuplicateCharacters("Java");
		findNonRepeatingCharacters("Umbrella");
		findrepeatingCharacters("india");
		findFirstNonRepeatingCharacter("Hindustan");
	}

	/*
	 * Find all duplicate characters in a String and print each of them.
	 */
	private static void printDuplicateCharacters(String word) {
		// build HashMap with character and number of times they appear in String
		Map<Character, Integer> countsMap = new LinkedHashMap<>(word.length());

		for (char c : word.toCharArray()) {
			countsMap.put(c, countsMap.containsKey(c) ? countsMap.get(c) + 1 : 1);
		}
		// Iterate through HashMap to print all duplicate characters of String
		countsMap.entrySet().removeIf(entry->entry.getValue() == 1);
		System.out.println("Map of duplicate characters in String : "+ countsMap);
	}

	private static void printDuplicateCharactersStream(String word) {
		String duplicateCharString = word.codePoints().filter(c -> word.indexOf(c) == word.lastIndexOf(c))
				.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
		System.out.println("duplicate Characters string :"+duplicateCharString);

	}

	private static void findNonRepeatingCharacters(String word) {

		List<Character> nonRepeatingCharList = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() == 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("non repeating Characters list :"+nonRepeatingCharList);
	}

	private static void findrepeatingCharacters(String word) {

		List<Character> repeatingCharList = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(x -> x.getValue() > 1).map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("repeating character list :"+repeatingCharList);
	}

	private static void findFirstNonRepeatingCharacter(String word) {

		Character firstNonRepeatingChar = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() == 1).findFirst().orElseThrow(NoSuchElementException::new).getKey();
		System.out.println("first non-repeating character :"+firstNonRepeatingChar);
	}

	private static void findFirstRepeatingCharacter(String word) {

		Character firstRepeatingCharacter = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet().stream().filter(x -> x.getValue() > 1).findFirst().orElseThrow(NoSuchElementException::new).getKey();
		System.out.println("first repeating character :"+firstRepeatingCharacter);
	}

}
