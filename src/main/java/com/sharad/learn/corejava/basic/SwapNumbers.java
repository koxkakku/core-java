package com.sharad.learn.corejava.basic;
/**
 * @author koxkakku
 */
public class SwapNumbers {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.printf("Numbers before swap : a= %d , b= %d", a,b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.printf("\n Numbers after swap : a= %d , b= %d", a,b);

	}
	
}
