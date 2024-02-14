package com.chandu.Arrays;

import java.util.Arrays;

public class SingleDimension {

	public static void main(String[] args) {
		int intArr[]= {12,13,14,15};
		
		System.out.println("array IS="+ Arrays.toString(intArr));
		
		Arrays.sort(intArr);
		
		System.out.println("-------After Sorting -------");
		System.out.println("Arrays is ="+Arrays.toString(intArr));
		
		//binary Search it needs to sort and then check for the keys
         int key =22;
         
         System.out.println(key + "found at index" + Arrays.binarySearch(intArr, key));
         
         System.out.println(key + "found at index" + Arrays.binarySearch(intArr,1,2, key));
         
         //new Arrays List for the checking equals.
         int inArr1[] = {12,13,14,15};
         
         if(Arrays.equals(intArr, inArr1))
        	 System.out.println("Both are Equals");
         else
        	 System.out.println("Not Equls");
         
         int intArr2[]= Arrays.copyOf(inArr1, 4);
         System.out.println("Now the Copy of the Arrays");
         System.out.println("array IS="+ Arrays.toString(intArr2));// we can specific the indexes
         
         Arrays.fill(intArr2, key);
         // all the elements is replaced with the key values
         
         System.out.println("array IS="+ Arrays.toString(intArr2));
	}

}
