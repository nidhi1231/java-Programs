package javaPractice_Program;

public class Variable_Program2 {

	static int a =100;
	int b=20;
	
	 public void show() {
		 System.out.println("a= "+a);
		 System.out.println("b= "+b);
		a++;
		b++;
		System.out.println("a value is= "+a);
		System.out.println("b value is= "+b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//System.out.println("a= "+a);
		Variable_Program2 a1 = new Variable_Program2();
		a1.show();
		Variable_Program2  b1 = new Variable_Program2();
		b1.show();
	}

}
