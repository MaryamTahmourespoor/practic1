package InheritanceExample2;

public class Camry extends Toyota {

	private String trim;
	 
	public Camry() {
		super();
		this.trim = "";
	}
	
	public Camry (String Trim,boolean hasFiveStarSafety, String color, String model, int year, 
			int numberOfDoors, double price, String vinNumber, String trim) {
		super(hasFiveStarSafety, color, model, year, numberOfDoors, price, vinNumber);
		this.trim = trim;
		
	}
	
	
	
	
}
