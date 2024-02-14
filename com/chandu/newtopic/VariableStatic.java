package com.chandu.newtopic;
// Memory Allocation using Static 

class Studente{
	String name,srn;
	static String collegename="Reva";

	public Studente(String name, String srn) {
		
		this.name = name;
		this.srn = srn;
		
	}

	void display() {
		System.out.println(name+" "+srn+" "+ collegename);
	}
}


public class VariableStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Studente s1=new Studente("R20EF021","chandu");
		s1.display();
		Studente s2=new Studente("R20EF022","rani");
		s2.display();
        
	}

}
