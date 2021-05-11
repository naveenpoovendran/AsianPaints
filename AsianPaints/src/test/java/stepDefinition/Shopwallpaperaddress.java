package stepDefinition;

import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PagefactoryPOM.ShopPOM;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Shopwallpaperaddress 
{
	WebDriver driver;
	@Test(priority=1)
	@Given("^User is on AP homepage$")
	public void user_is_on_AP_homepage() throws Throwable 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\pnaveen3\\eclipse\\java-2021-03\\eclipse\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
	    //WebDriver driver=new ChromeDriver();
	    this.driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	    driver.manage().window().maximize();	    
	    driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
	    
	}
	@Test(priority=2)
	@When("^User logs in with contact number and OTP$")
	public void user_logs_in_with_contact_number_and_OTP() throws Throwable 
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
	    
	}
	@Test(priority=3)
	@When("^User selects shop$")
	public void user_selects_shop() throws Throwable 
	{
		ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class); 
        Thread.sleep(2000);
		ap.shop();
	    
	}
	@Test(priority=4)
	@When("^User clicks on wallsticker in shop$")
	public void user_clicks_on_wallsticker_in_shop() throws Throwable 
	{
		ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
		Thread.sleep(3000);
		ap.wallpaper();
		Thread.sleep(3000);	  
	}
	@Test(priority=5)
	@When("^User selects size$")
	public void user_selects_size() throws Throwable 
	{
		ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ap.size();
		Thread.sleep(3000);
		ap.large();
	    
	}
	@Test(priority=6)
	@When("^User clicks favourite wallsticker$")
	public void user_clicks_favourite_wallsticker() throws Throwable 
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
	@Test(priority=7)
	@When("^User input pincode and clicks buy now$")
	public void user_input_pincode_and_clicks_buy_now() throws Throwable 
	{
		ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		ap.pincode("110092");
		Thread.sleep(3000);
		ap.checkout();
	  
	}
	@Test(priority=8)
	@When("^User selects address and adds address$")
	public void user_selects_address_and_adds_address() throws Throwable 
	{
		ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
		
		Thread.sleep(2000);
		ap.cart();
		ap.addaddress();
	   
	}
	@Test(priority=9)
    @When("^User enters same ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*) and ([^\\\"]*)$")
	public void user_enters_same_Name_and_Mobile_and_Pincode_and_Flat_and_Street_and_Landmark_and_City(String Name, String Mobile, String Pincode, String Flat, String Street, String Landmark, String City) throws Throwable 
	{
	ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
	Thread.sleep(2000);
	driver.findElement(By.id("fname")).sendKeys(Name);
	//driver.findElement(By.xpath("//label[normalize-space()='Full Name*']")).sendKeys("naveen");
	Thread.sleep(2000);
	driver.findElement(By.id("mobile")).sendKeys("9958515619");
	Thread.sleep(2000);
	driver.findElement(By.id("pin")).sendKeys(Pincode);
	Thread.sleep(2000);
	driver.findElement(By.id("address1")).sendKeys(Flat);
	Thread.sleep(2000);
	driver.findElement(By.id("address2")).sendKeys(Street);
	driver.findElement(By.id("landmark")).sendKeys(Landmark);
	driver.findElement(By.id("city")).sendKeys(City);
	    
	}
	@Test(priority=10)
    @When("^User clicks on save address$")
	public void user_clicks_on_save_address() throws Throwable 
	{
	  ShopPOM ap = PageFactory.initElements(driver, ShopPOM.class);
		
		Thread.sleep(2000);
		//ap.saveaddress();
		Thread.sleep(2000);
	}
	@Test(priority=11)
	@Then("^user should not able to save it$")
	public void user_should_not_able_to_save_it() throws Throwable 
	{
		 driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		    assertTrue(driver.getTitle().contains("address"));
	}

	
	

}
