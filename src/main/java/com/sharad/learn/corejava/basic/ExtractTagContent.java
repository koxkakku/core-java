package com.sharad.learn.corejava.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * solution to one of hackerrank problem
 * @author koxkakku
 * 
 */
public class ExtractTagContent {
	public static void main(String[] args) {
		 Pattern pattern = Pattern.compile("<([^<>]+)>([^<>]+)</\\1>");
	        int maxLength = 1000000;
	        int maxLineLength = 10000;
	        int temp = 0;
			Scanner in = new Scanner(System.in);
			int testCases = Integer.parseInt(in.nextLine());
			while(testCases>0 && testCases<=100){
				String line = in.nextLine();
	            int lineLength = line.length();
	            boolean isMatched = false;
	            temp+=lineLength;
	            if(lineLength<=maxLineLength && temp<=maxLength){
	                Matcher matcher = pattern.matcher(line);
	                while(matcher.find()){
	                    System.out.println(matcher.group(2));
	                    isMatched = true;
	                } 
	                if(!isMatched){
	                    System.out.println("None");
	                }
	            }
				testCases--;
			}
	        in.close();
	}
}


