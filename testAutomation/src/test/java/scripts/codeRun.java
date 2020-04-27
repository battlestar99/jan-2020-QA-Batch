package scripts;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class codeRun {
	
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("Before test");
	
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		System.out.println("Before method");
		
	}
	
	@AfterMethod
	public void aftermethod() {
		
		System.out.println("after method");
		
	}
	
	@Test(enabled=false)
	public void atest() {
		
		System.out.println("TestA");
		
		//Assert.assertEquals("bob", "bob");
	}

	@Test(dependsOnMethods= {"ctest"})
	public void btest() {
		System.out.println("TestB");
		//Assert.assertEquals("http://newtours.demoaut.com/mercurysignon.php", "https://www.test.com");
	}
	
	@Test
	public void ctest() {
		System.out.println("TestC");
	//	Assert.assertEquals("test", "test1");
	}
	
	@AfterTest
	public void aftertest() {
		
		System.out.println("after test");
		
	}

}
