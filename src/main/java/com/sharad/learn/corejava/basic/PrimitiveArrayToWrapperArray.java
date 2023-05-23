package com.sharad.learn.corejava.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimitiveArrayToWrapperArray {

	public static void main(String[] args) {
		char[] charArr = {'a', 'b', 'c'};
		Character[] characterArray = String.valueOf(charArr).chars().mapToObj(i->(char) i).toArray(Character[]::new);
		System.out.println("Character Array : "+ Arrays.toString(characterArray));
		List<Character> listChar = String.valueOf(charArr).chars().mapToObj(i->(char)i).collect(Collectors.toList());
		System.out.println("Character List : "+ listChar);
		
		
		int[] intArr = {1,2,3};
		Integer[] integerArray = IntStream.of(intArr).mapToObj(i->(int)i).toArray(Integer[]::new);
		System.out.println("Integer Array : "+ Arrays.toString(integerArray));
		List<Integer> listInteger = IntStream.of(intArr).mapToObj(i->(int)i).collect(Collectors.toList());
		System.out.println("Integer List : "+ listInteger);
		
	}

}
