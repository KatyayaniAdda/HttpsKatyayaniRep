package kavya.javaPractice.CoreJava;

public class PracticeMainclass extends Xyz {
	String x = "kjk";

	public static void main(String[] args) {
		
		Hai hai = new Hai();
		//hai.show1();
		PracticeMainclass kk = new PracticeMainclass();
		kk.show3();
		kk.x="Changed";
		Xyz xyz = kk;
		xyz.x = 989;
		kk.show3();
		
	}
	
	void show3() {
		
		
//		this.x = "Kavya";
//		System.out.println("&&&&&&&&&&\n");
//		System.out.println(this.x);
//		System.out.println(super.x);
		
		Xyz xyz = this;
		PracticeMainclass pcm =this;
		System.out.println("&&&&&&&&&&\n");
		System.out.println(xyz.x);
		System.out.println(pcm.x);
	}

}
