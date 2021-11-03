package Darsman16;

public class ChildClass extends ParentClass{

	String Name;
	
	public ChildClass(String name,int num1,int num2) {
		
		super(num1, num2);
		Name =name;
	}
		void print()
		{
	System.out.println("Num1 Is :"+ Num1+"\tNum2 Is :"+Num2);
		}
		
	int Sum (int x ,int y)
	{
	int s=x+y;
    
	System.out.println("Sum Is :" + s);
	 return s;	
		}
			



}
	

