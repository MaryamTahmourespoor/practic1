package Selection;

public class conditionalOperators {

	public static void main(String[] args) {
		
	int num1 =10;
	int num2=15;
	String x = num1>num2 ? " num1 is more than num2 " :"num1 is less num2 ";
		
		System.out.println(x);
		
		int y = num1 > num2 ? num1-- : num1++;
		System.out.println(y);
		
		double grade = 59 ;
		String s = "The student is ";
		s += (grade>=60)?"passing." : "failing.";
		System.out.println(s);
		
		int t =1;
		t+=10;  //11
		t = t+10;
		
		System.out.println(t);
		
		
//		char a = 'E';
//		switch(a)
//		{
//		case 'A':
//			System.out.print("In first four");
//		case 'E':
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.print("Is a vowel");
//		break;
//		case 'B':
//		case 'C':
//		case 'D':
//			System.out.print("In first four");
//		default:
//			System.out.print("Not a vowel");}
		
		
//		char a = 'B';
//		switch(a)
//		{
//		case 'A':
//			System.out.print("1");
//		case 'E':
//		case 'I':
//		case 'O':
//		case 'U':
//			System.out.print("2");
//		break;
//		case 'B':
//		case 'C':
//		case 'D':
//			System.out.print("3");
//		default:
//			System.out.print("4");
//			
	//	}
		
			
		
			
		
	}

}
