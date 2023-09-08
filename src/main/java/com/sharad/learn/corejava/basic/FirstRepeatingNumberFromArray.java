package com.sharad.learn.corejava.basic;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstRepeatingNumberFromArray {
	public static void main(String[] args) {
		Integer[] integerArray = new Integer[] {1,4,3,9,0,4,3,5,1};
		Optional<Integer> firstRepeatingNumber = Arrays.stream(integerArray)
        .collect(Collectors.toMap(
                // Key: Array elements
                i -> i,
                // Value: Count of occurrences
                v -> 1,
                // Merge function: Combine counts if elements are the same
                Integer::sum,
                // Use a LinkedHashMap to preserve order
                LinkedHashMap::new))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() > 1)
        .map(Map.Entry::getKey)
        .findFirst();
		firstRepeatingNumber.ifPresent(System.out::println);
		
		
		int[] intArray = new int[] {1,4,3,9,0,4,3,5,1};
		Optional<Integer> firstRepeatingNumber1 = Arrays.stream(intArray).boxed()
        .collect(Collectors.toMap(
                // Key: Array elements
                i -> i,
                // Value: Count of occurrences
                v -> 1,
                // Merge function: Combine counts if elements are the same
                Integer::sum,
                // Use a LinkedHashMap to preserve order
                LinkedHashMap::new))
        .entrySet()
        .stream()
        .filter(entry -> entry.getValue() > 1)
        .map(Map.Entry::getKey)
        .findFirst();
		firstRepeatingNumber1.ifPresent(System.out::println);
		
		
		
	}
}
