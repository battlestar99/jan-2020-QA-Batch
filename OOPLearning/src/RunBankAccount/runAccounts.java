package RunBankAccount;

import BankAccount.bankAccount;
import BankAccount.checkingAccount;
import BankAccount.savingAccount;

public class runAccounts {

	public static void main(String[] args) {
		
		checkingAccount jon = new checkingAccount();
		
		bankAccount bob = new bankAccount();
		
		savingAccount sa = new savingAccount();
		
		jon.checkAccount();
	
		
		
		jon.getdepositInfo();
		
		bob.checkAccount();
		
		sa.deposit();
		
		jon.payOnline();
		
		

	}

}
