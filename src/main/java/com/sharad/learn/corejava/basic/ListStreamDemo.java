package com.sharad.learn.corejava.basic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListStreamDemo {

	public static void main(String[] args) {
		System.out.println(
				"Outpoot is :" + Stream.of("Ram", "Govind").anyMatch(name -> name.startsWith("R")));
		
		List<Person> persons = new ArrayList<>();
		Person person = new Person();
		person.setName("Rahul");
		persons.add(person);
		persons.add(null);
		persons.add(person);
		
		Stream<List<Person>> streamOfListOfPersons = Stream.of(persons);//returns singleton sequential stream of type of item provided.
		System.out.println("size of streamOfListOfPersons : "+streamOfListOfPersons.count());
		System.out.println("Size of persons: " + persons.size());
		
		List<Person> nonNullPersons = persons.stream().filter(Objects::nonNull).collect(Collectors.toList());//get list od nonnull items
		System.out.println("Size of nonNullPersons: " + nonNullPersons.size());
		
		nonNullPersons.forEach(item -> System.out.println(item.getName()));

		nonNullPersons.forEach(item -> {
			item.setCountry("India");
			item.setGender("Male");
			item.setDateOfBerth("12/12/2012");
		});
		nonNullPersons
				.forEach(item -> System.out.println(item.getName() + " " + item.getCountry() + " " + item.getGender()));

		List<Integer> number = new ArrayList<>();
		System.out.println("size of number" + number.size());
		
		List<Person> benefit = new ArrayList<>();
		Person p1 = new Person();
		p1.setName("Standalone");
		p1.setCountry("India");

		Person p2 = new Person();
		p2.setName("RIDER");
		
		Person p3 = new Person();
		p3.setName("ACCELERATOR");
		
		Person p4 = new Person();
		p4.setName("RIDER");
		
		Person p5 = new Person();
		p5.setName("Standalone");
		
		p5.setCountry("Pakistan");
		Person p6 = new Person();
		
		p6.setName("ACCELERATOR");
		Person p7 = new Person();
		
		p7.setName("Standalone");
		p7.setCountry("Srilanka");
		
		benefit.add(p1);
		benefit.add(p2);
		benefit.add(p3);
		benefit.add(p4);
		benefit.add(p5);
		benefit.add(p6);
		benefit.add(p7);
		
		//sort according to specified order
		Map<String, Integer> sorderOrderSequence = new Hashtable<>();
		sorderOrderSequence.put("STANDALONE", 1);
		sorderOrderSequence.put("ACCELERATOR", 2);
		sorderOrderSequence.put("RIDER", 3);
		//////using comparator
		benefit.sort(new Comparator<Person>() {

			@Override
			public int compare(Person o1, Person o2) {
				Integer integer = sorderOrderSequence.get(o1.getName().toUpperCase());
				Integer integer2 = sorderOrderSequence.get(o2.getName().toUpperCase());
				if (integer == integer2)
					return 0;
				if (integer > integer2)
					return 1;
				else
					return -1;
			}

		});
		// using lambda
		benefit.sort((o1, o2) -> sorderOrderSequence.get(o1.getName().toUpperCase())
				.compareTo(sorderOrderSequence.get(o2.getName().toUpperCase())));
		//get max 
		Optional<Person> max = benefit.stream().max((o1, o2) -> o1.getName().compareToIgnoreCase(o2.getName()));
		if (max.isPresent())
			System.out.println(" :" + max.get().getName());
		//find Any
		Optional<Person> findFirst = benefit.stream().filter(obj -> "Standalone".equalsIgnoreCase(obj.getName()))
				.findAny();
		if (findFirst.isPresent())
			System.out.println("country :" + findFirst.get().getCountry());
		
		benefit.forEach(System.out::println);
		//skip skips first n items
		List<Integer> skipedList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).skip(2).collect(Collectors.toList());
		System.out.println("skipped item list : "+skipedList);
		//limit limits result to n items
		List<Integer> limitedList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x->x%2==0).limit(2).collect(Collectors.toList());
		System.out.println("limited item list : "+limitedList);
		
		//limit and skip
		List<Integer> limitedSkipList = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(x->x%2==0).limit(3).skip(1).collect(Collectors.toList());
		System.out.println("limited skipped list: "+limitedSkipList);
		 
	}

}
