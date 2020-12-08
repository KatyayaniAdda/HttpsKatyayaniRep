package com.kavya.coreJavaPra;
class Outer{
	int a =10;
	static int b=20;
	void m1() {
		System.out.println("Outer m1()");
		//Outer.Inner inner = new Outer().new Inner();
				Inner inner =new Inner();
				inner.show();
				System.out.println(inner.x);
	}
	static void m2() {
		System.out.println("Static Outer--> m2()");
	}
	
	class Inner{
		static final int x=11;
		void show() {
			System.out.println("Inner--> show()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
		}
	}
}



 public class InnerClassesConcept {

	public static void main(String[] args) {

		Outer outOb = new Outer();
		outOb.m1();
		outOb.m2();
		
		Outer.Inner inObj = outOb.new Inner();
		Outer.Inner inObj1= new Outer().new Inner();
		inObj.show();
		
		
	}

}
