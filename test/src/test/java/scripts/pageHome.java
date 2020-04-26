package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class pageHome {
	

	 
	WebDriver driver; 
	int y; 
	
	public pageHome(WebDriver x) {
		
		
		driver = x; 
		
	}
	
	

	// 100 webelements 
	public WebElement getFirstName() {
		
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"u_0_m\"]"));
		
		return firstName;
	}
	
public WebElement getLastName() {
		
	WebElement lastName = driver.findElement(By.xpath("//*[@id=\"u_0_o\"]"));
		
		return lastName;
	}
	
	

}
