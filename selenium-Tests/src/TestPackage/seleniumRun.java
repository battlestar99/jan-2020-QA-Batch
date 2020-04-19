package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumRun {

		
		public static void main(String[] args) {
			
			 System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				
				driver.manage().deleteAllCookies();
				
				// AUT to navigate 
				
				driver.navigate().to("https://identity.flickr.com/sign-up");
				
				
				
			WebDriverWait wait = new WebDriverWait(driver, 3);
			WebElement firstname= wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.id("sign-up-first-name")));
				
				
				
				//WebElement firstname = driver.findElement(By.id("sign-up-first-name"));
				WebElement lastname = driver.findElement(By.id("sign-up-last-name"));
				WebElement signup = driver.findElement(By.xpath("//*[@id=\"sign-up-form\"]/button"));
	           
				
				
				firstname.sendKeys("Michael");
	           lastname.sendKeys("Jordan");
	           
	           String x = signup.getText();
	           
	           System.out.println(x);


	}

}
