package Testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/features"},
		glue={"stepDef"},
		plugin = { "pretty", "html:target/cucumber-reports" }, 
		tags= {"@uat"}
		
		)


public class uatTestSuite {

}
