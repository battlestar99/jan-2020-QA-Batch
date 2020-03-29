package stepDef;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.loginPage;
import pages.signUpPage;

public class TestSteps {
	
	WebDriver driver; 
	loginPage lp; 
	signUpPage sp; 

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
      
        driver = new ChromeDriver(); 
        lp=new loginPage(driver);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	    driver.get("http://newtours.demoaut.com/mercurysignon.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println("printing user is on the login page");
	}

	@When("^user enters valid username in username text box$")
	public void user_enters_valid_username_in_username_text_box() throws InterruptedException {
		Thread.sleep(1000);
		lp.getUserName().sendKeys("test1234");
		Assert.assertEquals("test", "testfsfsd");
		System.out.println("printing user enters username");
		
	}

	@When("^user enters valid password in the password text box$")
	public void user_enters_valid_password_in_the_password_text_box() throws InterruptedException  {
		Thread.sleep(1000);
		lp.getPassword().sendKeys("test1234fdsf");
		System.out.println("printing user enters password");
	}

	@When("^user clicks the login button$")
	public void user_clicks_the_login_button()  {
		WebElement loginbutton = lp.getloginButton();
		boolean x = loginbutton.isDisplayed();
		System.out.println(x);
		System.out.println("printing clicks on the loginbutton");
	}

	@Then("^user should be able to login$")
	public void user_should_be_able_to_login()  {
	   
		 
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	
	@Then("^user should close the browser$")
	public void user_should_close_the_browser() {
	   
		driver.quit();
	}
	
	
	
	@When("^user enters invalid username in the text box$")
	public void user_enters_invalid_username_in_the_text_box()  {
		lp.getUserName().sendKeys("invalide");  
	}

	@When("^user enters invalid password in the text box$")
	public void user_enters_invalid_password_in_the_text_box()  {
		lp.getPassword().sendKeys("invalidfd");
	}

	@Then("^user should not be able to login$")
	public void user_should_not_be_able_to_login()  {
		
		System.out.println(driver.getCurrentUrl()); 
		System.out.println(driver.getTitle());
	    
	}
	@Given("^user is on the sign up page$")
	public void user_is_on_the_sign_up_page() throws InterruptedException   {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Agile1Tech\\Desktop\\WS-Jan2020\\programming libraries\\chromedriver.exe");
	      
        driver = new ChromeDriver(); 
       sp=new signUpPage(driver);
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	    driver.get("http://newtours.demoaut.com/mercuryregister.php");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println("printing user is on the login page");
	}

	@When("^user enters firstName$")
	public void user_enters_firstName() throws InterruptedException  {
		Thread.sleep(1000);
		sp.getfirstName().sendKeys("Michael");
	  
	}

	@When("^user enters lastname$")
	public void user_enters_lastname() throws InterruptedException  {
		Thread.sleep(1000);
	sp.getlastName().sendKeys("Johnson");
	}

	@When("^user enter phone number$")
	public void user_enter_phone_number() throws InterruptedException  {
		
		Thread.sleep(1000);
	   sp.getphoneNumber().sendKeys("987979");
	}

	@When("^user enters email address$")
	public void user_enters_email_address() {
	  sp.getEmail().sendKeys("test@test.com");
	}

	@When("^user clicks the signup button$")
	public void user_clicks_the_signup_button() throws Throwable {
	  sp.getsubmitButton().isDisplayed();
	}

	@Then("^user should have a new account$")
	public void user_should_have_a_new_account() throws Throwable {
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	}

	@Then("^user should see the account dashboard$")
	public void user_should_see_the_account_dashboard() throws Throwable {
		Thread.sleep(3000);
	}



}
