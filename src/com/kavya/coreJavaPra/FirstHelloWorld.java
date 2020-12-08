package com.kavya.coreJavaPra;
import java.util.Scanner;

public class FirstHelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Variables obj = new Variables();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a");
	obj.setA(sc.nextInt());
		System.out.println("Value of a is"+obj.getA());
	}

}
