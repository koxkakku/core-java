package com.sharad.learn.corejava.basic;

import java.util.Arrays;

/**
 * Java program - String Anagram Example.
 * This program checks if two Strings are anagrams or not
 * 
 * An anagram is a word or phrase formed by rearranging the letters of a 
 * different word or phrase, typically using all the original letters exactly once.
 * @author koxkakku
 *
 */
public class AnagramCheck {
   public static void main(String[] args) {
	System.out.println(isAnagram("blow", "bowl"));
	System.out.println(iAnagram("blow", "bowl"));
	System.out.println(checkAnagram("blow", "bowl"));
   }
   private static boolean isAnagram(String word, String anagram){       
        if(word.length() != anagram.length()){
            return false;
        }
       
        char[] chars = word.toCharArray();
       
        for(char c : chars){
            int index = anagram.indexOf(c);
            if(index != -1){
                anagram = anagram.substring(0,index) 
                       + anagram.substring(index +1, anagram.length());
            }else{
                return false;
            }           
        }
       
        return anagram.isEmpty();
    }
   
   private static boolean iAnagram(String word, String anagram){
        char[] charFromWord = word.toCharArray();
        char[] charFromAnagram = anagram.toCharArray();       
        Arrays.sort(charFromWord);
        Arrays.sort(charFromAnagram);
       
        return Arrays.equals(charFromWord, charFromAnagram);
    }
   
   
   private static boolean checkAnagram(String first, String second){
        char[] characters = first.toCharArray();
        StringBuilder sbSecond = new StringBuilder(second);
       
        for(char ch : characters){
            int index = sbSecond.indexOf("" + ch);
            if(index != -1){
                sbSecond.deleteCharAt(index);
            }else{
                return false;
            }
        }
       
        return sbSecond.length()==0 ? true : false;
    }
}
