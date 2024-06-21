package basicJava_Program;

public class Demo_Nested_If_Statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int marks = 30;
		
		 if(marks>=40 && marks<60) {
			
			 System.out.println("second class");
			
		}
		else if(marks>=60 && marks<75) {
			System.out.println("first class");
			
		}else if(marks>=75 && marks<90) {
			
			System.out.println("distinction");
		}else if(marks>=90 && marks<100) {
			System.out.println("Merit");
		}else if(marks>100) {
			System.out.println("wrong input ");
			
		}else {
			System.out.println("Failed");
		}
	}

}
