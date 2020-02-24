package package1;

import java.util.Scanner;

public class carPrice {

	public static void main(String[] args) {
		
// build a system that can calculate car price 
// car price consists of car value, admin fees, interest , taxes 
// find the monthly payment of the car 
		
		int carprice; 
		int adminfee; 
		int interest; 
		int tax ; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter car price");
		carprice =sc.nextInt(); 
		System.out.println("Enter admin  fee");
		adminfee = sc.nextInt(); 
		System.out.println("Enter interest");
		interest = sc.nextInt();  
		System.out.println("Enter tax");
		tax = sc.nextInt(); 
		
		int totalprice; 
		
		totalprice = carprice + adminfee + interest+ tax; 
		System.out.println("Total price of the car");
		System.out.println(totalprice);
		
		double monthlypayment; 
		
		monthlypayment = totalprice/72;
		
		System.out.println("Your monthly payment is ...");
		System.out.println(monthlypayment);
		
		
		
		
		

	}

}
