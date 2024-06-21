package javaPractice_Program;

public class Control_stmnt_Else_If_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int che_marks=45;
		if(che_marks>=40 && che_marks<60) {
			System.out.println("second class");
		}
		else if(che_marks>=60 && che_marks<75) {
			System.out.println("first class");
		}
		else if(che_marks>=75 && che_marks<90) {
			System.out.println("distinct");
		}
		else if(che_marks>=90 && che_marks<100) {
			System.out.println("merit");
		}
		else if(che_marks>100) {
			System.out.println("worng input ,enter the correct marks ");
		}
		else {
			System.out.println("failed in chemistry");
		}
		
	}

}
