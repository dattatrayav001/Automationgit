package StepDefinition;

import java.util.Properties;

import org.apache.logging.log4j.*;
import org.openqa.selenium.WebDriver;

import PageObject.LoginPage;
import PageObject.productsearchpage;
import PageObject.signuppage;


public class Baseclass {
	
	public static WebDriver driver;
	public LoginPage loginpg;
	public signuppage signuppg;
	public productsearchpage productsearchpg;
	public static Logger Log;
	public Properties readconfig;

}
