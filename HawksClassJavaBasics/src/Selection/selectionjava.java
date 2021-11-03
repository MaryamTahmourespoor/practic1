package Selection;

public class selectionjava {

	public static void main(String[] args) {
	//--------------------------------------------------3 Aug
//				addtion(100,200);
//		Subtraction(500,300);
//		multiplication(200,300);
//		divsion(500, 2);
//		
//	}
//	public static void addtion(int num1, int num2) {
//		int addtion = (num1 + num2);
//		System.out.println("num1 + num2 = " + addtion);
//	}
//
//	public static void Subtraction(int num1, int num2) {
//		int Subtraction = (num1 - num2);
//		System.out.println("num1 - num2 = " + Subtraction);
//
//	}
//	public static void divsion(int num1, int num2) {
//		int divsion = (num1 / num2);
//		System.out.println("num1 / num2 = " + divsion);
//	}
//	
//	public static void multiplication(int num1, int num2){
//			int multiplication = (num1 * num2);
//			System.out.println("num1 * num2 = " + multiplication);
//			
			//selection
			// when we have a condition , we use selection
			
		int num1, num2, num3, num4, num5, num6, num7, num8, num9, num10;
		num1 = 1; //if 2 is more than 1
		num2 = 2;
		
		num3 = 3; //if 4 is more than 3
		num4 = 4;
		
		num5 = 5; //if 6 is more than 5
		num6 = 6;
		
		num7 = 7;
		num8 = 8;
		
		num9 = 9;
		num10 = 10;
		
		if(num2 > num1) {
			if (num4> num3) {
			  if(num6 > num5) {
				System.out.println("true!!!");
		}
			
		}
		}
	
		//we have a vending machine
				String drink1 = "Coke";
				String drink2 = "Redbull";
				String drink3 = "Water";
				String drink4 = "Pepsi";
				
				double price1 = 2;
				double price2 = 3;
				double price3 = 1;
				double price4 = 2;
				
				String itemSelected = "Redbull";
				
				switch(itemSelected) {
				case "Coke": 
					System.out.println("Item Selected: "+drink1 +"\n"+"Price: "+price1);
					break;
				case "Redbull": 
					System.out.println("Item Selected: "+drink2 +"\n"+"Price: "+price2);
					break;
				case "Water": 
					System.out.println("Item Selected: "+drink3 +"\n"+"Price: "+price3);
					break;
				case "Pepsi": 
					System.out.println("Item Selected: "+drink4 +"\n"+"Price: "+price4);
					break;
				}
           }
    }
