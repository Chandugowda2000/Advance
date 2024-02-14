package com.chandu.newtopic;

public class FinalVariable {

	
		final int d; // we need to always assign the values
		final String name;
		
		
		public FinalVariable() {
			
			this.d = 30;
			this.name = "chanduthra";
		}


		static final int a;// to initialize a
		static {
			a=30;
		}
	 
		public static void main(String[] args) {	
			FinalVariable v = new FinalVariable();
         System.out.println(a);
         System.out.println(v.d);
         System.out.println(v.name);
	}

}
