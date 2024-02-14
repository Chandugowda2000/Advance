package com.chandu.Strings;

import java.util.ArrayList;

public class UnboxingExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Integer objects
        ArrayList<Integer> list = new ArrayList<>();

        // Adding Integer objects to the ArrayList
        list.add(10);
        list.add(20);
        list.add(30);

        // Unboxing: Converting Integer objects to int primitive data type
        int firstValue = list.get(0); // Unboxing
        int secondValue = list.get(1); // Unboxing
        int thirdValue = list.get(2); // Unboxing

        // Displaying the unboxed values
        System.out.println("First value: " + firstValue);
        System.out.println("Second value: " + secondValue);
        System.out.println("Third value: " + thirdValue);
    }
}
