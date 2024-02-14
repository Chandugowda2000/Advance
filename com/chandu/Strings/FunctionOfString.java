package com.chandu.Strings;

public class FunctionOfString {

	public static void main(String[] args) {
		
		        // Example string with leading and trailing whitespace
		        String str = "  Hello, World!   ";

		        // Using trim() to remove leading and trailing whitespace
		        String trimmedStr = str.trim();
		        System.out.println("Original String: '" + str + "'");
		        System.out.println("Trimmed String: '" + trimmedStr + "'");

		        // Using strip() to remove leading and trailing whitespace
		        String strippedStr = str.strip();
		        System.out.println("Stripped String: '" + strippedStr + "'");

		        // Using stripTrailing() to remove trailing whitespace
		        String strippedTrailingStr = str.stripTrailing();
		        System.out.println("Stripped trailing String: '" + strippedTrailingStr + "'");

		        // Using isEmpty() to check if a string is empty
		        String emptyStr = "";
		        String nonEmptyStr = "Hello";

		        System.out.println("Is the emptyStr empty? " + emptyStr.isEmpty()); // true
		        System.out.println("Is the nonEmptyStr empty? " + nonEmptyStr.isEmpty()); // false
		    }
		


	}


