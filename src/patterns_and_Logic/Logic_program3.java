package patterns_and_Logic;

public class Logic_program3 {

	public static void main(String[] args) {
		//321=3+2+1=6
		int num =56789;
		int sum=0;
		while(num>0) 
		{
			int temp= num%10;
			num=num/10;
			sum=sum+temp;
		}
		System.out.println("Addition of number= "+sum);

	}

}
