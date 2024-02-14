package com.chandu.Strings;

public class WrapperClass {

	public static void main(String[] args) {
		
		        // Primitive data types
		        int intValue = 10;
		        double doubleValue = 3.14;
		        char charValue = 'A';
		        boolean booleanValue = true;

		        // Wrapper classes
		        Integer integerObj = Integer.valueOf(intValue);
		        Double doubleObj = Double.valueOf(doubleValue);
		        Character charObj = Character.valueOf(charValue);
		        Boolean booleanObj = Boolean.valueOf(booleanValue);

		        // Accessing values from wrapper objects
		        System.out.println("Integer value: " + integerObj.intValue());
		        System.out.println("Double value: " + doubleObj.doubleValue());
		        System.out.println("Character value: " + charObj.charValue());
		        System.out.println("Boolean value: " + booleanObj.booleanValue());
		    }
		}


