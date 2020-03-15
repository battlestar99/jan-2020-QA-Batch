package com.app.Tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class basicTestNGTest {
	
	

	@BeforeTest
	public void beforeTest() {
		
		System.out.println("printing before test");
		
	}
	
	
	@AfterTest
	public void afterTest() {
		
		System.out.println("printing after test");
	}
	@Test(priority=1)
	   public void bmainTest() {
		   
		   System.out.println("printing bmain test");
		   Assert.assertEquals("test123", "test123");
	   }
	
   @Test(priority=2)
   public void amainTest() {
	   
	   System.out.println("printing amain test");
	   Assert.assertEquals("test", "test");
	   
   }
   
   @BeforeMethod
   public void beforemethod() {
	   
	   System.out.println("printing berfore method");  
	   
   }
   
   @AfterMethod
   public void afterMethod() {
	   System.out.println("printing after method");    
	   
   }
	
   
	
	

}
