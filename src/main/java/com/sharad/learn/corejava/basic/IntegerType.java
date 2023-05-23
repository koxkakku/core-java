package com.sharad.learn.corejava.basic;

public class IntegerType {
	public static void main(String[]args)
	{
		int p=36;
		Integer objInt=new Integer(p);
		
		
		System.out.println(Integer.toBinaryString(objInt)); //toBinaryString()
		
		String s1="123";
		String s2="456";
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //ParseInt()
		
		Integer d1=new Integer(36);
		Integer d2=new Integer(100);
		
		System.out.println(objInt.equals(d1)); //equals method
		System.out.println(objInt.equals(d2));
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		
		
	}

}
