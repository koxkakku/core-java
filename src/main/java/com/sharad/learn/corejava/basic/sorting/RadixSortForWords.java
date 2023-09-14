package com.sharad.learn.corejava.basic.sorting;

/**
 * @author koxkakku
 * Radix sort implementation
 * sorts in ascending order
 */
public class RadixSortForWords {

	public static void main(String[] args) {

		String[] arrayToSort = {"asdfg","awsaq","qwert","zxcvb","lkjhg","poiuy"};
		
		radixSort(arrayToSort,26,5);
		
		for(String i: arrayToSort) {
			System.out.println(i);
		}
	}

	private static void radixSort(String[] arrayToSort, int radix, int width) {
		for(int i=width-1;i>=0;i--) {
			radixSingleSort(arrayToSort,i,radix);
		}
	}

	private static void radixSingleSort(String[] arrayToSort, int position, int radix) {
		int numItems=arrayToSort.length;
		int[] countArray = new int[radix];
		for(String value : arrayToSort) {
			countArray[getDigit(position, value)]++;
		}
		for(int j=1;j<radix; j++) {
			countArray[j]+=countArray[j-1];
		}
		String[] temp = new String[numItems];
		for(int tempIndex=numItems-1;tempIndex>=0;tempIndex--) {
			temp[--countArray[getDigit(position, arrayToSort[tempIndex])]]=arrayToSort[tempIndex];
		}
		for(int tempIndex=0; tempIndex<numItems;tempIndex++) {
			arrayToSort[tempIndex] = temp[tempIndex];
		}
	}

	private static int getDigit(int position, String value) {
		return value.charAt(position)-'a';
	}
}
