package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signUpPage {
	
	
	WebDriver driver; 
	
	public signUpPage(WebDriver x) {
		
		driver = x; 
		
		
	}
	
	
public WebElement getfirstName() {
		
		WebElement x = driver.findElement(By.name("firstName"));
		return x; 
		
	}

public WebElement getlastName() {
	
	WebElement x = driver.findElement(By.name("lastName"));
	return x; 
	
}

public WebElement getphoneNumber() {
	
	WebElement x = driver.findElement(By.name("phone"));
	return x; 
	
}

public WebElement getEmail() {
	
	WebElement x = driver.findElement(By.name("userName"));
	return x; 
	
}

public WebElement getsubmitButton() {
	
	WebElement x = driver.findElement(By.name("register"));
	return x; 
	
}

}
