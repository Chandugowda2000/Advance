package com.chandu.ExceptionHandling;

class Nested{
	
	public static void checK() {
		
		String a= "ABC";
		String b = null;
		
        int y =1;
        
        try {
        	   // inner try Block
        	try {
        		 System.out.println(a.charAt(y));
        	}
        	catch(StringIndexOutOfBoundsException ex) {
        		System.out.println(" The index value of the String is="+ex.getMessage());
        	}
        	System.out.println(b.length());
        	
        }catch(NullPointerException x) {
        	System.out.println("The String is Null"+x.getMessage());
        }
	}
}

public class NestedTryCatch {

	public static void main(String[] args) {
		Nested.checK();

	}

}
