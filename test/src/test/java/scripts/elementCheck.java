package scripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class elementCheck {
	
	
	int x; 
	WebDriver driver;
	pageHome ph; 
	
	@BeforeTest
	public void beforeTest() {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
			
			
		 
		 x = 15; 
			 driver = new ChromeDriver();
			
			 ph= new pageHome(driver);
			
			driver.get("https://www.facebook.com");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=1)
	public void validateElementPresent() throws InterruptedException {
		
		Thread.sleep(2000);
		ph.getFirstName().sendKeys("Michael");
		ph.getLastName().sendKeys("Scott");
		
		boolean x = ph.getFirstName().isDisplayed();
		Assert.assertTrue(x);
		Thread.sleep(2000);
	}
	
	
	@Test(priority=2)
public void validateMessangerURL() throws InterruptedException {
		
		driver.findElement(By.linkText("Messenger")).click();
		
		String expectedURL = "test";
		String actualURL= "test12";
		
		Assert.assertEquals(actualURL, expectedURL);
		
		
	}
	
	@AfterTest
	public void afterTest() {
		
		driver.quit();
		
	}

}
