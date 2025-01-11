package PageObject;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class productsearchpage {
	WebDriver ldriver;
	public productsearchpage(WebDriver rDriver)
	{
		ldriver=rDriver;

		PageFactory.initElements(rDriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"header\"]/div/div/div/div[2]/div/ul/li[2]/a")
	WebElement product;
	
	@FindBy(xpath="(//span[@class='badge pull-right']/parent::a)[2]")
	WebElement Men;
	
	@FindBy(xpath="//*[@id=\"Men\"]/div/ul/li[1]/a")
	WebElement Tshirt;
	
	@FindBy(xpath="/html/body/section/div/div[2]/div[2]/div/h2/a/span")
	String tshirtvalidate;
	
	@FindBy(xpath="/html/body/section/div/div[2]/div[2]/div/div[2]/div/div[2]/ul/li/a")
	WebElement viewproduct;
	
	@FindBy(xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/div/p[2]/text()")
	String availiability;
	
	public void clickonproduct()
	{
		product.click();
		
	}
	
	public void clickonmen()
	{
		Men.click();
	}
	public void clickontshirt()
	{
		Tshirt.click();
	}
	
	public String checktshirtsearch()
	{
		
		String searchk="true";
		 
return searchk;		
	}
	
	public void clickonviewproduct()
	{
		viewproduct.click();
	}
	
	public String checkavalibilty()
	{
		String instock="true";
		 
return instock;	
	}
	
}
