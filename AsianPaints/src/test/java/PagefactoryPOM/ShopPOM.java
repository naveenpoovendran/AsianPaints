package PagefactoryPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPOM 
{
	
	WebDriver driver;
	@FindBy(xpath="//span[@class='spriteIcon-Aprevamp profileIcon']")
	WebElement profile;
	
	@FindBy(xpath="//input[@id='loginMobile']")
	WebElement mobile;
	
	@FindBy(xpath="//button[@class='ctaText modal__variant-login--submit']")
	WebElement submit;
	
	@FindBy(xpath="//input[@id='loginOtp']")
	WebElement otp;
	
	@FindBy(xpath="//button[@class='ctaText validate-login  modal__variant-login--submit']")
	WebElement Submit1;
	
	@FindBy(xpath="//span[@class='iconTextLinks__text visible-in-Desktop'][normalize-space()='SHOP']")
	WebElement shop;
	
	@FindBy(xpath="//a[@href='https://www.asianpaints.com/products/wall-coverings/wallpaper-collection.html']//span[@class='iconTextLinks__text'][normalize-space()='Wallpapers']")
	WebElement wallpaper;
	
	@FindBy(xpath="//legend[normalize-space()='colour']")
	WebElement colour;
	
	@FindBy(xpath="img[title='wallpaper-close-shot-asian-paints-W150Z430S75']")
	WebElement wallsel;
	
	@FindBy(xpath="//input[@id='checkPincode']")
	WebElement pincode;
	
	@FindBy(xpath="//a[normalize-space()='Buy now']")
	WebElement buy;
	
	@FindBy(css="a[class='global-button']")
	WebElement contin;
	
	@FindBy(css="a[class='global-button 1']")
	WebElement contin1;
	
	@FindBy(css="div[id='payment-btn'] span:nth-child(1)")
	WebElement pay;
	
	//@FindBy(css="div[class='title-text']")
	//WebElement paypage;
	
	public ShopPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void clickProfile()
	{
		profile.click();
	}
	public void setMobile(String mob)
	{
		mobile.sendKeys(mob);
	}
	public void clickSubmit()
	{
		submit.click();
	}
	public void Submit()
	{
		Submit1.click();
	}
	public void shop()
	{
		shop.click();
	}
	
    public void wallpaper()
    {
    	wallpaper.click();
    }
    public void colour()
    {
    	colour.click();
    }
    
    public void wallsel()
    {
    	wallsel.click();
    }
    public void pincode(String pc)
    {
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

}
