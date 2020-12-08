package kavya.javaPractice.CoreJava;

public class MethodsPracticeMain {

	public static void main(String[] args) {
		MethodsPracticeHello h = new MethodsPracticeHello();
		//h.show(20);
		//new MethodsPracticeHello().show(110);
		new MethodsPracticeHello().show('A','8');
		//System.out.println(MethodsPracticeHello.show((char)65));
		
		h.showVarArgs(new int[]{3,5});
	}

}
