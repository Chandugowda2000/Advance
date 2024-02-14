package com.chandu.Strings;

public class StringLiteral {

	    public static void main(String[] args) {
	        // String literals
	        String greeting = "Hello, World!";
	        String name = "John Doe";
	        String message = "Welcome to Java programming.";

	        // Displaying string literals
	        System.out.println("Greeting: " + greeting);
	        System.out.println("Name: " + name);
	        System.out.println("Message: " + message);

	        // String concatenation using string literals
	        String fullName = name + " Smith";
	        System.out.println("Full Name: " + fullName);

	        // String length
	        System.out.println("Length of greeting: " + greeting.length());

	        // Accessing characters in a string literal
	        char firstChar = greeting.charAt(0);
	        System.out.println("First character of greeting: " + firstChar);

	        // Substring of a string literal
	        String substring = message.substring(11);
	        System.out.println("Substring of message: " + substring);

	        // String comparison
	        String str1 = "Hello";
	        String str2 = "hello";
	        System.out.println("Comparison: " + str1.equals(str2)); // false
	    }
	}



