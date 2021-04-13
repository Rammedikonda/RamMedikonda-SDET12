package com.organizationTestScripts;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.Eukelade.genericrepository.BaseClass;
import com.Eukelade.genericrepository.JavaUtility;
import com.Eukelade.genericrepository.WebDriverUtility;

public class CreateOrganization extends BaseClass
{
	WebDriverUtility wdu=new WebDriverUtility();
	JavaUtility ju=new JavaUtility();
	@Test
	public void createOrg() throws Exception
	{
		 int num=ju.createRandomNumber();
		String orgname="Tesla"+num;
		driver.findElement(By.xpath("(//a[text()='Organizations'])[1]")).click();
		driver.findElement(By.xpath("//a/img[contains(@title,'Create Organization')]")).click();
		driver.findElement(By.name("accountname")).sendKeys(orgname);
		WebElement industrynames = driver.findElement(By.name("industry"));
		wdu.selectbyvaluedd(industrynames, "Biotechnology");
		WebElement typename = driver.findElement(By.name("accounttype"));
		wdu.selectbyvaluedd(typename,"Analyst" );
		driver.findElement(By.id("phone")).sendKeys("9999966745");
		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		WebElement organclk = driver.findElement(By.xpath("(//a[text()='Organizations'])[1]"));
		wdu.waitforElement(organclk );
		wdu.elementisclickable(driver, organclk);
		ArrayList<String> al1=new ArrayList<String>();
		List<WebElement> orgnames = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]/a"));
		for(int i=0;i<orgnames.size();i++)
		{
			al1.add(orgnames.get(i).getText());
		}
		for(String al:al1)
		{
		   if(al.equals(orgname))
		     {
			   System.out.println("test script is pass");
		      }
			
		  }
	}
		

	

}
