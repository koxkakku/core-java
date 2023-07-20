package com.sharad.learn.corejava.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args){
		Map<Integer, Person> personMap = new HashMap<>();
		Person p1 = new Person();
		p1.setName("Standalone");
		p1.setCountry("India");
		personMap.put(1, p1);
		Person p2 = new Person();
		p2.setName("RIDER");
		personMap.put(2, p2);
		Person p3 = new Person();
		p3.setName("ACCELERATOR");
		personMap.put(3, p3);
		Person p4 = new Person();
		p4.setName("RIDER");
		personMap.put(4, p4);
		Person p5 = new Person();
		p5.setName("Standalone");
		p5.setCountry("Pakistan");
		personMap.put(5, p5);
		Person p6 = new Person();
		p6.setName("ACCELERATOR");
		personMap.put(6, p6);
		Person p7 = new Person();
		p7.setName("Standalone");
		p7.setCountry("Srilanka");
		personMap.put(7, p7);
		System.out.println("SIze of map:" + personMap.size());
		for (Entry<Integer, Person> entry : personMap.entrySet()) {
			if ("RIDER".equalsIgnoreCase(entry.getValue().getName()))
				System.out.println(entry.getKey());
		}
		Map<String, List<Map<String, List<String>>>> countryMap = new HashMap<>();
		List<Map<String, List<String>>> countyStateMapList = new ArrayList<>();
		Map<String, List<String>> stateMap = new HashMap<>();
		stateMap.put("India", new ArrayList<>());
		stateMap.get("India").add("West Bengal");
		stateMap.get("India").add("West Bengal");
		stateMap.get("India").add("Uttar Pradesh");
		stateMap.get("India").add("Bihar");
		stateMap.get("India").add("Odissa");
		System.out.println("Size of state Map" + stateMap.size());
		countyStateMapList.add(stateMap);
		countryMap.put("Asia", countyStateMapList);
		countryMap.put("Africa", new ArrayList<>());
		countryMap.put("North America", new ArrayList<>());
		countryMap.put("South America", new ArrayList<>());
		countryMap.put("Australia", new ArrayList<>());
		countryMap.put("Antarctica", new ArrayList<>());
		countryMap.put("Europe", new ArrayList<>());
		if ((!Objects.isNull(countryMap) || countryMap.isEmpty()) && countryMap.containsKey("Asia")) {
			List<Map<String, List<String>>> list = countryMap.get("Asia");
			Optional<Map<String, List<String>>> findAny = list.stream().filter(obj -> obj.containsKey("India"))
					.findAny();
			if (null != findAny && findAny.isPresent()) {
				findAny.get().get("India").forEach(item -> System.out.println("States: " + item));
			}
			for (Entry<String, List<Map<String, List<String>>>> entry2 : countryMap.entrySet()) {
				if ("ASIA".equalsIgnoreCase(entry2.getKey())) {
					System.out.println("Continent Name" + entry2.getKey());
					for (Map<String, List<String>> map : entry2.getValue()) {
						for (Entry<String, List<String>> entry : map.entrySet()) {
							if (entry.getKey().equalsIgnoreCase("INDIA"))
								System.out
										.println("Country Name :" + entry.getKey() + " State Name:" + entry.getValue());
						}

					}
				}

			}
			countryMap.forEach((k,
					v) -> v.forEach(statemap -> statemap.entrySet().stream()
							.filter(obj -> obj.getKey().equalsIgnoreCase("INDIA"))
							.forEach(obj -> System.out.println(obj.getValue()))));
			List<Entry<String, List<Map<String, List<String>>>>> collect = countryMap.entrySet().stream()
					.filter(obj -> obj.getKey().toUpperCase().contains("S")).collect(Collectors.toList());
			collect.forEach(item -> System.out.println("Continent Name :" + item.getKey()));
		}

		Map<String,Integer> avgMarks = new HashMap();
		avgMarks.put("Sharad", 72);
		avgMarks.put("Saurav", 84);
		avgMarks.put("Samya", 68);
		avgMarks.put("Suman", 85);
		avgMarks.put("Suresh", 60);
		avgMarks.put("Surya", 91);
		avgMarks.put("Sun", 70);
		
		avgMarks.entrySet().forEach(System.out::println);
		avgMarks.computeIfAbsent("Sankalp",k->k.length());
		avgMarks.compute("Sankalp", (k,v)->v==null?1:v+48);
		avgMarks.computeIfPresent("Sankalp", (k,v)->v==null?null:v+48);
		avgMarks.entrySet().forEach(System.out::println);

	}
}
