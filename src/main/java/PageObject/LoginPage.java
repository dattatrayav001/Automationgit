package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;

	public LoginPage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement singup;
	
	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")
	WebElement email;
	
	@FindBy(xpath="//*[@id=\"form\"]/div/div/div[1]/div/form/input[3]")
	WebElement password;

	@FindBy(xpath = "//*[@id=\"form\"]/div/div/div[1]/div/form/button")
	WebElement LoginBtn;
	
	
	@FindBy(xpath = "//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[4]/a")
	WebElement logout;
	
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		LoginBtn.click();
	}
	
	public void clickOnLogOutButton()
	{
		logout.click();
	}
	
	public void clickonsignup() {
		singup.click();
	}
}