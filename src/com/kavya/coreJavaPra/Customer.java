package com.kavya.coreJavaPra;

public class Customer {
 public Customer() {
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
