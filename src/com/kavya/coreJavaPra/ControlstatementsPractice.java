package com.kavya.coreJavaPra;

public class ControlstatementsPractice {
	enum ClassCourses{
		CORE,ADV;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=99;
		if(a==99) {
			int b=8;
			System.out.println("Both are equal"+a);
		}
		
		switch(999) {
		case 1: System.out.println("Case is 1");
		break;
		case 2: System.out.println("Case is 2");
		break;
		case 99: System.out.println("Case is 99");
		break;
		default: System.out.println("Case is default");
			}
		//ControlstatementsPractice.ClassCourses ClassCourses;
		switch(ClassCourses.CORE) {
	case ADV: System.out.println("Case is Advanced");
	break;
	default: System.out.println("Case is default");

	}
		int i;
		char ch;
		for(i=3,ch='2';i>6;)
		System.out.println("For Statement");
		System.out.println("For Statement");

		   boolean b1= false;
		for(;b1;) 
			System.out.println("For Statement boolean");
			System.out.println("For Statement boolean after");
			
			//break with label usage
			One:
			for (int h=0;i<=5;h++) {
				for(int j=0;j<4;j++) {
					System.out.println("value of h is"+h +"and value of j is "+j);
					if(h==3)
						break One;
					System.out.println("For Statement");
				}
			}
			
		//Break using label in blocks 
			
			int ab=10;
			blockOne:{
				System.out.println("Block one statement--before break");
			if(ab==10)
				break blockOne;
			System.out.println("Block one statement--after break");
			}
			
			//continue statement
			for(int i1=0;i1<=5;i1++) {
				if(i1==3)continue;
				System.out.println(i1);
				//continue;
			}
			
			
	}
}