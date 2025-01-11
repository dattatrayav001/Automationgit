package TestRunner;

//import org.junit.runner.RunWith;
import io.cucumber.testng.AbstractTestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;
//@RunWith(Cucumber.class)
@CucumberOptions
(
		features = {"classpath:features/abc.feature"},  // Path to your feature files
	    glue = {"StepDefinition"},
		//plugin={"pretty","html:target/cucumber-report/report1.html"},// Package with step definitions
		plugin= {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
				monochrome=true,
	
		dryRun=false,
		tags="@regression"
		)

public class Run extends AbstractTestNGCucumberTests {
}