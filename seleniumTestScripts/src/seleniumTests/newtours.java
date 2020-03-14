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

		 pageNewTours pg=new pageNewTours(driver); 
		 
		 pg.getFirstName().sendKeys("Michael");
		 pg.getlastName().sendKeys("Scott");
		 pg.getphone().sendKeys("698798");
		 
		 
		 
		 Thread.sleep(2000);
		 
	}

}
