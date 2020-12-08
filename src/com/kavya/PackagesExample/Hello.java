package com.kavya.PackagesExample;

public class Hello {

    final int sid ;
    protected int check;
	String sname = "JAson";
	
	public final static int q;//= 10;

	public static int a;
	int b;
	protected void display() {}
	static {
		a = 10;
		q=9;
		System.out.println("Intialized in SIB of Hello\t" + a);
	}

	{
		a = 10;
		System.out.println("Intialized in IIB of Hello\t" + a);
	}

	public Hello() { // TODO Auto-generated constructor stub
		sid = 30;
		System.out.println("In default constructer of Hello");
	}

	Hello(int sid, String sname) {
		System.out.println("In the 2-Argument Constructor of Hello");
		this.sid = sid;
		sname = sname;
		System.out.println(sid + "\t" + this.sname);
		return;//we can use empty return statement inside the constructor
	}

	public void show() {
		System.out.println(sid + "\t" + this.sname);
	}

}
