package com.kavya.coreJavaPra;

public class InheritancePractieSuper{
	static int b = 99;
	static {
		System.out.println("In static block of InheritancePractieSuper class"+b);
	}
	
	public  void show() {
System.out.println("IN SUPER class show method");		
	}
	{
		System.out.println("In Instance block of InheritancePracticeSuper class"+b);
	}
	
	public InheritancePractieSuper() {
		System.out.println("In Constructor  of InheritancePracticeSuper class");
	}
}
