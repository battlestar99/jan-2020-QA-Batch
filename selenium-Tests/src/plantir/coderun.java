package plantir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coderun {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
		
        WebDriver driver = new ChromeDriver();
      //delete cookies
		
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
		
		//maximize window
		
		driver.manage().window().maximize();
		
		//get url
		driver.get("http://paladin-ui-dev.s3-website.us-east-1.amazonaws.com/");
		
		//Call Class
		
		Pomlogin HP = new Pomlogin(driver);
		
		
		HP.getloginpage().click();
		Thread.sleep(1000);
		HP.getUsername().sendKeys("dbadmin1");
		Thread.sleep(1000);
		HP.getPassword().sendKeys("123");
		
	    HP.clickLogin().click();
		
		HP.getuser().click();
		HP.getProfile().click();
		HP.getEditprofile().click();
		HP.EditName().sendKeys("admin");
		HP.editemail().sendKeys("abc@gmail.com");
		HP.Savebutton().click();
	


	}

}
