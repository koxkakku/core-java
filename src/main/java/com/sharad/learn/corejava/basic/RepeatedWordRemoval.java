package com.sharad.learn.corejava.basic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RepeatedWordRemoval {


	    public static void main(String[] args) {

	        String regex = "\\b(\\w+)(\\s+\\1\\b)+";
	        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
	        Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            in.close();
            Matcher m = p.matcher(input);
            
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(0), m.group(1));
            }
            // Prints the modified sentence.
            System.out.println(input);
	        
	        
	       
	    }
	
}
