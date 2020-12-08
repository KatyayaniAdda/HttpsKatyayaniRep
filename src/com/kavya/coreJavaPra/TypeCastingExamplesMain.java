package com.kavya.coreJavaPra;

public class TypeCastingExamplesMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassD dobj = new ClassD();
		
		ClassA aobj =new ClassD();
		
		ClassB bobj =new ClassD();
		//ClassC cobj1 =(ClassC) aobj;
		ClassC cref = new ClassC();
	    // aobj =cref;
	     System.out.println(aobj instanceof ClassB);
	     System.out.println(bobj instanceof ClassD);
	     System.out.println(aobj instanceof ClassA);
	     System.out.println(aobj instanceof ClassC);
	     System.out.println(bobj== aobj);
	     
	     if(aobj instanceof ClassC) {
	    	 ClassC cobj =(ClassC) aobj;	    	 
	     }
	     

	}

}
