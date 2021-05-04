package stepDefinition;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import PagefactoryPOM.ShopPOM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Shop
{
	WebDriver driver;
	@Test
	@Given("User is on homepage")
	public void user_is_on_homepage() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pnaveen3\\eclipse\\java-2021-03\\eclipse\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();	    
	    driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    assertTrue(driver.getTitle().contains("Wall Paints, Home Painting & Paint Colour Combinations in India - Asian Paints"));
	}
    @Test
	@When("User logs in with mobile number and OTP")
	public void user_logs_in_with_mobile_number_and_otp() 
	{
	 WebDriverWait wait = new WebDriverWait(driver, 30);   	
	  ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	  ap.clickProfile();
	  ap.setMobile("9958515619");
	  ap.clickSubmit();
	  ap.Submit();
	  assert driver.findElement(By.xpath("//span[@class='spriteIcon-Aprevamp profileIcon-active']")).isDisplayed();
	}
/*
	@When("User navigates to shop")
	public void user_navigates_to_shop() {
	  
	}

	@When("User clicks on wallstickers")
	public void user_clicks_on_wallstickers() {
	    
	}

	@When("User clicks on size and selects large")
	public void user_clicks_on_size_and_selects_large() {
	  
	}

	@When("User Selects favourite wallstickers")
	public void user_selects_favourite_wallstickers() {
	
	}

	@When("User enters pincode and clicks buy now")
	public void user_enters_pincode_and_clicks_buy_now() {
	   
	}

	@When("User selects address and clicks on continue")
	public void user_selects_address_and_clicks_on_continue() {
	  
	}

	@When("User clicks on pay now")
	public void user_clicks_on_pay_now() {

	}

	@Then("User Should see Payment page")
	public void user_should_see_payment_page() {
	  
	}
	
*/
}
