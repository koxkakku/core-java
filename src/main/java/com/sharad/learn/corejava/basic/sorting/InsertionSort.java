package com.sharad.learn.corejava.basic.sorting;

import java.security.SecureRandom;
import java.util.Random;
/**
 * @author koxkakku
 * Insertion Sort implementation
 * sorts in ascending order
 */
public class InsertionSort {

	public static void main(String[] args) {
		int[] arrayToSort = new int[100];
		Random rand = new SecureRandom();
		for (int i=0;i<arrayToSort.length;i++) {
			arrayToSort[i]=rand.nextInt(100000);
		}
		
		insertionSort(arrayToSort);
		//insertionSortRecursive(arrayToSort,arrayToSort.length);//recursive implementation
		for(int i: arrayToSort) {
			System.out.println(i);
		}

	}
	private static void insertionSort(int[] input) {
		for(int firstUnsortedIndex=1;firstUnsortedIndex<input.length;firstUnsortedIndex++) {
			int newElement = input[firstUnsortedIndex];
			int i;
			for(i=firstUnsortedIndex;i>0 && input[i-1]>newElement;i--) {
				input[i]=input[i-1];
			}
			input[i]=newElement;
		}
	}
//	private static void insertionSortRecursive(int[] input , int numItems) {
//		if(numItems<2)
//			return;
//		insertionSortRecursive(input, numItems-1);
//		int newElement = input[numItems-1];
//		int i;
//		for(i=numItems-1;i>0 && input[i-1]>newElement;i--) {
//			input[i]=input[i-1];
//		}
//		input[i]=newElement;
//			
//			
//	}

}
