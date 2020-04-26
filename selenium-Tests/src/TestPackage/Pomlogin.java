package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Pomlogin {
	
	WebDriver driver;
	
	public Pomlogin(WebDriver x) {
		
		 driver = x;
		
	}
	
public WebElement getloginpage() {
		
		WebElement signin = driver.findElement(By.id("sign-in-btn"));
		
		return signin;
	}
	
public WebElement getUsername() {
		
		WebElement username = driver.findElement(By.id("input-21"));
		
		return username;
	}


public WebElement getPassword() {
	
	WebElement password = driver.findElement(By.id("input-25"));
	
	return password;
}



public WebElement clickLogin() {
	
	WebElement login = driver.findElement(By.id("login-btn"));
	
	return login;

}

}
