package javaPractice_Program;

public class Nested_If_Program 
{

	public static void main(String[] args) 
	{
		String pin="1234";
		double amount_in_acc =50000;
		double amount_to_withdraw=1000;
		
		if(pin=="1234") {
			if(amount_to_withdraw<=amount_in_acc)
			{
				System.out.println("We can debit the cash");//100,
				
			}
			else
			{
				System.out.println("Insufficient amount");
			}
			
		}
		else {
			System.out.println("Incorrect pin");
		}
		
	}

}
