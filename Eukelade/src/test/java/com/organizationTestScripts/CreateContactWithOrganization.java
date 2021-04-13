package com.organizationTestScripts;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Eukelade.genericrepository.BaseClass;
import com.Eukelade.genericrepository.JavaUtility;
import com.Eukelade.genericrepository.WebDriverUtility;

public class CreateContactWithOrganization extends BaseClass {

	WebDriverUtility wdu=new WebDriverUtility();
	JavaUtility ju=new JavaUtility();
	@Test
	public void createConwithOrg() throws Exception
	 {
		 int num=ju.createRandomNumber();
		String conname="Elon"+num;
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a/img[contains(@title,'Create Contact')]")).click();
		WebElement mrrmrs = driver.findElement(By.name("salutationtype"));
		wdu.selectbyvaluedd(mrrmrs, "Mr.");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(conname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mask");
		driver.findElement(By.xpath("//img[@title='Select']")).click();
		wdu.switchtochildwindow();
		driver.findElement(By.id("search_txt")).sendKeys("Infosys");
		driver.findElement(By.name("search")).click();
		driver.findElement(By.xpath("//a[text()='Infosys']")).click();
		wdu.switchtoMainwindow1();
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		System.out.println("success");
   }
	
}
