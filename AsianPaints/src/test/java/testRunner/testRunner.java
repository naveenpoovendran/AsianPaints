package testRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="src/test/resources/Features/Shop.feature",glue= {"stepDefinition"})
public class testRunner extends AbstractTestNGCucumberTests 
{

}
