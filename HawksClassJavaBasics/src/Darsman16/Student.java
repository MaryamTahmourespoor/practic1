package Darsman16;

public class Student extends Person {

	

	public Student(String name,String family,int age,int studentId)
	{
	super(name,family,age);
	
	StudentId = studentId;
	}
	int StudentId;
	@Override
	int Sum(int a, int b) {
		
		return a-b;
	}
	@Override
	void print() {
		System.out.println("student is:"+ StudentId);
		
	}
	
}
