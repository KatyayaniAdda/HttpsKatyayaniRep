package com.kavya.coreJavaPra;

public class MultiDimArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int size =8;
		int c[] = new int[size];
		
		int arr1[][];
		int[] arr2[] = null;
		arr2 = new int[4][4];
		arr2[0][1]= 2323;
		System.out.println(arr2.length);
		
		int [][]arr3;
		final int []arr4[] = {{2,3},{4,5},{6,7}};
		int[] arr5[] = new int[3][4];
		
		arr4[1][1] = 5;
		Object ob = arr4;
		int value = arr4[1][0]+1;//+1 can use + on values but not on array reference variable
		//int b1 = ob[1][2]; Cant refer values with object reference
		//arr5 = arr4; can assign one array to other if both are of same type
		
		arr1 = new int[3][2];
		arr1[1][1] =98;
		System.out.println(arr1[2][1]);
		System.out.println(arr4[1][0]);
		int arr7[][][];
		arr7  = new int[][][]{{{3,5,6},{4,6,3}},{{13,15,16},{14,116,13}}};
		
		for(int ar[][]:arr7) {
			for(int a[]:ar) {
				//System.out.println("inside enhance for");
				for(int b:a)
				System.out.println(b);
			}
		}

	}

}
