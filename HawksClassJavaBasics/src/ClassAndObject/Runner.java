package ClassAndObject;

 public class Runner {
    
	 public static void main(String[] args) {
//			// how to create objects of a class
//			// datatype name = value
//			// data-type name; <<< declaration
//			// name = new data-type(); <<< initialization
//			// data-type(Class Name) name = new data-type(Class Name)();
//		
//		 Student st1 = new Student(); // << we assigned values to this
//			Student st2 = new Student(); // << we now assigned values to this Ahmad and 25
//			Student st3 = new Student();
//			Student st10 =new Student();
//			Student st99 =new Student();
//			st1.name = "Jack";
//			st1.age = 18;
//			st1.id = 1;
//			st1.gender = 'M';
//			st2.name = "Ahmad";
//			st2.age = 25;
//			st2.id = 2;
//			st2.gender = 'M';
//			st3.name = "David";
//			st3.age = 35;
//			st3.id = 3;
//			st3.gender = 'M';
//			
//			System.out.println("Object st1 " + st1.name);
//			System.out.println("Object st1 " + st1.age);
//			System.out.println("Object st1 " + st1.id);
//			System.out.println("Object st1 " + st1.gender);
//			System.out.println("-------------------");
//			System.out.println("Object st2 " + st2.name);
//			System.out.println("Object st2 " + st2.age);
//			System.out.println("Object st2 " + st2.id);
//			System.out.println("Object st2 " + st2.gender);
//			System.out.println("-------------------");
//			System.out.println("Object st3 " + st3.name);
//			System.out.println("Object st3 " + st3.age);
//			System.out.println("Object st3 " + st3.id);
//			System.out.println("Object st3 " + st3.gender);
//			
//			
//			Student st4 = new Student("Ana", 19, 4, 'F');
//			Student st5 = new Student();
//			Student st6 =  new Student("kkk", 20, 5, 'm'); 
//			Student st7 = new Student("jack",23,4,'m');
//			
//			System.out.println(st4.name);
//			System.out.println("===============");
//			
//			st4.printInfo();
//			st2.printInfo();
//			st3.printInfo();
//			st4.printInfo();
//			st7.printInfo();
//			System.out.println("-------------------");
//			System.out.println("Object st4 " + st4.name);
//			System.out.println("Object st4 " + st4.age);
//			System.out.println("Object st4 " + st4.id);
//			System.out.println("Object st4 " + st4.gender);
//			System.out.println("-------------------");
//			System.out.println("Object st5 " + st5.name);
//			System.out.println("Object st5 " + st5.age);
//			System.out.println("Object st5 " + st5.id);
//			System.out.println("Object st5 " + st5.gender);
//     		System.out.println("Object st6 " + st6.name);
//			System.out.println("Object st7 " + st7.name);
//			System.out.println("Object st7 " + st7.age);
//			System.out.println("Object st7 " + st7.id);
//			System.out.println("Object st7 " + st7.gender);
//			 
		 SDETClass hawks = new SDETClass(6);
			
			SDETClass phoenix = new SDETClass(95);
			
			Student st1 = new Student("Jack");
			Student st2 = new Student("Ben");
			Student st3 = new Student("Ahmad");
			Student st4 = new Student("Ana");
			Student st5 = new Student("Roy");
			Student st6 = new Student("David");
			Student st7 = new Student("Jack"); 
//			hawks.enroll(st1);
//			hawks.enroll(st2);
//			hawks.enroll(st3);
//			hawks.enroll(st4);
//			hawks.enroll(st5);
//			hawks.enroll(st6);
//			
//			hawks.printListOfStudents();
//			
			
			System.out.println(st1 == st2);
			System.out.println(st1 == st7);
			System.out.println(st1.equals(st7));
			System.out.println(st1.equals(st2));
			
			
   }	
 }
	