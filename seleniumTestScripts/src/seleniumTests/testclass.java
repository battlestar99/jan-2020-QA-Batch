package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testclass {

	public static void main(String[] args) throws InterruptedException {
   System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		//WebDriver driver1 = new ChromeDriver(); 
		
		
		
		  Thread.sleep(2000);
		 
		 driver.get("https://www.amazon.com/");
		 
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Selenium books");
		 
		 driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		
		 WebElement deals = driver.findElement(By.linkText("Today's Deals")); 
		 
		String dealtext =  deals.getText();
		 deals.click();
		
		 
		 String xy = driver.getTitle();
		 String y = driver.getCurrentUrl();
		 
		 System.out.println(dealtext);
		// System.out.println(y);
		 
		 Thread.sleep(1000);
		 
		 driver.quit();
		 

	}

}
