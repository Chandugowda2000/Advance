package com.chandu.Arrays;

public class MultidimensionArrays {


	public static void main(String[] args) {
		int[] n = {1,2,3,4,3};
		try {
		 
          System.out.println(n[7]);
		}
		catch (IndexOutOfBoundsException e) {
			System.out.println("Out if index");
		}
		

	}

}
