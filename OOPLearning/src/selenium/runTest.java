package selenium;

public class runTest {

	public static void main(String[] args) {
	
		
		WebDriver driver = new chromeDriver();
		
		WebDriver driver1= new IEDriver();
		
		driver.sendkeys("Test");
		
		driver1.sendkeys("Test");
	
	

	}

}
