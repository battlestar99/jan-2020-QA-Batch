package BankAccount;

public class checkingAccount extends bankAccountDemo {
	
	
	public checkingAccount() {
		// the code you want to execute 
		super();
	}
	
	
	
	public void getdepositInfo() {
		
		
		
	}
	
	
//method overriding  	
public void payOnline() {
		super.payOnline();
		System.out.println("Paying money online from checking account"); 	
		
	}


}
