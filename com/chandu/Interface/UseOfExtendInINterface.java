package com.chandu.Interface;
interface Animale{
	void print();
}

interface Dog extends Animale{
	void sound();
}
public class UseOfExtendInINterface implements Dog {

	

	@Override
	public void print() {
		System.out.println("Animal Name is Dog");
		
	}

	@Override
	public void sound() {
		System.out.println("Sound of Dog id Barking");
		
		
	}
	public static void main(String[] args) {
		UseOfExtendInINterface ue=new UseOfExtendInINterface();
		ue.print();
		ue.sound();
		
	}
}
