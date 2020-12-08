package com.kavya.coreJavaPra;

public class ClassPractice {
	//ClassPractice cp1 = new ClassPractice();
	{
		System.out.println("Iam inside the IIB of ClassPractice");
	}
	static {
		System.out.println("Iam inside the SIB ClassPractice");
	}

public ClassPractice() {
	// TODO Auto-generated constructor stub
	System.out.println("Iam inside the Constructor of  ClassPractice");
}
 static int checkingStaticReference = 888;
public static void main(String[] args) {
	// TODO Auto-generated method stub
	ClassPractice cp = new ClassPractice();
	Customer1 c1  = new Customer1();
	
	c1.show();
	c1.cid = 20;
	c1.name = "Kavya";
	c1.salary = 30000;	
	c1.show();
	
	//Instance variables practice
	System.out.println(" Practicing Instance variables");
	int id1 = new Customer1().cid =89;
	System.out.println(id1);//new Customer().cid);
	System.out.println(Customer1.cid = 34);
	System.out.println(checkingStaticReference);//static variable accessing directly
	
	//STATIC variables practice
	System.out.println(Customer1.cid);
	System.out.println(new Customer1().name = "JAson");
	Customer1 c2 =null;
	//System.out.println(c2.cid);
	System.out.println(c2.cid);
	
	}
	
}


 class Customer1 {
 public Customer1() {
	// TODO Auto-generated constructor stub
	 System.out.println("Iam inside the Constructor of  Customer");
}
	static int cid;
	String name;
	int salary;
	
	//salary =10000; should be initialized in IIB
	
	{
		System.out.println("Iam inside the IIB of Customer");
		cid =23;
		System.out.println("Initialized cid");
	}
	static {
		System.out.println("Iam inside the SIB Customer");
	}
	
	
	
	void show() {
		System.out.println(cid);
		System.out.println(name);
		System.out.println(salary);
	}

}

