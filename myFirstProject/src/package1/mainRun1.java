package package1;

import package2.functionClass;
import package3.testFunction;

public class mainRun1 {

	public static void main(String[] args) {
		
		
		functionClass fc = new functionClass(); 
		
		functionClass fc1= new functionClass();
		
		testFunction tf = new testFunction(); 
		
		
		
		int sum = fc.addTwoNumbers(12, 45);
		
		System.out.println(sum);

	}

}
