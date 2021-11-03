package abstractionBasics;

public class Runner {
	
	public static void main(String[] args) {
	
		BankAccount obj =new checkingAccount();
		
		BankAccount[] accounts =new BankAccount[5];
		
		accounts[0]= new checkingAccount();
		accounts[1]= new SavingAccount();
		accounts[2]= new CreditAccount();
		
		
		
		
	}
	
	
}
