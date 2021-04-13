package com.Eukelade.genericrepository;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.Eukelade.OrganElemRepo.HomePage;
import com.Eukelade.OrganElemRepo.Loginpage;

public class BaseClass {
	public static WebDriver driver;
	public DataHandler dh=new DataHandler();
	WebDriverUtility wdu=new WebDriverUtility();
	@BeforeClass
	public void configBeforeClass() throws Exception
	{
		if(dh.getDataFromProperty("Browser").equals("chrome"))
		{
		
		  System.setProperty("webdriver.chrome.driver", AutomationConstants.CHROME_PATH);
				driver=new ChromeDriver();
			}else if(dh.getDataFromProperty("Browser").equals("firefox")) 
			{
				 System.setProperty("webdriver.firefox.driver",AutomationConstants.FIREFOX_PATH);
				driver=new FirefoxDriver();
			}
			else if(dh.getDataFromProperty("Browser").equals("opera")) 
			{
				driver=new OperaDriver();
			}
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(AutomationConstants.implicitwaittime, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	@BeforeMethod
	public void configBeforeMethod() throws Exception
	{
		driver.get(dh.getDataFromProperty("url"));
		Loginpage lp=PageFactory.initElements(driver, Loginpage.class);
		lp.loginApp(dh.getDataFromProperty("username"), dh.getDataFromProperty("password"));
	}
	@AfterMethod
	public void configAfterMethod() throws Exception
	{
		HomePage hp=PageFactory.initElements(driver,HomePage .class);
		wdu.movetoelement(driver, hp.getSignoutdd());
		hp.getSignOutLink().click();
	}
	@AfterClass
	public void configAfterClass() throws Exception
	{
		driver.quit();
	}
	
}


