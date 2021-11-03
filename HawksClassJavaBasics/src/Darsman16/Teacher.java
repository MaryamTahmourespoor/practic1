package Darsman16;

public class Teacher extends Person{

 public Teacher(String name,String family,int age,int teacherCode){
	
		super (name,family,age);
		TeacherCode=teacherCode;
	
	}
		int TeacherCode;
		@Override
		int Sum(int a, int b) {
			
			return a+b+100;
		}
		@Override
		void print() {
			System.out.println("Teacher is :"+ TeacherCode);
			
		}
}
