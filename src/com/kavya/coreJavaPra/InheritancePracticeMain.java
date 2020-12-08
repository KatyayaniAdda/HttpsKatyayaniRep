package com.kavya.coreJavaPra;

public class InheritancePracticeMain {

	public static void main(String[] args) {
		// System.out.println("In main method class\n");
		// new InheritancePractice();
		// System.out.println("In main method class after\n");
		// new InheritancePractieSuper();
		// System.out.println(InheritancePractice.a+InheritancePractieSuper.b);
		System.out.println("In main\n");
		//InheritancePractieSuper.show();
		//InheritancePractice.show();
		//new InheritancePractieSuper().show();
		InheritancePractice ip= new InheritancePractice(10);
		ip.show();
	}

	static {
		System.out.println("InS.B of main\n");
	}
}
