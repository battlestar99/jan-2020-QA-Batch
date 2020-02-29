package package1;

import java.util.Scanner;

public class cotrol_stat1 {

	public static void main(String[] args) {
		
	
		// we have to find if a condition is true of false
		
		Scanner sc = new Scanner(System.in);
		int carprice = sc.nextInt() ; 
		
		boolean checkcarprice = (carprice<20000);
		boolean checkcarprice1 = (carprice>20000);
		String carname = "Toyota";
		
		//System.out.println(checkcarprice);
		//System.out.println(checkcarprice1);
		
		if(carprice<20000 && carname=="Toyota") {
			
			System.out.println("Buy the car, no problem");
			
		}
		
		
		
		if(checkcarprice1) {
			
			System.out.println("Don't try to buy the car");
			
		}
		
		
		

	}

}
