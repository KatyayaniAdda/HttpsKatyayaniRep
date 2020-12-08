package com.kavya.coreJavaPra;

public class Identifiers {

	int add() {
		return 2+3;
	}

    int a;
	short b;
	long c;
	byte d;
	float e;
	double f;
	String g;
	Identifiers h1;
	char ch;
	
	
	void show(){
		char ch =66;
		System.out.println(++a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h1);
		System.out.println("Printing Character");
		System.out.println(ch);
		System.out.println(ch=='a');
		System.out.println(ch=='\u0000');
		char ch1 = '\65';
		char ch2= '\u0003';
		char ch3 = '\r';
		char ch4 = '\377';
		char ch6 ='/';
		String str2 = "u0002";
		System.out.println("Printing octal character");
		System.out.println(ch4);
		System.out.println(str2);
		int ch5= ch4;
		System.out.println(ch5);
		/*
		 * for(char i=0;i<=250;i++) { System.out.println(i);
		 * 
		 * }
		 */
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Identifiers Iden = new Identifiers();
		Iden.show();
		final int A;
		A=98;	
		
		System.out.println(A);
		
		

	}

}
