package com.sharad.learn.corejava.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
/**
 * @author koxkakku
 */
public class FindNthHighestNumber {

	public static void main(String[] args) {
		int[] arr = { 70, 50, 30, 10, 20, 40, 60 };
		System.out.println("second largest number from array is : " + findSecondHighest(arr));
		System.out.println("second largest number from array using stream is : " + nthHighestFromArray(arr, 2));
		List<Integer> intList = Arrays.asList(70, 50, 30, 10, 20, 40, 60);
		System.out.println("second largest number from list is : " + findNthHighestNumber(intList, 2));
		System.out.println("second smallest number from list is : " + findNthSmallestNumber(intList, 2));
	}

	private static int nthHighestFromArray(int[] arr, long n) {
		Optional<Integer> nthHighest = Arrays.stream(arr).boxed().sorted(Comparator.reverseOrder()).limit(n).skip(n - 1)
				.findFirst();
		return nthHighest.orElseThrow(NoSuchElementException::new);
	}

	private static int findSecondHighest(int[] array) {
		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

	private static int findNthHighestNumber(List<Integer> numList, long n) {
		Optional<Integer> nthHighest = numList.stream().sorted(Comparator.reverseOrder()).distinct().limit(n)
				.skip(n - 1).findFirst();
		return nthHighest.orElseThrow(NoSuchElementException::new);
	}

	private static int findNthSmallestNumber(List<Integer> numList, long n) {
		Optional<Integer> nthHighest = numList.stream().sorted().distinct().limit(n).skip(n - 1).findFirst();
		return nthHighest.orElseThrow(NoSuchElementException::new);
	}

}
