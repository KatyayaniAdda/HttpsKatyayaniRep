package com.kavya.coreJavaPra;

public class StringLiterals {
	static String str1;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path = "D:\new\test\batch";
		System.out.println(path);
	    path = "D:\\new\\test\\batch";
	    System.out.println(path);
	    
	    //Decimal literals
	    long a=9923456779L;
	    System.out.println(a);
	  //octal literals
	    int b=07234567;
	    System.out.println(b);
	    
	  //Hexadecimal literals
	    long c=0XFFFFFFF;
	    System.out.println(c);
	    
	  //Binary literals
	    long d=0b10;
	    System.out.println(d);
	    
	  //float literals
	    float e= 12987.63f;
	    System.out.println(e);
	    

	    double f= 0X2p4;
	    System.out.println(f);
	    
	    
	    //null literal
	    String str=null;
	    System.out.println(str);
	    
	    //underscore in numbers
	    int _n1 =2_3_4_5;
	    int n2=_n1;
	    int n3 = 0b10_00;
	    float n4 = 124354_5.454f;
	    double d1= 0X2p43_9;
	    System.out.println(_n1);
	    System.out.println(d1);
	    
	    
	    
	    
	    
	    

	}

}
