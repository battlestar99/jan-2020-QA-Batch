package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class codeRUN {

	public static void main(String[] args) throws InterruptedException {
		

		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			// AUT to navigate 
			
			
			driver.get("http://paladin-ui-dev.s3-website.us-east-1.amazonaws.com/");

			Pomlogin HP = new Pomlogin(driver);
			
			
			HP.getloginpage().click();
			Thread.sleep(1000);
			HP.getUsername().sendKeys("dbadmin1");
			Thread.sleep(1000);
			HP.getPassword().sendKeys("123");
			
		    HP.clickLogin().click();


	}

}
