package stepDefinition;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagefactoryPOM.ShopPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopwallpaper 
{
	 WebDriver driver;
	 @BeforeTest
	@Given("^User is on asianpaints homepage$")
	public void user_is_on_asianpaints_homepage() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pnaveen3\\eclipse\\java-2021-03\\eclipse\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
	    
	    this.driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    assertTrue(driver.getTitle().contains("Wall Paints, Home Painting & Paint Colour Combinations in India - Asian Paints"));
	    
	}
@Test
	@When("^User sign in into asianpaints$")
	public void user_sign_in_into_asianpaints() throws Throwable 
	{
		ShopPOM as = PageFactory.initElements(driver, ShopPOM.class);
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		  
		  try {
			    WebDriverWait wait = new WebDriverWait(driver, 2);
			    wait.until(ExpectedConditions.alertIsPresent());
			    Alert alert = driver.switchTo().alert();			    
			    alert.accept();			    
			} catch (Exception e) 
		    {
			    //exception handling
			}
		    as.understand();
		    as.clickprofile();
			as.clickloginbtn();
			as.enterno("9958515619");
			as.numbersubmit();
			
			Thread.sleep(30000);
			as.otpsubmit();
			Thread.sleep(3000);
			boolean view=as.logincheck();
			Assert.assertTrue(view);
		  Thread.sleep(1000);
	    
	}
@Test
	@When("^User clicks on shop$")
	public void user_clicks_on_shop() throws Throwable 
	{
		ShopPOM as = PageFactory.initElements(driver, ShopPOM.class); 
        Thread.sleep(2000);
		as.shop();
		Thread.sleep(3000);
	}
@Test
	@Then("^User should see wallpaper option$")
	public void user_should_see_wallpaper_option() throws Throwable 
	{
	    
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    String actualTitle = driver.getTitle();
	    String expectedTitle = "Range of Nilaya House Wallpaper Collections - Asian Paints";
	    assertEquals(expectedTitle,actualTitle);
	    
	}
@AfterTest
    public void close()
    {
	      driver.quit();
    }

}
