package javaPractice_Program;

public class Loop_Program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		// using for loop  : Program to print 1 to 9
		System.out.println("Using for loop");
		for (int i=1;i<=9;i++) {
			System.out.println(i);
		}
		
		// using while loop
		System.out.println("Using While Loop");
		int j=1;
		while(j<=9) {
			System.out.println(j);
			j++;
		}
		
		// using do-while loop
		System.out.println("Using do-while loop");
		int k=1;
		do {
			System.out.println(k);
			k++;
		}while(k<=9);
		
		
	}

}
