package com.sharad.learn.corejava.sample.cricket;

import java.text.DecimalFormat;

public class Rivalry implements Stats 
{

	@Override
	public String TestFormat() 
	{
		
		return "nine times in Tests";
	}
	public double TestFormat (double out, double runs)
	{
		DecimalFormat format = new DecimalFormat("0.00");
		double Average =(runs/out);
		return Double.valueOf(format.format(Average));
		
	}
	

	// method overloading
	public float TestFormat(float runs,float balls)
	{
	 float strikerate = (runs/balls)*100;
	 return strikerate;
	}

	@Override
	public String OdiFormat() 
	{
		
		return "five times in Odis";
	}
	public float OdiFormat (float runs, float balls)
	{
		float strikerate =(runs/balls)*100;
		return strikerate;
		
	}
	public double OdiFormat (double runs, double out)
	{
		double Average =(runs/out);
		return Average;
		
	}
	
	
}
		
		
	
 
