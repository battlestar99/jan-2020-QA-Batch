package seleniumTests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownTest {

	public static void main(String[] args) throws InterruptedException {
		
		
     System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		// AUT to navigate 
		
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement month = driver.findElement(By.xpath("//*[@id=\"month\"]")); 
		
		Select monthdd = new Select(month);
		
		monthdd.selectByVisibleText("Aug");
		monthdd.selectByVisibleText("May");
		Thread.sleep(2000);
		
		
		
		
		
		
		
		
		
		

	}

}
