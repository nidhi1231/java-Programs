package patterns_and_Logic;

public class Logic_program1 {

	public static void main(String[] args) {
		// factorial program
		
		//5 factorial = 5*4*3*2*1=120
		int num=3,fact=1;
		for(int i=1;i<=num;i++) 
		{
			fact=fact*i;
			
		}
		System.out.println("Factorial number = "+fact);

	}

}
