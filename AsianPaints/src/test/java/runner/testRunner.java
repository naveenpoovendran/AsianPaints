package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Features/Shop.feature",glue= {"stepDefinition"},plugin= {"pretty","html:target/Information"})
public class testRunner extends AbstractTestNGCucumberTests 
{

}
