package javaPractice_Program;

public class Switch_Case_Program {

	public static void main(String[] args) {

     int num1 =50;
     int num2 = 20;
     char operation = '+';
     
     switch(operation) {
     
     case '+':
    	 System.out.println("Addition = "+(num1 + num2));
    	 break;
     case '-':
    	 System.out.println("Subtracton = "+(num1 - num2));
    	 break;
     case '*':
    	 System.out.println("Multiplication = "+(num1 * num2));
    	 break;
     case '/':
    	 System.out.println("Division = "+(num1/num2));
    	 break;
    	 default:
    		 System.out.println("Wrong operation");
     }
     

	}

}
