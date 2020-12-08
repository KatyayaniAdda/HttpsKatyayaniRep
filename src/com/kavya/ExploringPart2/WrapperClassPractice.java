package com.kavya.ExploringPart2;

public class WrapperClassPractice {

	public static void main(String[] args) {

		//Primitive to String
		int i =10;
		String stri = i +"abc";
		char ch1 = 'P';
		String charString =Character.toString(ch1);
		String stringValue = String.valueOf(i);
		String wrapperString =Integer.toString(i);
		System.out.println(stri.compareTo("10abc"));
		
		//String to primitive
		String str = "99";
		int num = Integer.parseInt(str);
		String s1 = "QB";
		char ch = s1.charAt(1);
		System.out.println(ch);
		
		//Primitive to Object
		byte b1 = 10;
		Byte objectByte = Byte.valueOf(b1);
		int i1 = 20;
		Integer intObject = Integer.valueOf(i1);
		
		//wrapper object to primitive
		byte b2 = objectByte.byteValue();
		int i2 = intObject.intValue();
		
		//String to wrapper object
		Integer wrapperInt = Integer.valueOf(str);
		Character c = new Character(s1.charAt(0));
		Character c1 = Character.valueOf(s1.charAt(0));
		
		//wrapper to String
		Integer wrapperInt1 = 128;//Integer.valueOf(12345);
		//System.out.println(wrapperInt+2);
		
		int i3=wrapperInt;
		Integer wrapperInt2 = 128;
		System.out.println(wrapperInt1 == wrapperInt2);
		
		String strInt = wrapperInt.toString();
		System.out.println(strInt+2);
		
		Long l = 123l;
		Double d =34.345;
		Boolean b3 = false;
		System.out.println(wrapperInt2.hashCode());
		Runtime rt =Runtime.getRuntime();
		System.out.println(rt.availableProcessors());
		
				
		
		
	}

}
