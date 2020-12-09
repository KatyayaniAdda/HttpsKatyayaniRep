package com.kavya.ExploringPart2;

import java.io.IOException;
import java.math.BigInteger;

public class RuntimeMathClassPractice {

	public static void main(String[] args) throws Exception {

		Runtime rt = Runtime.getRuntime();
		Process p = rt.exec("mspaint");
		System.out.println("After opening mspaint through Runtime class");
		p.destroy();
		//MAth class
		
		System.out.println(Math.abs(123.5232));
		System.out.println(Math.E);
		
		BigInteger b  = new BigInteger("234354676879445");
		System.out.println(b.add(b));
		
		
	}

}
