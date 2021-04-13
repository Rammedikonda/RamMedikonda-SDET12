package com.organizationTestScripts;

import java.util.Random;
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

public class CreateContact extends BaseClass{
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
		selectItemFromList(mrrmrs, "Mr.");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(conname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Mask");
		driver.findElement(By.id("phone")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[contains(@value,'Save')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		System.out.println("test script run success");
	
		
	}
	public static void selectItemFromList(WebElement list,String item)
	{
		Select s=new Select(list);
		s.selectByValue(item);
		
	}

}
