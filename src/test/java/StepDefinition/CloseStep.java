package StepDefinition;


import java.io.IOException;




import io.cucumber.java.After;


public class CloseStep extends Baseclass{
	@After("@regression")
	  public void teardown() throws IOException
	  {
		  System.out.println("teardown method");
		 driver.close();
		 driver.quit(); 
	  }
	  
	  @After("@smoke") 
	  public void teardown1() throws IOException
	  {
		  System.out.println("teardown 1 method");	
		 driver.close(); 
		  driver.quit();
	  }

}
