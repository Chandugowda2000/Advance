package com.chandu.Arrays;

import java.util.Arrays;

class Student2{
	String name;
	int srn;
	public Student2(String name, int srn) {
		super();
		this.name = name;
		this.srn = srn;
	}
	public Student2() {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSrn() {
		return srn;
	}
	public void setSrn(int srn) {
		this.srn = srn;
	}
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", srn=" + srn + "]";
	}
	
	
}
public class OniDimensinEx {

	public static void main(String[] args) {
		Student2 arr[]= new Student2[3];
		
		arr[0]=new Student2("Chai",21);
		arr[1]=new Student2("Chai",21);
		arr[2]=new Student2("Chai",21);
		
		System.out.println(Arrays.toString(arr));
		
		// in other ways to create using For loop
		Student2[] arr1 =new Student2[200];
		
		for(int i=0;i<arr1.length; i++) {
			arr1[i]=new Student2();
		}
		
       for(int i=0;i<arr1.length;i++) {
    	   System.out.println(arr1[i].getName());
       }
	}

	

}
