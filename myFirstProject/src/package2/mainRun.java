package package2;

import package3.testFunction;

public class mainRun {

	public static void main(String[] args) {
		
		
		// create an object of the class
		
		functionClass x = new functionClass(); 
		
		functionClass obj = new functionClass(); 
		
		functionClass obj1 = new functionClass();
		
		testFunction tf = new testFunction(); 
		
		tf.go();
		
		obj1.printName("Michael");
		
		int sum = x.addTwoNumbers(12, 67);
		
		System.out.println(sum);
		
		int name = x.addTwoNumbers(45, 100);
		
		
		//obj.addTwoNumbers(13, 14);
		
		
		
		
		
		//Scanner xyz = new Scanner(System.in);

	}

}
