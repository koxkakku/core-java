package com.sharad.learn.corejava.basic.sorting;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author koxkakku
 * Counting Sort implementation
 * sorts in ascending order
 */
public class CountingSort {
	public static void main(String[] args) {

		int[] arrayToSort = new int[10];
		Random rand = new SecureRandom();
		for (int i=0;i<arrayToSort.length;i++) {
			arrayToSort[i]=rand.nextInt(10);
		}
		countingSort(arrayToSort,0,10);
		
		for(int i: arrayToSort) {
			System.out.println(i);
		}
	}

	private static void countingSort(int[] input, int min, int max) {
		int[] countArray=new int[max-min+1];
		for(int i=0;i<input.length;i++) {
			countArray[input[i]-min]++;
		}
		int j=0;
		for(int i=min;i<=max;i++) {
			
			while(countArray[i-min]>0) {
				input[j++]=i;
				countArray[i-min]--;
			}
		}
		
	}
}
