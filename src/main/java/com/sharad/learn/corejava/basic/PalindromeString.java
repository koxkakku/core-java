package com.sharad.learn.corejava.basic;

public class PalindromeString {
	public static void main(String[] args) 
    {
        System.out.println( isPalindromeString("howtodoinjava") );
        System.out.println( isPalindromeStringStringBuilder("abcba") );
    }
     
    private static boolean isPalindromeStringStringBuilder(String originalString) 
    {
        String reverse = new StringBuilder(originalString).reverse().toString();
        return originalString.equals(reverse);
    }
    
    private static boolean isPalindromeString(String originalString) 
    {
        StringBuilder reverse = new StringBuilder();
        for ( int i = originalString.length() - 1; i >= 0; i-- )
            reverse.append(originalString.charAt(i));
         
        return originalString.equals(reverse.toString());
        
    }

}
