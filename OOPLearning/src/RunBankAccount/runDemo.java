package RunBankAccount;

import BankAccount.bankAccountDemo;
import BankAccount.checkingAccount;
import BankAccount.savingAccount;

public class runDemo {

	public static void main(String[] args) {
	
		
		checkingAccount ca=new checkingAccount(); 
		
		ca.checkAccount();
		
		savingAccount sa = new savingAccount(); 
		
		sa.payOnline();

	}

}
