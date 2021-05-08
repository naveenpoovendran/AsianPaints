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
	
	@FindBy(css="div[id='payment-btn'] span:nth-child(1)")
	WebElement pay;
	
	@FindBy(xpath="//div[@class='title-text']")
	WebElement paypage;
	
	
	@FindBy(css=".profileIcon-active")
	WebElement logincheck;
	
	@FindBy(xpath="//img[@title='Blue & Gold Macaws Wall Sticker']")
	WebElement wallstickercheck;
	
	@FindBy(xpath="//img[@title='Chasing Goals Football']")
	WebElement sizecheck;
	
	@FindBy(xpath="//h2[normalize-space()='Price Details']")
	WebElement pincodecheck;
	
	@FindBy(xpath="//span[@class='productHeading']")
	WebElement addresscheck;
	
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
    public boolean logincheck()
    {
    	return logincheck.isDisplayed();
    }
    public boolean wallstickercheck()
    {
    	return wallstickercheck.isDisplayed();
    }
    public boolean sizecheck()
    {
    	return sizecheck.isDisplayed();
    }
    public boolean pincodecheck()
    {
    	return pincodecheck.isDisplayed();
    }
    public boolean addresscheck()
    {
    	return addresscheck.isDisplayed();
    }

}
