package apachePOI;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PagefactoryPOM.ShopPOM;


public class ParameterizationTest 
{
	WebDriver driver;
	String num;
	int number;
	@BeforeTest
	public void setBrowser() throws Exception
	{
		File f=new File("C:\\Users\\pnaveen3\\eclipse\\java-2021-03\\eclipse\\SeleniumSoftware\\shop.xlsx");
	FileInputStream fis=new FileInputStream(f);
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	XSSFSheet sheet=wb.getSheetAt(0);
 number= (int) sheet.getRow(0).getCell(0).getNumericCellValue();
 num=Integer.toString(number);
	System.out.println(number);
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\pnaveen3\\eclipse\\java-2021-03\\eclipse\\SeleniumWebDriver\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
		
	}
	@Test
	public void logIn()
	{
		ShopPOM ap=PageFactory.initElements(driver, ShopPOM.class);
		driver.get("https://www.asianpaints.com/");
		ap.clickProfile();
		ap.setMobile(num);
		ap.clickSubmit();
		ap.Submit();
		boolean view=driver.findElement(By.xpath("//span[@class='spriteIcon-Aprevamp profileIcon-active']")).isDisplayed();
		Assert.assertTrue(view);
	}
@AfterTest
public void close()
{
	driver.close();
}

}
