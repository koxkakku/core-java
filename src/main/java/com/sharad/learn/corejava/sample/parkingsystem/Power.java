package com.sharad.learn.corejava.sample.parkingsystem;

import java.util.Scanner;

public class Power {
@SuppressWarnings("resource")	 
public static void main(String[] args)
{

 int number, power;
 number=power=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter number : ");
 number=sc.nextInt();
 System.out.println("Enter the Power : ");
 power=sc.nextInt();
 //Calling Function
 int pow=calculate(number, power);
 //Prints the result
 System.out.println(number+" to the power "+power+" is: "+pow);
 
 
}

public static int calculate(int number, int power)
{
      int res=1;
      
      for(int i=1;i<=power;i++)
      {
    	  //calculate Power of a number
    	  res=res*number;
      }
      
      return res;
      
}
 
}
