package com.kavya.coreJavaPra;

public class MethodsPracticeHello {
	static boolean show(int x,char ch) {
		
		System.out.println("show() in int" + x);
		return true;
	}

	/*
	 * static boolean show(char x,int i) { System.out.println("show() in char" + x);
	 * return true; }
	 */
	
	void showVarArgs(boolean b,float h,int... values){
		System.out.println("Inside int showVarArgs method");
		
	}
	
	void showVarArgs(int[]... values){
		System.out.println("Inside String ***showVarArgs method");
		
	}
}
