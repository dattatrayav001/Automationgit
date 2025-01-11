package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signuppage {
	
	WebDriver ldriver;

	public signuppage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[2]")
	WebElement newname;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")
	WebElement newemail;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[3]/div/form/button")
	WebElement signupbutton;
	
	
	@FindBy(xpath="//*[@id=\"name\"]")
	WebElement name;
	
	@FindBy(xpath="//*[@id=\"email\"]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"password\"]")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"first_name\"]")
	WebElement fname;
	
	@FindBy(xpath="//*[@id=\"last_name\"]")
	WebElement lname;
	
	@FindBy(xpath="//*[@id=\"address1\"]")
	WebElement address;
	
	@FindBy(xpath="//*[@id=\"state\"]")
	WebElement state;
	
	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement city;
	
	
	@FindBy(xpath="//*[@id=\"zipcode\"]")
	WebElement zipcode;
	
	@FindBy(xpath="//*[@id=\"mobile_number\"]")
	WebElement mbnumber;
	
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div/div[1]/form/button")
	WebElement createaccount;
	
	
	public void enternameandEmail(String name1, String email1)
	{
		newname.clear();
		newname.sendKeys(name1);
		
		newemail.clear();
		newemail.sendKeys(email1);
	}
	
	public void clickedsignup()
	{
		signupbutton.click();
		}
	
	public void enteraccountinfo()
	{
		/*
		 * name.clear(); name.sendKeys("samplename123");
		 * 
		 * email.clear(); email.sendKeys("sampleemail123@gmail.com");
		 */
		
		password.sendKeys("sample1234");
		
		fname.sendKeys("samplefname1234");
		
		lname.sendKeys("samplelname1234");
		
		address.sendKeys("sample address1234");
		
		state.sendKeys("maharashtra");
		
		city.sendKeys("pune");
		
		zipcode.sendKeys("411062");
		
		mbnumber.sendKeys("9999999999");
	}
	
public void clickedcreateaccount()
{
	createaccount.click();
	}
	
}
