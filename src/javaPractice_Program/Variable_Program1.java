package javaPractice_Program;

public class Variable_Program1 {
	
	static int a =10;// global variable
	
	public static void show() {
		int b=20; // local variable
		System.out.println("b= "+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  System.out.println("a= "+a);
	  show();

	}

}
