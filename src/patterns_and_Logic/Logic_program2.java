package patterns_and_Logic;

public class Logic_program2 {

	public static void main(String[] args) {
	//reverse program
		//int num=12345;
		//String strNum=Integer.toString(num);
		String str="Harry Potter";
		String strReverse="";
		char ch;
		
		/*for(int i=strNum.length()-1;i>=0;i--) // reverse number
		{
			ch= strNum.charAt(i);
			strReverse=strReverse+ch;
		}
		System.out.println("Reverse String = "+strReverse);
      */
		for(int i=str.length()-1;i>=0;i--) // reverse string
		{
			ch=str.charAt(i);
			strReverse=strReverse+ch;
		}
		System.out.println("Reverse stirng = "+strReverse);
		
	}

}
