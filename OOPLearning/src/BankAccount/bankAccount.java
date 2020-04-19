package BankAccount;

public class bankAccount {
	
	// global variables are the properties of the class
	private String email; 
	public String state; 
	public String phonNumber; 
	public String accountNumber; 
	public int amountOfMoney; 
	public String username; 
	public String password; 
	public static int customerCount; 
	public int x; 
	
	
	public void setEmail(String email) {
		
		this.email=email;
		
	}
	
	public String getEmail() {
		
		return email;
		
	}
	
	
	// constructor overloading 
	public bankAccount(String username,String password) {
		
		this.username = username; 
		this.password=password;
		
	}
	
public bankAccount() {
		
		System.out.println("Username and password is not setup");
		
	}
	
	
	
	// functions
	
	public static void resetpassword() {
		
		System.out.println("resetting the password"); 
		
	}
	
	protected void deposit() {
		checkingConnection();
	System.out.println("Depositing the money"); 
		
	}
	
	private void withdraw() {
		checkingConnection();
		int x; 
		x=12;
		this.x=13;
		System.out.println("withdrawing the money"); 	
		
	}
	
	public void checkAccount() {
		checkingConnection();
		System.out.println("checking the account"); 	
		
	}
	
	// two or multiple functions with same name different input - function overloading
	
	
public void payOnline() {
		
	withdraw();
		System.out.println("Paying money online"); 	
		
	}

public void payOnline(int x) {
	
	System.out.println("Paying money online with input"); 	
	
}


private void checkingConnection() {
	
	// 15 lines of code 
	
	
	
}
	

}
