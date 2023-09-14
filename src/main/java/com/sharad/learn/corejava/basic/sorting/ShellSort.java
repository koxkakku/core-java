package com.sharad.learn.corejava.basic.sorting;

import java.security.SecureRandom;
import java.util.Random;
/**
 * @author koxkakku
 * Shell sort implementation
 * sorts in ascending order
 */
public class ShellSort {

	public static void main(String[] args) {
		int[] arrayToSort = new int[100];
		Random rand = new SecureRandom();
		for (int i=0;i<arrayToSort.length;i++) {
			arrayToSort[i]=rand.nextInt(100000);
		}
		shellSort(arrayToSort);
		for(int i: arrayToSort) {
			System.out.println(i);
		}


	}

	private static void shellSort(int[] input) {
		for(int gap=input.length/2;gap>0;gap/=2) {
			for(int i=gap;i<input.length;i++) {
				int newElement = input[i];
				int j=i;
				while(j>=gap && input[j-gap]>newElement) {
					input[j]=input[j-gap];
					j-=gap;
				}
				input[j]=newElement;
			}
			
		}
	}

}
