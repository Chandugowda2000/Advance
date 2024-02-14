package com.chandu.newtopic;

class Teste{
	private static int srn;
	private int section;
	
	static {
		System.out.println("Static Variable");
		srn=1000;
	}

	public Teste() {
		System.out.println("--------------Default Constructor -------------");
		srn++;
		section++;
	}

	@Override
	public String toString() {
		return "Test [section=" + section + ", SRN= "+srn+"]";
	}
	 static void display() {
		 System.out.println(srn+"SRN ");
		 //in static method we can't able to access the non-static variable
		 //System.out.println(section+"section");
	 }
	
}

public class OnlyStatic {

	public static void main(String[] args) {
		
		Teste t = new Teste();
		System.out.println(t);
		
		t.display();
		
		Teste t1 = new Teste();
		System.out.println(t1);
		t1.display();
	}

}
