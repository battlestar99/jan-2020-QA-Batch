package com.app.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageNewTours {
	
	WebDriver driver ; 
	 
	public pageNewTours(WebDriver tdriver) {
		
		
		driver=tdriver; 
		
		
	}
	
	// input - system - output 
	
	// output - weblements , input - nothing, system - to find a webelement
	
	public WebElement getFirstName() {
		
		WebElement firstname =  driver.findElement(By.name("firstName"));
		
		return firstname; 
	}
	
public WebElement getlastName() {
		
		WebElement lastName =  driver.findElement(By.name("lastName"));
		
		return lastName; 
	}
	
public WebElement getphone() {
	
	WebElement phone =  driver.findElement(By.xpath("//input[@name='firstName']"));
	
	return phone; 
}
	
	

	
	
	

}
