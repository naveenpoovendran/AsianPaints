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
	
	@FindBy(xpath="//a[@href='https://www.asianpaints.com/products/wall-coverings/wallpaper-collection.html']//span[@class='iconTextLinks__text'][normalize-space()='Wallpapers']")
	WebElement wall;
	
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
	
	@FindBy(xpath="//button[@class='ctaText i-understand-btn text-uppercase']")
	WebElement understand;
	
	@FindBy(xpath="//div[@id='checkOutTab-3']//div//span[contains(text(),'Amount Payable')]")
	WebElement paypagecheck;
	
	@FindBy(xpath="//a[normalize-space()='Add a New Address']")
	WebElement addaddress;
	
	@FindBy(id="fname")
	WebElement Fname;
	
	@FindBy(id="mobile")
	WebElement mobile;
	
	@FindBy(id="pin")
	WebElement pin;
	
	@FindBy(id="landmark")
	WebElement landmark;
	
	@FindBy(id="city")
	WebElement city;
	
	@FindBy(id="address1")
	WebElement address1;
	
	@FindBy(id="address2")
	WebElement address2;
	
	@FindBy(xpath="//button[normalize-space()='Save Address']")
	WebElement saveaddress;
	
	
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
    public void wall()
    {
    	wall.click();
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
    public void understand()
    {
    	understand.click();
    }
    public void addaddress()
    {
    	addaddress.click();
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
    public boolean paypagecheck()
    {
    	return paypagecheck.isDisplayed();
    }
    public void fname()
    {
    	Fname.click();
    }
    public void mobile()
    {
    	mobile.click();
    }
    public void pincode()
    {
    	pin.click();
    }
    public void flat()
    {
    	address1.click();
    }
    public void street()
    {
    	address2.click();
    }
    public void landmark()
    {
    	landmark.click();
    }
    public void city()
    {
    	city.click();
    }
    public void saveaddress()
    {
    	saveaddress.click();
    }

}
