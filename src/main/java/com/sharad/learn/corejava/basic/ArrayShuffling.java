package com.sharad.learn.corejava.basic;

import java.util.Arrays;
import java.util.Random;
/**
 * @author koxkakku
 */
public class ArrayShuffling {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7 };
		shuffleArray(array);
	}
	private static void shuffleArray(int[] array) {
		Random rand = new Random();

		for (int i = 0; i < array.length; i++) {
			int randomIndexToSwap = rand.nextInt(array.length);
			int temp = array[randomIndexToSwap];
			array[randomIndexToSwap] = array[i];
			array[i] = temp;
		}
		System.out.println(Arrays.toString(array));
	}
}
