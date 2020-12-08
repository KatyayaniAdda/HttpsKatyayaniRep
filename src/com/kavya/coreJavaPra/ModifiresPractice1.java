package com.kavya.coreJavaPra;

public class ModifiresPractice1 {
	private int a1=10;
	 int b1=2;
	protected int c1 = 30;
	protected  void m1() {
		System.out.println("ModifiresPractice1.enclosing_method() in superclass");
	}

	public int getA1() {
		return a1;
	}

	public void setA1(int a1) {
		this.a1 = a1;
	}

	public int getB1() {
		return b1;
	}

	public void setB1(int b1) {
		this.b1 = b1;
	}

	public int getC1() {
		return c1;
	}

	public void setC1(int c1) {
		this.c1 = c1;
	}

	public int getA() {
		return a1;
	}

	public void setA(int a) {
		this.a1 = a;
	}

	public static void main(String[] args) {

		ModifiresPractice mp =new ModifiresPractice();
		System.out.println(mp.b);
		System.out.println(mp.getA());
	}

}
