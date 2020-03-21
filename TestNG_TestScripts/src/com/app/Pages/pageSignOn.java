package com.app.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageSignOn {
	
	WebDriver driver; 
	
	public pageSignOn(WebDriver pdriver) {
		
		driver = pdriver; 
		
		
	}
	
public WebElement getUserName() {
		
		WebElement username =  driver.findElement(By.name("userName"));
		
		return username; 
	}


public WebElement getPassword() {
	
	WebElement password =  driver.findElement(By.name("password"));
	
	return password; 
}

public WebElement getSubmitButton() {
	
	WebElement submitButton =  driver.findElement(By.name("login"));
	
	return submitButton; 
}

}
