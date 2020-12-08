package com.kavya.coreJavaPra;

public class ModifiresPractice extends ModifiresPractice1{
	private int a=10;
	 int b=2;
	protected int c = 30;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}
	
	protected void m1() {
		System.out.println("ModifiresPractice.m1() in subclass");
	}

	public static void main(String[] args) {
		ModifiresPractice1 mp1 = new ModifiresPractice1();
		System.out.println(mp1.b1);
		System.out.println(mp1.c1);
		System.out.println(mp1.getA());
		mp1.m1();

	}

}
