package com.chandu.Interface;
interface MyInterface{
	void myMethod(int x);
}
public class LambdaExample {

	public static void main(String[] args) {
		
		// creating the Lambda expression
		MyInterface my=(x)-> {
			System.out.println("The value of x is= "+x);
		};
      my.myMethod(19);
	}

}
