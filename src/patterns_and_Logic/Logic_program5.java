package patterns_and_Logic;

public class Logic_program5 {
	// prime number or not prime number

	public static void main(String[] args) {
		int num=2;
		int count=0;
		for(int i=2;i<num/2;i++) 
		{
			if(num%i==0)
			{
				count++;
				break;
			}
		}
		if(count==1)
		{
			System.out.println("Not prime");
		}else
		{
			System.out.println("Prime");
		}

		
		
	}

}
