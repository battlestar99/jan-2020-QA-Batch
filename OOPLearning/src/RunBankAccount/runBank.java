package RunBankAccount;

import BankAccount.bankAccount;

public class runBank {

	public static void main(String[] args) {
		
		
		bankAccount john = new bankAccount("johnuser","dfjdjf"); 
		bankAccount mike = new bankAccount("mikeuser","fdfadsf"); 
		bankAccount rob = new bankAccount("robuser","dfjdkj");
		
		bankAccount bob = new bankAccount();
		
		bankAccount.customerCount=1000;
		bankAccount.resetpassword();
		
		
		
		john.checkAccount();
		
		bob.payOnline(15);
		bob.payOnline();
		
		
		john.setEmail("john@gmaile.com");
		mike.setEmail("mike@gmail.com");
		rob.setEmail("rob@gmail.com");
		
		john.payOnline();
		mike.payOnline();
		
		System.out.println(john.getEmail());
		System.out.println(mike.getEmail());
		System.out.println(rob.getEmail());
		
		System.out.println(rob.customerCount);
		System.out.println(mike.customerCount);
		
		
	}

}
