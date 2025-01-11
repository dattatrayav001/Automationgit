package StepDefinition;



import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


import org.apache.logging.log4j.LogManager;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObject.LoginPage;
import PageObject.productsearchpage;
import PageObject.signuppage;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class StepDef extends Baseclass{
	
	@AfterStep
	public void takescreenshotaftereverysteps(Scenario scenario)
	{
		if(scenario.isFailed())
		{
		String screenshotBase64 = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BASE64);
		scenario.attach(screenshotBase64, "image/png", scenario.getName());
	}
		}
	@BeforeStep
	public void beforestepmethod()
	{
		System.out.println("before step  method");
	}
	@AfterStep 
	public void afterstepmethod()
	{
		System.out.println("after step  method");
	}
	@Before("@regression")
	public void setup() throws IOException
	{
		readconfig=new Properties();
		FileInputStream file=new FileInputStream("config.properties");
		readconfig.load(file);
		String browser=readconfig.getProperty("browser");
		
		Log= LogManager.getLogger("StepDef");
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  break;
		  
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
			  break;
			  default:
				  driver=null;
				  break;
		
			
		}
		
		
		  System.out.println("setup method");
		  Log.info("setup executed");
	}
	@Before("@smoke")
	public void setup1() throws IOException
	{
		Log= LogManager.getLogger("StepDef");
		readconfig=new Properties();
		FileInputStream file=new FileInputStream("config.properties");
		readconfig.load(file);
		String browser=readconfig.getProperty("browser");
		
		Log= LogManager.getLogger("StepDef");
		switch(browser.toLowerCase())
		{
		case "chrome":
			WebDriverManager.chromedriver().setup();
		  driver=new ChromeDriver();
		  break;
		  
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			  driver=new FirefoxDriver();
			  break;
			  default:
				  driver=null;
				  break;
		
			
		}
		  System.out.println("setup method first ");
		  Log.info("setup executed");
	}
	
	
	@Given("User launch Chrome Browser")
	public void user_launch_chrome_browser() {
	  
	  
	  loginpg= new LoginPage(driver);
	  signuppg=new signuppage(driver);
	  productsearchpg=new productsearchpage(driver);
	  Log.info("browser launch executed");
	}

	@When("User open Url {string}")
	public void user_open_url(String  url) {
	driver.get(url);
	Log.info("open url  executed");
	
	}
	   @Given("User clik on signup")
	   public void User_clik_on_signup()
	   {
		   loginpg.clickonsignup();
		   Log.info("click signup executed");
	   }
	
	@Given("user enter Email as {string} and password as {string}")
	public void user_enter_email_as_and_password_as(String email1, String password1) throws InterruptedException {
	loginpg.enterEmail(email1);
	Thread.sleep(2000);
	loginpg.enterPassword(password1);
	Log.info("email and password  executed");
	}

	@Given("click on Login")
	public void click_on_login() throws InterruptedException {
		Thread.sleep(2000);
	    loginpg.clickOnLoginButton();
	    Log.info("click login executed");
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String etitle) {
	   String atitle= driver.getTitle();
	   if(atitle.equals(etitle))
			   {
		   Assert.assertTrue(true);
			   }
	   else {
		   Assert.assertTrue(false);
	}}

	@When("user click on log out link")
	public void user_click_on_log_out_link() {
	    loginpg.clickOnLogOutButton();
	}

	@Then("close browser")
	public void close_browser() {
	
	
	}
	//need to implement
	@When("user enter {string} and {string}")
	public void user_enter_and(String string1, String string2) {
		signuppg.enternameandEmail(string1, string2);
		
	  
	}

	@When("click on signup")
	public void click_on_signup() {
	  signuppg.clickedsignup();
	}

	@When("User entered account info")
	public void user_entered_account_info() {
		signuppg.enteraccountinfo();
	    
	}

	@When("click on create account")
	public void click_on_create_account() {
	    signuppg.clickedcreateaccount();
	}
	
	// need to implement
	
	  @When("click on product") public void click_on_product() {
	  productsearchpg.clickonproduct();
	  
	  }
	  
	  @When("click on Men catlag") public void click_on_men_catlag() throws
	  InterruptedException { Thread.sleep(5000); productsearchpg.clickonmen();
	  
	  }
	  
	  @When("click on shirt") public void click_on_shirt() {
	  productsearchpg.clickontshirt(); }
	  
	  @Then("validate tshirt section is open") public void
	  validate_tshirt_section_is_open() { String yup
	  =productsearchpg.checktshirtsearch(); if(yup.equals("true")) {
	  Assert.assertTrue(yup, false); }
	  
	  }
	  
	  @When("click on first tshirt view product") public void
	  click_on_first_tshirt_view_product() { productsearchpg.clickonviewproduct();
	  
	  }
	  
	  @Then("Check Availability") public void check_availability() { String
	  av=productsearchpg.checkavalibilty(); if(av.equals("true")) {
	  Assert.assertTrue(av, false); } }
	 
	  

}
