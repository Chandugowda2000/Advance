package com.chandu.List;
import java.util.*;  
public class ArrayListExample {  
public static void main(String[] args) {  
    //ArrayList is better to store and view data  
    List<String> list=new ArrayList<>();  
    list.add("ankit");  
    list.add("peter");  
    list.add("mayank");  
      
    System.out.println("Traversing ArrayList...");  
    for(String s:list){  
        System.out.println(s);  
    }  
}
}