package com.sharad.learn.corejava.basic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class LargestWord {
	public static String findLongestWord(String inputString) {
        // Split the inputString into individual words using space as the delimiter
        String[] words = inputString.split(" ");

        // Use streams to find the longest word from the list
        Stream<String> wordStream = Arrays.stream(words);

        // Get the longest word based on length using the 'max' function and a custom comparator
        String longestWord = wordStream.max(Comparator.comparingInt(String::length)).orElse("");

        return longestWord;
    }

    public static void main(String[] args) {
        String inputString = "This      is a sample string to find the longest word";
        String longestWord = findLongestWord(inputString);
        System.out.println("Longest word: " + longestWord);
    }
}
