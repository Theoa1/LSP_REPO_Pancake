package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class WordCounting {

    public static void main(String[] args) {
        // Input relative path
        String filePath = "word.txt";
        
        // Store word counts while maintaining insertion order - LinkedHashMap
        Map<String, Integer> wordCounts = new LinkedHashMap<>();

        // Try catch block to read file 
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Split the line into words 
                String[] wordsInLine = line.split("[^a-zA-Z]+");
                for (String word : wordsInLine) {
                    if (!word.isEmpty() && !isaTrivWord(word) && !isaNum(word)) {
                    	// Change word to Lowercase
                        word = word.toLowerCase(); 
                        wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("OOOOps error reading file: " + e.getMessage());
        }

        // Display the word counts
        wordCounts.forEach((word, count) -> System.out.println(word + " " + count));
    }

    // Helper to find numeric words
    private static boolean isaNum(String str) {
        return str.chars().allMatch(Character::isDigit);
    }

    // Helper to find trivial words
    private static boolean isaTrivWord(String word) {
        return word.length() <= 3;
    }
}