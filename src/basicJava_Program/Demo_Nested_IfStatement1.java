package basicJava_Program;

public class Demo_Nested_IfStatement1 {

	public static void main(String[] args) {
		
		String userName="Admin";
		String password="Admin@1234";
		
		if(userName=="Admin") {
			  if(password=="Admin@1234") {
				  
				  System.out.println("Login Successfully!!");
			  }
			  else {
				System.out.println("Incorrect Password!!");
				  
			  }
		}
		else {
			System.out.println("Incoreect Id!!");
			
		}

	}

}
