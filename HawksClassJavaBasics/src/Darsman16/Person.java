package Darsman16;

public  abstract class Person {

	String Name;
	String Family;
	int Age;
	
	public Person(String name,String family,int age)
	{
		Name=name;
		Family= family;
		Age=age;
	}
	
	abstract int Sum(int a,int b);
	abstract void print();
	
	
		public void printPersonInfo() {
	}
	
	{
		System.out.println("Name : "+Name+ "\tFamily :"+Family+"\tAge :"+ Age);
	}
}
