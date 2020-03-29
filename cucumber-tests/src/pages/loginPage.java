package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPage {
	
	WebDriver driver; 
	
	public loginPage(WebDriver x) {
		
		
		driver=x;
	}
	
	
	public WebElement getUserName() {
		
		WebElement x = driver.findElement(By.name("userName"));
		return x; 
		
	}
public WebElement getPassword() {
		
		WebElement x = driver.findElement(By.name("password"));
		return x; 
		
	}
public WebElement getloginButton() {
	
	WebElement x = driver.findElement(By.name("login"));
	return x; 
	
}
	

}
