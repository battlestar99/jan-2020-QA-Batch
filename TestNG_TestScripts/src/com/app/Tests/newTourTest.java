package com.app.Tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.app.Pages.pageNewTours;

public class newTourTest {
	
	WebDriver driver; 
	pageNewTours pn ; 
	
	@BeforeTest
	public void beforeTest() throws InterruptedException {
	
		// opening the browser, go to url
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
		
    
        
		driver = new ChromeDriver(); 
	    pn=new pageNewTours(driver);
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	    driver.get("http://newtours.demoaut.com/mercuryregister.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(1000);
		driver.quit();
		
		
	}
	
	@BeforeMethod
	public void beforemethod() {
		
		driver.navigate().refresh();
		
		
	}
	
	
	@Test(priority=1)
	public void validateURL() {
		
		String actualUrl = driver.getCurrentUrl();
		Assert.assertEquals(actualUrl,"http://newtours.demoaut.com/mercuryregister.php");
	}
	@Test(priority=2)
	public void validateTitle() {
		
		String actualTtitle = driver.getTitle(); 
		System.out.println(actualTtitle);
		Assert.assertEquals(actualTtitle, "Register: Mercury Tours");
		
	}
	
	@Test(priority=3)
	public void elementDisplayed() throws InterruptedException {
		
		WebElement firstname =  driver.findElement(By.name("firstName"));
		
		
		boolean display = firstname.isDisplayed();
		Thread.sleep(1000);
		firstname.sendKeys("Michael");
		
		WebElement lastName = pn.getlastName();
		
		boolean display1 = lastName.isDisplayed();
		Thread.sleep(1000);
		lastName.sendKeys("Johnson");
		
		Assert.assertTrue(display);
		
		Assert.assertTrue(display1);
		
		
		
		
		
	}
}
