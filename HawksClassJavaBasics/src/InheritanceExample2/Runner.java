package InheritanceExample2;

	public class Runner {
	
		public static void main(String[] args) {

			Car obj = new Car("sadjasjdhjsh4445455","Toyota","4Runner");
			
			
			Toyota obj2 = new Toyota();
			obj2.setHasFiveStarSafety(true);
			obj2.setColor("White");
			obj2.setModel("camery");
			Car obj3 = new Car("fff", "ggg", "hhh", 10, 30, 20, "fff");
			
			
			
			System.out.println(obj);
			System.out.println(obj2);
			System.out.println(obj3);
		
			
			
	
	
}
}
