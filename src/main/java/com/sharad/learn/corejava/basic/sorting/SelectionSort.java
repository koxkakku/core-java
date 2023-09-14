package com.sharad.learn.corejava.basic.sorting;

import java.security.SecureRandom;
import java.util.Random;

public class SelectionSort {

	public static void main(String[] args) {
		int[] arrayToSort = new int[100];
		Random rand = new SecureRandom();
		for (int i=0;i<arrayToSort.length;i++) {
			arrayToSort[i]=rand.nextInt(100000);
		}
		selectionSort(arrayToSort);
		for(int i: arrayToSort) {
			System.out.println(i);
		}

	}

	private static void selectionSort(int[] input) {
		for(int lastUnsortedIndex=input.length-1;lastUnsortedIndex>0;lastUnsortedIndex--) {
			int largest = 0;
			for(int i=1;i<=lastUnsortedIndex;i++) {
				if(input[i]>input[largest])
					largest=i;
			}
			swap(input,largest,lastUnsortedIndex);
		}
	}

	private static void swap(int[] input, int i, int j) {
		if(i==j)
			return;
		int temp=input[i];
		input[i]=input[j];
		input[j]=temp;
		
	}

}
