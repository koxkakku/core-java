package com.sharad.learn.corejava.basic.sorting;

import java.security.SecureRandom;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;
/**
 * @author koxkakku
 * quick sort implementation
 * sorts in ascending order
 */
public class QuickSort {

	public static void main(String[] args) {
		int[] arrayToSort = new int[100];
		Random rand = new SecureRandom();
		for (int i=0;i<arrayToSort.length;i++) {
			arrayToSort[i]=rand.nextInt(100000);
		}
		System.out.println("Before quicksort:");
		System.out.println(Arrays.toString(arrayToSort));
		LocalTime startTime = LocalTime.now();
		quickSort(arrayToSort,0,arrayToSort.length-1);
		LocalTime finishTime = LocalTime.now();
		System.out.println(ChronoUnit.MICROS.between(startTime ,finishTime));
		System.out.println("After quicksort:");
		System.out.println(Arrays.toString(arrayToSort));
	}

	private static void quickSort(int[] input, int start, int end) {
		if(end-start<2) {
			return;
		}
		int pivotIndex = partitionArray(input,start,end);
		
		quickSort(input,start,pivotIndex);
		quickSort(input,pivotIndex+1,end);
		
	}

	private static int partitionArray(int[] input, int start, int end) {
		int pivot=input[start];
		int i=start;
		int j= end;
		while(i<j) {
			while(i<j && input[--j]>=pivot);
			if(i<j)
				input[i]=input[j];
			
			while(i<j && input[++i]<=pivot);
			if(i<j)
				input[j]=input[i];
		}
		input[j]=pivot;
		return j;
	}

}
