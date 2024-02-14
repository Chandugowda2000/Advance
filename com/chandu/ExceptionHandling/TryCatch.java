package com.chandu.ExceptionHandling;

public class TryCatch {

	static void divsion(int a, int b) {
		int d;
		try {
			System.out.println("----------------Try Block-------------");
			d=a/b;
			System.out.println("result"+d);
		}
		catch(ArithmeticException e) {
			System.out.println("---------------- Catch block-----------");
			System.out.println("We can't divide the number"+e.getMessage());
		}
	}

}
