package com.sharad.learn.corejava.basic.sorting;

import java.security.SecureRandom;
import java.util.Random;

/**
 * @author koxkakku
 * Merge sort implementation
 * sorts in ascending order
 */
public class MergeSort {

	public static void main(String[] args) {

		int[] arrayToSort = new int[100];
		Random rand = new SecureRandom();
		for (int i=0;i<arrayToSort.length;i++) {
			arrayToSort[i]=rand.nextInt(100000);
		}

		mergeSort(arrayToSort,0,arrayToSort.length);
		for(int i: arrayToSort) {
			System.out.println(i);
		}

	}

	private static void mergeSort(int[] input, int start, int end) {

		if (end-start<2) {
			return;
		}

		int mid = (start + end) / 2;

		mergeSort(input, start, mid);
		mergeSort(input, mid, end);

		merge(input, start, mid, end);
		//mergeDescending(input, start, mid, end);// to sort in descending order
	}

	private static void merge(int[] input, int start, int mid, int end) {
		if(input[mid-1]<=input[mid]) {
			return;
		}
		int i=start;
		int j= mid;
		int tempIndex = 0;
		
		int[] temp = new int[end-start];
		while(i<mid && j<end) {
			temp[tempIndex++]= input[i]<=input[j]?input[i++]:input[j++];
		}
		System.arraycopy(input, i, input, start+tempIndex, mid-i);
		System.arraycopy(temp, 0, input, start, tempIndex);
	}
	
//	private static void mergeDescending(int[] input, int start, int mid, int end) {
//		if(input[mid-1]>=input[mid]) {
//			return;
//		}
//		int i=start;
//		int j= mid;
//		int tempIndex = 0;
//		
//		int[] temp = new int[end-start];
//		while(i<mid && j<end) {
//			temp[tempIndex++]= input[i]>=input[j]?input[i++]:input[j++];
//		}
//		System.arraycopy(input, i, input, start+tempIndex, mid-i);
//		System.arraycopy(temp, 0, input, start, tempIndex);
//	}

}
