package com.sharad.learn.corejava.basic;
/**
 * @author koxkakku
 */
public class PlindomeNumber {
	/**
     * 
     * */
    public static void main(String[] args)
    {
        System.out.println(checkIntegerPalindrome( 100 ));    
        System.out.println(checkIntegerPalindrome( 101 ));    
        System.out.println(checkIntegerPalindrome( 500045 ));  
        System.out.println(checkIntegerPalindrome( 50005 ));  
        System.out.println(reverseUsingFor(345232));
    }
 
    /**
     * This function will test the equality if a number and its reverse.
     * @return true if number is palindrome else false
     * */
    private static boolean checkIntegerPalindrome(int number)
    {
        boolean isPalindrome = false;
        if(number == reverse(number))
        {
            isPalindrome = true;
        }
        return isPalindrome;
    }
 
    /**
     * This function will reverse a given number.
     * @return reverse number
     * */
    private static int reverse(int number)
    {
        int reverse = 0;
        int remainder = 0;
        do {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
 
        } while (number > 0);
        return reverse;
    }
    private static int reverseUsingFor(int number)
    {
        int reverse = 0;
        for(;number != 0; number /= 10) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
          }
        return reverse;
    }

}
