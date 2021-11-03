package Darsman16;

public class Mainclass {
   
	public static void main(String[] args) {
	
		
		Student student1= new Student("Ali","Abasi" , 25,1);
		Teacher teacher1=new Teacher("Bahar", "abed", 15,10);
	 
	 student1.printPersonInfo();
	 teacher1.printPersonInfo();
	System.out.println();
	
	Person s1=new Student("ali", "abedi", 29, 10);
	Person s2=new Student("baran", "afra", 25, 102);
	Person t1=new Teacher("Ahmad", "moradi", 30, 200);
	
	s1.printPersonInfo();
	s1.print();
	System.out.println("***************");
	s2.printPersonInfo();
	s2.print();
	System.out.println("***************");
	t1.printPersonInfo();
	t1.print();
	
	
	}
}
