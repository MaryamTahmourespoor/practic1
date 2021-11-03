package staticExamples;

import java.text.ParseException;

public class Runner {

	public static void main(String[] args) {
		
		//static is a non-access modifier or specifier 
		//you can add it to your variables or methods
			
		//static member belongs to the class and not to the objects
		//static call is done by referring to the class do  the member name
		//example : Student.count
		
		Student obj1= new Student("Jack");
		Student obj2= new Student("David");
		Student obj3= new Student("David");
		Student obj4= new Student("David");
		
		obj4.count = 10;
		 
		System.out.println(obj4.count);
	//	System.out.println(obj2.count);
		System.out.println(Student.count);
		 
		
		System.out.println(CalculationExample.div(10,10));
		
		System.out.println(Math.round(Math.PI));
		
		System.out.println(Math.pow(3,3));
		
	//	3^3 == 3 * 3 * 3 = 27
		

		System.out.println(power(3,3));
}
	 
	 public static double power(double a ,double b) {
	 double res= 1;
		 for (int i = 0; i < b; i++) {
		res *=a;
			 System.out.println( i + " - ");
	}
	return res;
	
	}
	
	
}
