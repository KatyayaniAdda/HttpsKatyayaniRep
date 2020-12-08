package com.kavya.coreJavaPra;

public class InheritancePractice extends InheritancePractieSuper{
	
	static int a =88;
	static{
		System.out.println("In static block of InheritancePractice class");
	}

	{
		System.out.println("In Instance block of InheritancePractice class"+a);
	}
	
	public InheritancePractice() {
		System.out.println("In Constructor  of InheritancePractice class");
	}
	
	public InheritancePractice(int i) {
		//this();
		super();
		System.out.println("In Constructor  of InheritancePractice class-- INT");
	}
	
	public  void show() {
		super.show();
		//this.show();
		System.out.println("IN Original(sub) class show method");		
			}

	
}
