package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Features",glue= {"stepDefinition"},plugin= { "pretty", "json:target/json-reports/Cucumber.json",
		 "junit:target/junit-reports/Cucumber.xml",
		 "html:target/html-reports"})
public class testRunner extends AbstractTestNGCucumberTests 
{

}
