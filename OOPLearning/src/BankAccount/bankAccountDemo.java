package BankAccount;

public abstract class bankAccountDemo {
	
	
	public String email; 
	public String state; 
	public String phonNumber; 
	public String accountNumber; 
	public int amountOfMoney; 
	public String username; 
	public String password; 
	public static int customerCount; 
	public int x; 
	
	
	// constructor overloading 
	public bankAccountDemo(String username,String password) {
		
		this.username = username; 
		this.password=password;
		
	}
	
	
	 public bankAccountDemo() {
	 
	  System.out.println("Username and password is not setup");
	  
	 }
	 
	
	
	
	// functions
	
	public static void resetpassword() {
		
		System.out.println("resetting the password"); 
		
	}
	
	public void deposit() {
		
	System.out.println("Depositing the money"); 
		
	}
	
	public void withdraw() {
		
		int x; 
		x=12;
		this.x=13;
		System.out.println("withdrawing the money"); 	
		
	}
	
	public void checkAccount() {
		
		System.out.println("checking the account"); 	
		
	}
	
	// two or multiple functions with same name different input - function overloading
	
	
public void payOnline() {
		
		System.out.println("Paying money online"); 	
		
	}

public void payOnline(int x) {
	
	System.out.println("Paying money online with input"); 	
	
}

}
