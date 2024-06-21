package basicJava_Program;

public class Demo_Static_MemoryManagement {
	
	static int a=10;
	 int b=20;
	
	public void show() {  // non static method
		a++;
		b++;
		System.out.println("a = "+a+ " "+"b = "+b);
		
	}
	
	/*public static void show() { // static method declaration
		a++;
		b++;
		System.out.println("a = " +a + " "+"b = "+b);
	} */
	

	public static void main(String[] args) {

      //show(); // static method calling
		
		Demo_Static_MemoryManagement obj = new Demo_Static_MemoryManagement();
		obj.show();
		
		Demo_Static_MemoryManagement obj1 = new Demo_Static_MemoryManagement();
		obj1.show();
	}

}
