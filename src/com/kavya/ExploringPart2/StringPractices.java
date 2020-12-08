package com.kavya.ExploringPart2;

import java.util.Scanner;

public class StringPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String();
		byte b[] = new byte[3];
		b[0] = 'd';
		b[1] = 'o';
		b[2] = 'g';

		String byteStr = new String(b);
		String stringStr = new String("kavya");
		char charArray[] = new char[10];
		charArray[0] = '1';
		charArray[1] = '1';
		charArray[2] = '3';
		charArray[3] = '4';
		charArray[4] = '5';
		charArray[5] = '6';
		charArray[6] = '7';
		String charString = new String(charArray, 2, 4);
		System.out.println("Printing");
		System.out.println(charString.isEmpty());
		System.out.println(charString);
		System.out.println(byteStr);
		String stringStr1 = "kavya";
		System.out.println(stringStr.equals(stringStr1));
		System.out.println(stringStr1.intern());
		System.out.println(stringStr1.concat("Adda"));
		System.out.println(stringStr1.trim());
		System.out.println(String.valueOf(charArray));
		System.out.println(stringStr1.charAt(4));
		System.out.println(stringStr1.startsWith("v", 2));
		System.out.println(stringStr1.indexOf("y"));
		System.out.println(stringStr1.replace('a', 'l'));
		System.out.println(stringStr1.matches("kavya"));
		System.out.println(stringStr1.contains("vy"));
		System.out.println(stringStr1.regionMatches(0, "ka", 0, 3));
		Scanner sc = new Scanner(System.in);
		String inpString1 = sc.nextLine();
		String inpString2 = sc.nextLine();
		System.out.println(inpString1==inpString2);
	}

}
