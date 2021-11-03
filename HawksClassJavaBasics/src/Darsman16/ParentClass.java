package Darsman16;

public class ParentClass {

	int Num1;
	int Num2;
	
	public ParentClass(int num1,int num2) {
		Num1 =num1;
		Num2 =num2;
		
			}
	void print()
	{
		System.out.println("Num1 Is :"+ Num1+"\tNum2 Is :"+Num2);
	}
	
	/////    final///////
	int Sum (int x ,int y)
	{
		return x+y;
	}
	
	
}


