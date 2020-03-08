package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class presenceTest {

	public static void main(String[] args) {
		

	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().deleteAllCookies();
			
			// AUT to navigate 
			
			driver.navigate().to("https://github.com/");
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			WebElement signup = driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/a[2]"));
			
           boolean x =  signup.isDisplayed();
           boolean y =  signup.isEnabled();
            
            
			
			
	}

}
