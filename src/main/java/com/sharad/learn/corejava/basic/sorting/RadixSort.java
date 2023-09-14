package com.sharad.learn.corejava.basic.sorting;

/**
 * @author koxkakku
 * Radix sort implementation
 * sorts in ascending order
 */
public class RadixSort {

	public static void main(String[] args) {

		int[] arrayToSort = {4321,4567,1234,9876,7654,5678};
		
		radixSort(arrayToSort,10,4);
		
		for(int i: arrayToSort) {
			System.out.println(i);
		}
	}

	private static void radixSort(int[] input, int radix, int width) {
		for(int i=0;i<width;i++) {
			radixSingleSort(input,i,radix);
		}
	}

	private static void radixSingleSort(int[] input, int position, int radix) {
		int numItems=input.length;
		int[] countArray = new int[radix];
		for(int value : input) {
			countArray[getDigit(position, value, radix)]++;
		}
		for(int j=1;j<radix; j++) {
			countArray[j]+=countArray[j-1];
		}
		int[] temp = new int[numItems];
		for(int tempIndex=numItems-1;tempIndex>=0;tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]]=input[tempIndex];
		}
		for(int tempIndex=0; tempIndex<numItems;tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
	}

	private static int getDigit(int position, int value, int radix) {
		return value/(int)Math.pow(radix,position)%radix;
	}
}
