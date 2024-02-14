package com.chandu.ExceptionHandling;

public class ThrowException {
	
	public static void validate(int a) throws ArithmeticException {
		
		
		if(a<18) {
			throw  new ArithmeticException("Person is not eligibale");
		}
		else {
			System.out.println("Eligible");
		}
		}
		
		
	

	public static void main(String[] args) {
		
		validate(1);
		System.out.println("Code Done");

	}

}
