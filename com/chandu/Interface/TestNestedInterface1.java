package com.chandu.Interface;

interface chat{
	void show();
// Nested Interface 

interface Message{
	void msg();
}
}// CLosing interface Chat
public class TestNestedInterface1 implements chat.Message {
	// chat.Message indicate that chat has nested interface Message


	@Override
	public void msg() {
	System.out.println("Welcome to new world");	
		
	}
public static void main(String[] args) {
	chat.Message cm =new TestNestedInterface1();
	cm.msg();

	}

	

}
