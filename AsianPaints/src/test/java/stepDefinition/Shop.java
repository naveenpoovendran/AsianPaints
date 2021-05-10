package stepDefinition;


import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
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


public class Shop
{
	
    WebDriver driver;
	@BeforeTest
	@Given("^User is on homepage$")
public void user_is_on_homepage() throws Throwable 
{
System.setProperty("webdriver.chrome.driver","C:\\Users\\pnaveen3\\eclipse\\java-2021-03\\eclipse\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
	    //WebDriver driver=new ChromeDriver();
	    this.driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    assertTrue(driver.getTitle().contains("Wall Paints, Home Painting & Paint Colour Combinations in India - Asian Paints"));
    
}

 @Test(priority=1)
	@When("User logs in with mobile number and OTP")
	public void user_logs_in_with_mobile_number_and_otp() throws InterruptedException 
	{
	 	
	  ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  ap.clickprofile();
	  ap.understand();
		ap.clickloginbtn();
		ap.enterno("9958515619");
		ap.numbersubmit();
		
		Thread.sleep(30000);
		ap.otpsubmit();
		Thread.sleep(3000);
		boolean view=ap.logincheck();
		Assert.assertTrue(view);
	  Thread.sleep(1000);
	
	}
 
 @Test(priority=2)
@When("^User user navigates to shop$")
public void user_user_navigates_to_shop() throws Throwable 
{
        ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class); 
        Thread.sleep(2000);
		ap.shop();
		Thread.sleep(3000);
		
}
 
 @Test(priority=3)
@When("^User clicks on wallsticker$")
public void user_clicks_on_wallsticker() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	Thread.sleep(3000);
	ap.wallpaper();
	Thread.sleep(3000);
	boolean view1=ap.wallstickercheck();
	Assert.assertTrue(view1);
	
}
 
 @Test(priority=4)
@When("^User clicks on size$")
public void user_clicks_on_size() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.size();
	Thread.sleep(3000);
	ap.large();
	boolean view2=ap.sizecheck();
	Assert.assertTrue(view2);
	
}
 
 @Test(priority=5)
@When("^User Selects favourite wallsticker$")
public void user_Selects_favourite_wallsticker() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.wallsel();
	Thread.sleep(3000);
	String MainWindow=driver.getWindowHandle();		
	
    // To handle all new opened window.				
        Set<String> s1=driver.getWindowHandles();		
        Iterator<String> i1=s1.iterator();		
    		
    while(i1.hasNext())			
    {		
        String ChildWindow=i1.next();		
        		
        if(!MainWindow.equalsIgnoreCase(ChildWindow))			
        {    		
             
                // Switching to Child window
                driver.switchTo().window(ChildWindow);
	
        }
    }
 }
 
 @Test(priority=6)
@When("^User enters pincode and clicks buy now$")
public void user_enters_pincode_and_clicks_buy_now() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	ap.pincode("110092");
	Thread.sleep(3000);
	ap.checkout();
	boolean view3=ap.pincodecheck();
	Assert.assertTrue(view3);
	
}
    
 @Test(priority=7)
@When("^User selects address and clicks on continue$")
public void user_selects_address_and_clicks_on_continue() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	
	Thread.sleep(2000);
	ap.cart();
	
	Thread.sleep(3000);
	boolean view4=ap.addresscheck();
	Assert.assertTrue(view4);
	
}
 
 @Test(priority=8)
@When("^User clicks on pay now$")
public void user_clicks_on_pay_now() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	
	ap.address();
	Thread.sleep(3000);
	
}
 
 @Test(priority=9)
@Then("^User Should see Payment page$")
public void user_Should_see_Payment_page() throws Throwable 
{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
		
	Thread.sleep(3000);
	boolean view5=ap.paypagecheck();
	Assert.assertTrue(view5);
	Thread.sleep(5000);
	
}
 
 @AfterTest
 public void quit()
 {
	driver.quit();
 }
    
}
