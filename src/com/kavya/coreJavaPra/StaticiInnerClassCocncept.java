package com.kavya.coreJavaPra;

class Outer1{
	int a =10;
	static int b=20;
	void m1() {
		System.out.println("Outer1 m1()");
     	//Inner inner =new Inner();
		//inner.show();
		//System.out.println(inner.y);
		System.out.println(new Inner().x);
	}
	static void m2() {
		System.out.println(" Outer1--> m2()");
	}
	
	static class Inner{
		int x=10;
		static int y=11;
		void show() {
			System.out.println("Inner--> show()");
			//System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
		}
		static void m3() {
			System.out.println(" Static iNNER --> m3()");
		}
		
	}
	
}
class C1 extends Outer1.Inner{}


 public class StaticiInnerClassCocncept {

	public static void main(String[] args) {

		Outer1 outOb = new Outer1();
		outOb.m1();
		outOb.m2();
		
		Outer1.Inner inObj = new Outer1.Inner();
		inObj.show();
		inObj.m3();
		inObj.show();
		
		
	}

}

