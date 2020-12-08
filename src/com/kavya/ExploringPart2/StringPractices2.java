package com.kavya.ExploringPart2;

public class StringPractices2 {

	public static void main(String[] args) {

		String st1 = "JLbC9A9 ";
		int ab = 99;
		String st2 = "JLC";

		String st3 = st2 + ab;
		String st4 = "JLC" + 99;
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println("ABC".compareTo("abc"));
		System.out.println("ABCGH".compareTo("jh"));
		System.out.println(st1.startsWith(""));
		System.out.println(st1.indexOf("9A", 1));
		String check = "Website is www.jlcindia.com";
		String checkString2 = "info@jlcindia.com is id to send email";
		StringBuilder sb1 = new StringBuilder();
		sb1.ensureCapacity(8);
		sb1.append("Welcome to my world");
		System.out.println(sb1.getClass());
		System.out.println(sb1.append(878));
		System.out.println("Checking String Builder class equal method______");
		System.out.println(sb1.equals(checkString2));
		System.out.println();
		String splitArr[] = check.split("is");
		for (String string : splitArr) {
			System.out.println(string);
		}
		boolean b1 = check.regionMatches(15, checkString2,5,16);
		System.out.println(b1);
		System.out.println("checking String builder equals");
		System.out.println(sb1.equals(sb1));
		
		

	}
}
