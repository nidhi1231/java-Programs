package patterns_and_Logic;

import java.util.Scanner;

public class Logic_Program {

	public static void main(String[] args) {
		// Even odd program
		int num;
		System.out.println("Enter any number= ");
		Scanner sc= new Scanner(System.in);
		num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("This number is Even number");
		}
		else
		{
			System.out.println("This number is Odd number");
		}

	}

}
