package com.app.sunbeam;
import java.util.Scanner;

	public class WordCount {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine().trim(); // Remove leading & trailing spaces

	        // Split by spaces and count words
	        String[] words = input.split("\\s+"); // Splits by one or more spaces
	        int wordCount = words.length;

	        // Handle empty input case
	        if (input.isEmpty()) {
	            wordCount = 0;
	        }

	        System.out.println("Number of words: " + wordCount);
	        sc.close();
	    }
	}


