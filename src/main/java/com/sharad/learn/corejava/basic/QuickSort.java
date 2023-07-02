package com.sharad.learn.corejava.basic;

import java.security.SecureRandom;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Random;

public class QuickSort {

	public static void main(String[] args) {
		int[] arrayToSort = new int[1000];
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

	private static void quickSort(int[] arrayToSort, int lowIndex, int highIndex) {
		if(lowIndex>=highIndex) {
			return;
		}
		int pivot = arrayToSort[highIndex];
		int leftPointer = partitionArray(arrayToSort, lowIndex, highIndex, pivot);
		quickSort(arrayToSort,lowIndex,leftPointer-1);
		quickSort(arrayToSort,leftPointer+1,highIndex);
		
	}

	private static int partitionArray(int[] arrayToSort, int lowIndex, int highIndex, int pivot) {
		int leftPointer=lowIndex;
		int rightPointer=highIndex;
		while(leftPointer<rightPointer) {
			while(arrayToSort[leftPointer]<=pivot && leftPointer<rightPointer) {
				leftPointer++;
			}
			while(arrayToSort[rightPointer]>=pivot && leftPointer<rightPointer) {
				rightPointer--;
			}
			swap(arrayToSort,leftPointer,rightPointer);
			
		}
		swap(arrayToSort,leftPointer,highIndex);
		return leftPointer;
	}

	private static void swap(int[] arrayToSort, int leftPointer, int rightPointer) {
		int temp = arrayToSort[leftPointer];
		arrayToSort[leftPointer] = arrayToSort[rightPointer];
		arrayToSort[rightPointer]=temp;
	}

}
