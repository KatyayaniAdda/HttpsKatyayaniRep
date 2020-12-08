package com.kavya.coreJavaPra;

public class ArraysPractice {

	static String strArr[];
	static int arr4[];
	static char chArr[];
	static void show(int arr[]){
		System.out.println(arr.length);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(arr4);
		//System.out.println(chArr);gives NPE since it is char array
		
		int brr1[] ={10,20,30};
		//Anonymous Array
		int anArray[]=null;
		anArray = new int[] {2,3,4,5 ,9};
		show(new int[] {2,4,5,5});
		System.out.print("using foreach statement");
		for(int ar:anArray) {
			System.out.print(ar);
			
		}
		
		
		//ArrayDeclaration
		final int []arr1 = new int[5];
//		int arrNew[] = arr1;
		//arr1 = new int[10];
		int arr2[] = new int[5];
		byte[] arr3 = new byte[3];
		float[] arr6 = new float[3];
		char[] arr8 = new char[3];
		arr8[0]='a';
		double[] arr7 = new double[3];
		System.out.println(arr1[0]);
		System.out.println(arr2[0]);
		System.out.println(arr3[0]);
		System.out.println(arr6[0]);
		System.out.println(arr7[0]);
		System.out.println(arr8[0]);
		int arr5[];
		//System.out.println(arr5);
		System.out.println(arr4);
		System.out.println(strArr);
		System.out.println(arr3);
		System.out.println(arr3.clone());
		double d1=3.8d;
		int arr9[] =new int[(int)d1];
		//arr9.length =89;length is the final variable so value cant be modidfied
		System.out.println(arr9.length);
		System.out.println(args[0]);
		//ArraysPractice.main(args);
		

	}

}
