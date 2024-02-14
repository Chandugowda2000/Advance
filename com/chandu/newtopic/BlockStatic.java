package com.chandu.newtopic;

class Write{
	static int a=10;
	// static is executed before the instance is created
	static void display() {
		System.out.println(a);
		
	}
}
public class BlockStatic {
	
	// static block can't be executed without main method
	static void read(){
		System.out.println("Hi, welcome");
	}
	

	public static void main(String[] args) {
		
		read();
		Write w =new Write();
		w.display();
		
		
		// Instance block
		{
			System.out.println("This Reva University");
		}

	}

}
