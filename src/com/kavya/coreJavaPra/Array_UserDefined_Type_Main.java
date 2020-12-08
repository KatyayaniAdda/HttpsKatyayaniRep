package com.kavya.coreJavaPra;

public class Array_UserDefined_Type_Main {

	public static void main(String[] args) {
		//Inter1 in1 = new Hello2();
		//in1.m1();
		//System.out.println(in1.toString());
		//Object obj=in1;
		//System.out.println(in1.toString());
		
		//Inter1 arr[] = new Inter1[3];
		//Inter1 arr[] = new A[3];
		Inter1 arr[] = new B[3];
		arr[0] = new A();
		arr[1] = new B();
		arr[2] = new C();
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}

}

interface Inter1 {
	//void m1();
}

class A implements Inter1{}
class B extends A {}
class C extends A{}




class Hello2 implements Inter1 {

//	@Override
//	public void m1() {
//		System.out.println("In Hello-->m1()");
//	}

	public void m2() {
		System.out.println("In Hello-->m2()");
	}
}