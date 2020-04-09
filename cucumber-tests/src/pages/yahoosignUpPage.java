package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class yahoosignUpPage {
	
	
	
WebDriver driver; 
	
	public yahoosignUpPage(WebDriver x) {
		
		driver = x; 
		
		
	}
	
public WebElement getfirstName() {
		
		WebElement x = driver.findElement(By.id("usernamereg-firstName"));
		return x; 
		
	}
	
public WebElement getlastName() {
	
	WebElement x = driver.findElement(By.id("usernamereg-lastName"));
	return x; 
	
}

public WebElement getpassword() {
	
	WebElement x = driver.findElement(By.id("usernamereg-password"));
	return x; 
	
}

public WebElement getphoneNumber() {
	
	WebElement x = driver.findElement(By.id("usernamereg-phone"));
	return x; 
	
}

public WebElement getemailaddress() {
	
	WebElement x = driver.findElement(By.id("usernamereg-yid"));
	return x; 
	
}

public WebElement getbirthMonth() {
	
	WebElement x = driver.findElement(By.id("usernamereg-month"));
	return x; 
	
}	

public WebElement getbirthday() {
	
	WebElement x = driver.findElement(By.id("usernamereg-day"));
	return x; 
	
}


public WebElement getbirthYear() {
	
	WebElement x = driver.findElement(By.id("usernamereg-year"));
	return x; 
	
}

public WebElement getContinueButton() {
	
	WebElement x = driver.findElement(By.id("reg-submit-button"));
	return x; 
	
}

	

}
