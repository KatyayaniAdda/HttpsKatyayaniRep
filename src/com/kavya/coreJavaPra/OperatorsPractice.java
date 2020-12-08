package kavya.javaPractice.CoreJava;

public class OperatorsPractice {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=-2;
		System.out.println(a);
		
		final byte b = 91;
		final byte b2 =92;
		int b1 =+b;
		final int c = 5 ;
		byte b3 = c;
		System.out.printf("sum of %d and %d is %d",b,b2,b+b2);
		System.out.printf("\n");
		
		
		char a1 = 'A';
		int a2 =-a1;
		System.out.println(a2);
		
		float f1 = 123243434;
		long l1 = 838748748l;
		float f2 = f1+l1;
		
		int k =10;
		k = k++;
		System.out.println(k);
		k = ++k;
		k = ++k;
		System.out.println(k);
		//Comparison operator
		System.out.println(k==k);
		OperatorsPractice op = new OperatorsPractice();
		System.out.println(op instanceof Object);
		
		//Conditional Operator
		Object x = 10>20? "ten":"twenty";
		final int h = 'k';
		System.out.println("Checking integer storage\t"+0.0/0.0);
		//Bitwise operators
		
		int bo = 26;
		int yo =40;
		System.out.println(bo<<1);
		System.out.println(bo<<1);
		System.out.println(bo>>1);
		System.out.println(~bo);
		System.out.println(bo&yo);
		
		
			}
	
	

}
