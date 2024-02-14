package com.chandu.methodoverlodding;

public class DynamicBinding {

	public static void main(String[] args) {
		
		// Dynamic binding// Method Overriding // run time Ploymorism
		
		MainBank mb;
		
		mb = new Subbank1();
		
		System.out.println(mb.getRateOfInterst());
		
		mb = new Subbank2();
		System.out.print(mb.getRateOfInterst());
		
		

	}

}
