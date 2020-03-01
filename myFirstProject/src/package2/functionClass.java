package package2;

public class functionClass {
	
	
	// two add two number 
	// input - two numbers, integer - multiple
	// output - summation, integer - 1
	
	// inputs - parameters, argument
	
	// constructor gets executed whenever we create an object of the class
	
	
	
	
	
	public int addTwoNumbers(int x, int y) {
		int sum = x+y; 
	    return sum;
		
		
	}
	
	public int subtractTwoNumbers(int x, int y) {
		
		int sub = x-y; 
		
		return sub; 
		
		
	}
	
	
	
	// no output, take a string as input 
	
	public void printName(String name) {
		
		System.out.println(name);
		
		
	}
	
	// two numbers as input, one string as input 
	// I want to have a output of the summation of two 
	// numbers and want to print the string 
	
	public int testGo(int x, int y, String name) {
		
		int sum = x+y; 
		name="test";
		System.out.println(name);
		return sum; 
		
		
	}
	
	
	public boolean compare(int x, int y) {
		
		boolean test = true; 
		
	
		
		
		if(x>y) {
			
			System.out.println("x is greater than y");
		}
		
		if(x<y) {
			
			System.out.println("x is less than y");
			test = false; 
			
		}

		if(x==y) {
	
	System.out.println("x is equal to y");
	test=false; 
		}
		
		
		return test; 
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
