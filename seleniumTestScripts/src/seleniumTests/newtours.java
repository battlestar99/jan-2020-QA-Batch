package seleniumTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtours {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		
		Thread.sleep(2000);
		 
		 driver.get("http://newtours.demoaut.com/mercuryregister.php");

		 driver.findElement(By.name("firstName")).sendKeys("Mike");
		 
		 driver.findElement(By.name("lastName")).sendKeys("John");
		 
		 driver.findElement(By.name("phone")).sendKeys("6576652");
		 
		 Thread.sleep(2000);
		 
	}

}
