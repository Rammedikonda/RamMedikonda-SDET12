package com.Eukelade.genericrepository;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WebDriverUtility {
	WebDriver driver;

	/**@author Ram
	 * Maximize the browser window
	 */
	public void maximizewindow(WebDriver driver) 
	{
		driver.manage().window().maximize();
	}

	/**@author Ram
	 * Wait until Page is loaded
	 */
	public void implicitwait(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(AutomationConstants.implicitwaittime, TimeUnit.SECONDS);
	}
	/**@author Ram
	 * Wait until Given element is clickable
	 * @param element
	 */
	public void elementisclickable(WebDriver driver,WebElement element) 
	{
		WebDriverWait wait = new WebDriverWait(driver, AutomationConstants.explicitwaittime);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	/**@author Ram
	 * Select element from dropdown by visible text
	 * @param element
	 * @param visibletext
	 */

	public void selectbyvisisbletextdd(WebElement element,String visibletext)
	{
		Select select = new Select(element);
		select.selectByVisibleText(visibletext);
	}
	/**
	 * @author Ram
	 * getting options from rating dropdown
	 * @param list
	 * @return
	 */
	public List<WebElement> getSelectRatingList(WebElement list)
	{
		Select s=new Select(list);
		return s.getOptions();
	}
	/**@author Ram
	 * Select element from dropdown by index 
	 * @param element
	 * @param index
	 */
	public void selectbyindexdd(WebElement element,int index)
	{
		Select select = new Select(element);
		select.selectByIndex(index);
	}
	/**@author Ram
	 * Select element from dropdown by value
	 * @param element
	 * @param value
	 */

	public void selectbyvaluedd(WebElement element,String value)
	{
		Select select = new Select(element);
		select.selectByValue(value);
	}
	/**@author Ram
	 * Refresh the given page
	 */
	public void refresh(WebDriver driver) 
	{
		driver.navigate().refresh();
	}
	/**@author Ram
	 * Switch frame by index
	 * @param index
	 */
	public void switchframebyindex(WebDriver driver,int index) 
	{
		driver.switchTo().frame(index);
	}
	/**
	 * @author Ram
	 * @param driver
	 * @param frameElement
	 */

	public void switchbyelement(WebDriver driver,WebElement frameElement) {
		driver.switchTo().frame(frameElement);
	}
  /**
   * @author Ram
   * @param driver
   * @param nameorId
   */
	
	public void switchframebynameorid(WebDriver driver,String nameorId) {
		driver.switchTo().frame(nameorId);
	}
     /**
      * @author Ram
      * @param driver
      * @param element
      */
	public void movetoelement(WebDriver driver, WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
   /**
    * @author Ram
    * @param driver
    * @param src
    * @param dest
    */
	public void draganddrop(WebDriver driver, WebElement src, WebElement dest) {
		Actions action = new Actions(driver);
		action.dragAndDrop(src, dest).perform();
	}
	
	/**@author Ram
	 * Switch tom desired windows
	 * @param driver
	 * @param windowtitleexp
	 */
	public void switchtochildwindow(WebDriver driver, String windowtitleexp) 
	{
		Set<String> set=driver.getWindowHandles();
		Iterator<String> it = set.iterator();

		while(it.hasNext()) 
		{
			String winid = it.next();
			driver.switchTo().window(winid);
			String acttitle = driver.getTitle();
			if(acttitle.contains(windowtitleexp)) 
			{
				break;
			}
		}
	}
	/**
	 * @author Ram
	 */
	public void switchtochildwindow()
	{
		 String mainid = driver.getWindowHandle();
		Set<String> allid = driver.getWindowHandles();
		for(String id1:allid)
		{
			if(!mainid.equals(id1))
			{
				driver.switchTo().window(id1);
			}
		}
		
	}
	
	/**@author Ram
	 * Wait for element until it is displayed
	 * @param element
	 * @throws InterruptedException
	 */
	public void waitforElement(WebElement element) throws InterruptedException 
	{
		int count=0;
		while(count<40) 
			try{

				element.isDisplayed();
				break;
			}
		catch(Exception e)
		{
			Thread.sleep(500);
			count++;
		}
	}
	/**@author Ram
	 * Wait for element and once available click on it.
	 * @param driver
	 * @param xpath
	 * @throws InterruptedException
	 */
	public void waitandclick(WebDriver driver,String xpath) throws InterruptedException 
	{
		int count=0;
		while(count<40) 
			try{
				driver.findElement(By.xpath(xpath)).click();
				break;
			}
		catch(Exception e)
		{
			Thread.sleep(500);
			count++;
		}
	}
	/**
	 * @author RAM
	 * ELEMENT IS DISPLAYED
	 * @param element
	 */
	public void elementIsDisplayed(WebElement element)
	{
		element.isDisplayed();
	}
/**
 * @author Ram
 * @param driver
 */
	public void switchtoMainwindow1()
	{
		 String mainid = driver.getWindowHandle();
		driver.switchTo().window(mainid); 
	
	}
}
