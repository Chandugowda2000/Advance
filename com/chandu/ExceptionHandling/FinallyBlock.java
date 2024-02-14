package com.chandu.ExceptionHandling;

class Finalone{
	 public static void divide(int x,int y) {
		 int d;
			try {
				System.out.println("----------------Try Block-------------");
				d=x/y;
				System.out.println("result"+d);
			}
			catch(ArithmeticException e) {
				System.out.println("---------------- Catch block-----------");
				System.out.println("We can't divide the number"+e.getMessage());
			}
			finally {
				System.out.println("-----------Final Block---------------");
			}
			System.out.println("--------End of the program ---------");
	 }
}
public class FinallyBlock {

	public static void main(String[] args) {

          Finalone.divide(2, 0);

	}

}
