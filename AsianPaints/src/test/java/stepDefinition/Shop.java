package stepDefinition;


import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PagefactoryPOM.ShopPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Shop
{
	
    WebDriver driver;
	@BeforeTest
	@Given("^User is on homepage$")
public void user_is_on_homepage() throws Throwable 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\pnaveen3\\eclipse\\java-2021-03\\eclipse\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();	    
	    driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    assertTrue(driver.getTitle().contains("Wall Paints, Home Painting & Paint Colour Combinations in India - Asian Paints"));
    
}

 @Test(priority=1)
	@When("User logs in with mobile number and OTP")
	public void user_logs_in_with_mobile_number_and_otp() throws InterruptedException 
	{
	 WebDriverWait wait = new WebDriverWait(driver, 30);   	
	  ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	  ap.clickProfile();
	  ap.setMobile("9958515619");
	  ap.clickSubmit();
	  Thread.sleep(20000);
	  ap.Submit();
	  assert driver.findElement(By.xpath("//span[@class='spriteIcon-Aprevamp profileIcon-active']")).isDisplayed();
	}
 @Test(priority=2)
@When("^User user navigates to shop$")
public void user_user_navigates_to_shop() throws Throwable 
{
ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class); 
		ap.shop();
    
}
 @Test(priority=3)
@When("^User clicks on wallpapers$")
public void user_clicks_on_wallpapers() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	ap.wallpaper();
}
 @Test(priority=4)
@When("^User clicks on colour$")
public void user_clicks_on_colour() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	ap.colour();
}
 @Test(priority=5)
@When("^User Selects favourite wallpapers$")
public void user_Selects_favourite_wallpapers() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	ap.wallsel();
}
 @Test(priority=6)
@When("^User enters pincode and clicks buy now$")
public void user_enters_pincode_and_clicks_buy_now() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	ap.pincode(null);
	ap.checkout();
}
 @Test(priority=7)
@When("^User selects address and clicks on continue$")
public void user_selects_address_and_clicks_on_continue() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	ap.cart();
}
 @Test(priority=8)
@When("^User clicks on pay now$")
public void user_clicks_on_pay_now() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	ap.address();
	
}
 @Test(priority=9)
@Then("^User Should see Payment page$")
public void user_Should_see_Payment_page() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	ap.payment();
	
}

@AfterTest
public void close()
{
	driver.quit();
}

}
