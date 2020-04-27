package plantir;

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
		
		WebElement username = driver.findElement(By.id("input-24"));
		
		return username;
	}


public WebElement getPassword() {
	
	WebElement password = driver.findElement(By.id("input-28"));
	
	return password;
}



public WebElement clickLogin() {
	
	WebElement login = driver.findElement(By.id("login-btn"));
	
	return login;
}	

public WebElement getuser() {
	
	WebElement user = driver.findElement(By.className("v-btn__content"));
	
	return user;
}	

public WebElement getProfile() {

WebElement profile = driver.findElement(By.id("v-list-item__title"));

return profile;
}	

public WebElement getEditprofile() {

WebElement EditProfile = driver.findElement(By.id("edit-profile-btn"));

return EditProfile;
}	

public WebElement EditName() {

WebElement Name = driver.findElement(By.id("profile-name"));

return Name;
}	

public WebElement editemail() {

WebElement email = driver.findElement(By.id("profile-email"));

return email;
}	


public WebElement Savebutton() {

WebElement save = driver.findElement(By.id("submit-edit-btn"));

return save;
}	


}
