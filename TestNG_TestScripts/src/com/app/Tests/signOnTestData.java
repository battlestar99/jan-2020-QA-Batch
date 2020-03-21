package com.app.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.app.Pages.pageNewTours;
import com.app.Pages.pageSignOn;

public class signOnTestData {
	
	
	WebDriver driver; 
	pageNewTours pn ;
	pageSignOn ps;  
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
	
		// opening the browser, go to url
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
       
        driver = new ChromeDriver(); 
        ps = new pageSignOn(driver);
		
		driver.manage().deleteAllCookies();
		//Thread.sleep(2000);
	    driver.get("http://newtours.demoaut.com/mercurysignon.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		//Thread.sleep(2000);
		
		driver.quit();
		
	}
	
	@Test(priority=1)
	public void validateWebElementPresent() {
		
		boolean username = ps.getUserName().isDisplayed(); 
		Reporter.log("Verifying the username is present", true);

		boolean password = ps.getPassword().isDisplayed();
		Reporter.log("Verifying the password is present", true);
		boolean submitbutton = ps.getSubmitButton().isDisplayed();
		Reporter.log("Verifying the submit button is present", true);
		
		Assert.assertTrue(username);
		Assert.assertTrue(password);
		Assert.assertTrue(submitbutton);
	}
	
	@Parameters({"username","password","expecteddata"})
	@Test(priority=2)
	
	public void validateSignOn(String username, String password,String expecteddata) {
		
		ps.getUserName().sendKeys(username);
		Reporter.log("Entering Michael in the username text box", true);
		ps.getPassword().sendKeys(password);
		Reporter.log("Entering dkjfdjklfd in the password text box", true);
		
		ps.getSubmitButton().click();
		
		String actualUrl = driver.getCurrentUrl(); 
		Reporter.log("reading the url of the page", true);
		String expectedUrl = "http://newtours.demoaut.com/mercurysignon.php?osCsid=bd0ba60685629c9de92b4ab90bfb4097"; 
		//boolean x = actualUrl.contains("http://newtours.demoaut.com/mercurysignon.php"); 
		
		//Assert.assertTrue(x);
		Assert.assertEquals("test",expecteddata);
		
		
		
	}
	
	
	

}
