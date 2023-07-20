/**
 * 
 */
package com.sharad.learn.corejava.basic;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/**
 * @author XY57013
 *
 */
public class MapSort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Map<String,Integer> avgMarks = new HashMap();
		avgMarks.put("Sharad", 72);
		avgMarks.put("Saurav", 84);
		avgMarks.put("Samya", 68);
		avgMarks.put("Suman", 85);
		avgMarks.put("Suresh", 60);
		avgMarks.put("Surya", 91);
		avgMarks.put("Sun", 70);
		
		avgMarks.entrySet().forEach(System.out::println);
		//avgMarks.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue)).forEach(System.out::println);
		avgMarks.computeIfAbsent("Sankalp",k->k.length());
		avgMarks.compute("Sankalp", (k,v)->v==null?1:v+48);
		avgMarks.computeIfPresent("Sankalp", (k,v)->v==null?null:v+48);
		avgMarks.entrySet().forEach(System.out::println);
	}

}
