package PagefactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPOM 
{
	
	WebDriver driver;
	@FindBy(css=".profileIcon")
	WebElement clickprofileicon;
	
	@FindBy(id="loginMobile")
	WebElement clicklogin;
	
	@FindBy(id="loginMobile")
	WebElement enternumber;
	
	@FindBy(xpath="//*[@id=\"validate-mobile\"]/div[2]/button")
	WebElement clicksubmit;
	
	@FindBy(xpath="//*[@id=\"loginOtp\"]")
	WebElement enterotp;
	
	@FindBy(xpath="//*[@id=\"validate-otp\"]/div[3]/button")
	WebElement Clickotpsubmit;
	
	@FindBy(xpath="//span[contains(@class,'iconTextLinks__text visible-in-Desktop')][normalize-space()='SHOP']")
	WebElement shop;
	
	@FindBy(xpath="//img[@title='ap-shop-wall-stickers-asian-paints']")
	WebElement wallpaper;
	
	@FindBy(xpath="//span[normalize-space()='size']")
	WebElement size;
	
	@FindBy(xpath="//label[normalize-space()='large']")
	WebElement large;
	
	@FindBy(xpath="//img[@title='Chasing Goals Football']")
	WebElement wallsel;
	
	@FindBy(id="productPincode")
	WebElement pincode;
	
	@FindBy(id="checkout")
	WebElement buy;
	
	@FindBy(xpath="//span[normalize-space()='Address']")
	WebElement contin;
	
	@FindBy(xpath="//span[normalize-space()='Payment']")
	WebElement contin1;
	
	@FindBy(xpath="//button[@class='global-button']//span[contains(text(),'Pay Now')]")
	WebElement pay;
	
	@FindBy(css="div[class='title-text']")
	WebElement paypage;
	
	public ShopPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickprofile()
	{
		clickprofileicon.click();
	}
	public void clickloginbtn()
	{
		clicklogin.click();
	}
	public void enterno(String PN)
	{
		enternumber.sendKeys(PN);
	}
	public void numbersubmit()
	{
		clicksubmit.click();
	}
	public void otpenter(String OTP)
	{
		enterotp.sendKeys(OTP);
	}
	public void otpsubmit()
	{
		Clickotpsubmit.click();
	}
	public void shop()
	{
		shop.click();
	}
	
    public void wallpaper()
    {
    	wallpaper.click();
    }
    public void size()
    {
    	size.click();
    }
    public void large()
    {
    	large.click();
    }
    public void wallsel()
    {
    	wallsel.click();
    }
    public void pincode(String pc)
    {
    	pincode.click();
    	pincode.sendKeys(pc);
    }
    public void checkout()
    {
    	buy.click();
    }
    public void cart()
    {
    	contin.click();
    }
    public void address()
    {
    	contin1.click();
    }
    public void payment()
    {
    	pay.click();
    }
    public boolean paypage()
    {
    	return paypage.isDisplayed();
    }

}
