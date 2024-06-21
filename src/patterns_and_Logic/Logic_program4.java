package patterns_and_Logic;

public class Logic_program4 {

	public static void main(String[] args) {
		// Armstrong number
		
		//371=3^3+7^3+1^3=371
		
		int num=371,rem,sum=0;
		int num1=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			sum=sum+rem*rem*rem;  // 3 digit armstrong ke liye h
			//sum=sum+rem*rem*rem*rem;	// 4 digit armstrog ke liye h
			
		}
		if(num1==sum)
		{
			System.out.println("The number is armstrong number");
			
		}else
		{
			System.out.println("The number is not armstrong number");
		}

	}

}
