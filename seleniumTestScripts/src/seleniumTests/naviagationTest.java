package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class naviagationTest {

	public static void main(String[] args) throws InterruptedException {
	
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		// AUT to navigate 
		
		driver.navigate().to("https://github.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement featureLink = driver.findElement(By.linkText("Features"));
		String x = featureLink.getText();
		featureLink.click();
		 
		System.out.println(x);
		
		Thread.sleep(1000);
		
		driver.navigate().back(); 
		
		Thread.sleep(1000);
		
		driver.navigate().forward();
		
		Thread.sleep(1000);
		
		driver.quit();
		
		
		
		
		

	}

}
