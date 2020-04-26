package scripts;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testRun {
	
	
	
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("this is before Test");
		
	}
	
	@Test(priority=1)
	public void validateUrl() {
		
		System.out.println("this is validate url");
		
	}
	@Test(priority=2)
	public void validateTitle() {
		
		System.out.println("this is validate title");	
		
	}
	@Test(priority=3)
	public void validateTextPresnt() {
		
		System.out.println("this is validate text present");	
		
	}
	
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("this is after Test");
	}
	
	
	
	

}
