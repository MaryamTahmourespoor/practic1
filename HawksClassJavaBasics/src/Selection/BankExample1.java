package Selection;

public class BankExample1 {

	public static void main(String[] args) {
		
//		double balance = 100;
//		 double payment1= 9;
//		 int numOfPayment =1;
//		 while ( balance > payment1) {
//			
//			 balance =balance - payment1;
//			 System.out.println(numOfPayment++ + "  "+ balance);
//			 
			 double balance = 100;
				
				double payment1 = 30;
				
				int numOfPayment = 1;
				
				while(balance > 0) {
					
					if(balance - payment1 > 0) { 	
						balance = balance - payment1;         // after deducting the payment from the balance - balance is still more than zero
					} else {
						payment1 = balance;		            	// after deducting the payment from the balance - the balance is negative
						balance = balance - payment1;	         // change the payment amount
					
					}
					
					
					numOfPayment++;
					
					System.out.println(numOfPayment + " " + balance);
				}
				
	}
			
}	
			 
			 
			 
			 
		 

	


