package com.chandu.Strings;

import java.util.ArrayList;

public class AutoboxingExample {
    public static void main(String[] args) {
        // Autoboxing: converting int to Integer
        int primitiveInt = 10;
        Integer wrappedInt = primitiveInt; // autoboxing

        // Autoboxing: converting double to Double
        double primitiveDouble = 3.14;
        Double wrappedDouble = primitiveDouble; // autoboxing

        // Autoboxing: converting boolean to Boolean
        boolean primitiveBoolean = true;
        Boolean wrappedBoolean = primitiveBoolean; // autoboxing

        // Autoboxing: adding primitive int to ArrayList<Integer>
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); // autoboxing

        // Autoboxing: retrieving primitive int from ArrayList<Integer>
        int retrievedValue = list.get(0); // autoboxing
        System.out.println("Retrieved value: " + retrievedValue);
    }
}

