package com.kavya.coreJavaPra;

abstract class Person {
	public abstract void sleeping();
}

//class Student extends Person {
//
//	@Override
//	public void sleeping() {
//		System.out.println("Student is sleeping");
//	}
//
//}

class AnonymousClasConcept {

	public static void main(String[] args) {
		//Person p = new Person();cannot instantiate
		//Person p = new Person() {};
		Person student = new Person() {
			
			@Override
			public void sleeping() {
				System.out.println("Student is sleeping in Anonymous class");				
			}
			
			public void reading() {
				System.out.println("Student is reading in Anonymous class");				
			}
		};
		
		student.sleeping();
		AnonymousClasConcept a = new AnonymousClasConcept();
		a.m1();
		student.sleeping();
	}
	
	void m1() {
		System.out.println("Entered m1()");
	}

}
