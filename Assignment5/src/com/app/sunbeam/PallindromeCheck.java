package com.app.sunbeam;
import java.util.Scanner;
public class PallindromeCheck {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Convert to lowercase to make it case insensitive
	        String str = input.toLowerCase();
	        boolean isPalindrome = true;

	        // Check characters from start and end
	        for (int i = 0; i < str.length() / 2; i++) {
	            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
	                isPalindrome = false;
	                break;
	            }
	        }

	        // Display result
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is NOT a palindrome.");
	        }

	        sc.close();
	    }
	}

}
