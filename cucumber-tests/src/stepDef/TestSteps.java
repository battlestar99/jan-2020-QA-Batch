package stepDef;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pages.loginPage;
import pages.signUpPage;
import pages.yahoosignUpPage;

public class TestSteps {
	
	WebDriver driver; 
	loginPage lp; 
	signUpPage sp; 
	yahoosignUpPage yp; 
	
	
	@Before
	public void beforefeature() {
		
		
		
	}
	
	@After
	public void afterFeature() {
		
		
	}

	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws InterruptedException  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
      
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
	public void user_should_close_the_browser() throws InterruptedException {
	   Thread.sleep(2000);
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
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
	      
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
	
	
	
	
	
	
	
	
	@Given("^User is on the yahoo sign up page$")
	public void user_is_on_the_yahoo_sign_up_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rznan\\Desktop\\Feb_WS\\libraries\\chromedriver.exe");
	      
        driver = new ChromeDriver(); 
         yp = new yahoosignUpPage( driver ); 
		driver.manage().deleteAllCookies();
		Thread.sleep(2000);
	    driver.get("https://login.yahoo.com/account/create");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   System.out.println("printing user is on the login page");
	   Thread.sleep(3000);
	}

	@When("^user enters first name yahoo page$")
	public void user_enters_first_name_yahoo_page() {
		
		yp.getfirstName().sendKeys("Michael");
	   
	}

	@When("^user enters last name yahoo page$")
	public void user_enters_last_name_yahoo_page()  {
	   
		yp.getlastName().sendKeys("John");
	}

	@When("^user enters email address yahoo page$")
	public void user_enters_email_address_yahoo_page()  {
	    
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
	    
	}

	@When("^user enters mobile number$")
	public void user_enters_mobile_number() throws Throwable {
	    
	}

	@When("^user enters birth month$")
	public void user_enters_birth_month() throws Throwable {
	   
		Select bm = new Select(yp.getbirthMonth());
		
		bm.selectByVisibleText("February");
		
		
	}

	@When("^user enters birth day$")
	public void user_enters_birth_day() throws Throwable {
	  
	}

	@When("^user enters birth year$")
	public void user_enters_birth_year() throws Throwable {
	  
	}

	@Then("^user should be able to click the continue button$")
	public void user_should_be_able_to_click_the_continue_button() throws Throwable {
	 
	}

	@Then("^user should have a new Yahoo account$")
	public void user_should_have_a_new_Yahoo_account() throws Throwable {
	    
	}
	
	
	// ..........................................................
	
	
	@When("^user enters first name \"([^\"]*)\" yahoo page$")
	public void user_enters_first_name_yahoo_page(String arg1) throws Throwable {
	    
		yp.getfirstName().sendKeys(arg1);
	}

	@When("^user enters last name \"([^\"]*)\" yahoo page$")
	public void user_enters_last_name_yahoo_page(String arg1) throws Throwable {
		yp.getlastName().sendKeys(arg1);
	}

	@When("^user enters email address \"([^\"]*)\" yahoo page$")
	public void user_enters_email_address_yahoo_page(String arg1) throws Throwable {
	   yp.getemailaddress().sendKeys(arg1);
	}

	@When("^user enters password \"([^\"]*)\"$")
	public void user_enters_password(String arg1) throws Throwable {
	   yp.getpassword().sendKeys(arg1);
	}

	@When("^user enters mobile number \"([^\"]*)\"$")
	public void user_enters_mobile_number(String arg1) throws Throwable {
	    yp.getphoneNumber().sendKeys(arg1);
	}

	@When("^user enters birth month \"([^\"]*)\"$")
	public void user_enters_birth_month(String arg1) throws Throwable {
     
		Select bm = new Select(yp.getbirthMonth());
		
		bm.selectByVisibleText(arg1);
	}

	@When("^user enters birth day \"([^\"]*)\"$")
	public void user_enters_birth_day(String arg1) throws Throwable {
      
		
		yp.getbirthday().sendKeys(arg1);

	}

	@When("^user enters birth year \"([^\"]*)\"$")
	public void user_enters_birth_year(String arg1) throws Throwable {
      yp.getbirthYear().sendKeys(arg1);

	}

	
	// .......................................
	
	
	@When("^user enters firstname \"([^\"]*)\"  yahoo page data$")
	public void user_enters_firstname_yahoo_page_data(String arg1) throws Throwable {
	  yp.getfirstName().sendKeys(arg1);
	}

	@When("^user enters lastname \"([^\"]*)\"  yahoo page data$")
	public void user_enters_lastname_yahoo_page_data(String arg1) throws Throwable {
	    yp.getlastName().sendKeys(arg1);
	}

	@When("^user enters email address\"([^\"]*)\"  yahoo page data$")
	public void user_enters_email_address_yahoo_page_data(String arg1) throws Throwable {
	   yp.getemailaddress().sendKeys(arg1);
	}


	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	



}
