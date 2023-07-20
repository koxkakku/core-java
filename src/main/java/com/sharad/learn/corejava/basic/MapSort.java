/**
 * 
 */
package com.sharad.learn.corejava.basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * @author koxkakku
 *
 */
public class MapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("Apple", 5);
		unsortedMap.put("Orange", 3);
		unsortedMap.put("Banana", 8);

		Map<String, Integer> sortedMap = new TreeMap<>(unsortedMap);
		System.out.println(sortedMap); // Output: {Apple=5, Banana=8, Orange=3}

		Map<String, Integer> sortedMap1 = unsortedMap.entrySet().stream()
		    .sorted(Map.Entry.comparingByKey()) // Sort by key (natural order)
		    // .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) // Sort by key (reverse order)
		    // .sorted(Map.Entry.comparingByValue()) // Sort by value (natural order)
		    // .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())) // Sort by value (reverse order)
		    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> a, LinkedHashMap::new));

		System.out.println(sortedMap1); // Output: {Apple=5, Banana=8, Orange=3}

		
		List<Map.Entry<String, Integer>> entryList = new ArrayList<>(unsortedMap.entrySet());
		Collections.sort(entryList, Map.Entry.comparingByKey()); // Sort by key (natural order)
		// Collections.sort(entryList, Map.Entry.comparingByKey(Comparator.reverseOrder())); // Sort by key (reverse order)
		// Collections.sort(entryList, Map.Entry.comparingByValue()); // Sort by value (natural order)
		// Collections.sort(entryList, Map.Entry.comparingByValue(Comparator.reverseOrder())); // Sort by value (reverse order)

		Map<String, Integer> sortedMap2 = new LinkedHashMap<>();
		for (Map.Entry<String, Integer> entry : entryList) {
		    sortedMap2.put(entry.getKey(), entry.getValue());
		}

		System.out.println(sortedMap2); // Output: {Apple=5, Banana=8, Orange=3}

	}

}
