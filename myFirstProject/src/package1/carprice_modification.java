package package1;

import java.util.Scanner;

public class carprice_modification {

	public static void main(String[] args) {
		
		int carprice; 
		int adminfee; 
		int interest; 
		int tax ;
		int taxprice; 
		String name; 
		int interestRate;
		int Price_afterInterst; 
		
		carprice=2000;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car price");
		carprice =sc.nextInt(); 
		System.out.println("Enter admin  fee");
		adminfee = sc.nextInt(); 
		
		Scanner x = new Scanner(System.in);
		
		
		System.out.println("Enter Interest Rate");
		interestRate = sc.nextInt();
		System.out.println("Enter tax");
		tax = sc.nextInt();
		
		interest = carprice*(interestRate/100); 
		taxprice = carprice*(tax/100);  
		
		
		
		int totalprice; 
		
		
		
		
		
		totalprice = carprice + adminfee + interest+ taxprice; 
		System.out.println("Total price of the car");
		System.out.println(totalprice);
		
		double monthlypayment; 
		
		monthlypayment = totalprice/72;
		
		System.out.println("Your monthly payment is ...");
		System.out.println(monthlypayment);
		
		

	}

}
