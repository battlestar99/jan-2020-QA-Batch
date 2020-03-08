package testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class flickrTest {

	public static void main(String[] args) {
		
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\programming libraries\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			// AUT to navigate 
			
			driver.navigate().to("https://identity.flickr.com/sign-up");
			
			
			WebElement firstname = driver.findElement(By.id("sign-up-first-name"));
			WebElement lastname = driver.findElement(By.id("sign-up-last-name"));
			WebElement signup = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button"));
           
			
			
			firstname.sendKeys("Michael");
           lastname.sendKeys("Jordan");
           
           String x = signup.getText();
           
           System.out.println(x);
           
           
	}

}
