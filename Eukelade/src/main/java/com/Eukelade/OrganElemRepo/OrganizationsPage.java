package com.Eukelade.OrganElemRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class OrganizationsPage {
	
	
	@FindBy(xpath="//a/img[contains(@title,'Create Organization')]")
	private WebElement createOrganizationclk;
	
	@FindBys({
		@FindBy(xpath="//table[@class='lvt small']/tbody/tr/td[3]/a")
		
	})
	private List<WebElement> allOrganNames;
	
	@FindBy(xpath="//span[contains(text(),'Organization Information')]/..")
	private WebElement organCreatedconfmsg;
	
	
	public WebElement getCreateOrganizationclk() 
	  {
		return createOrganizationclk;
	   }
		
		public List<WebElement> getAllOrganNames()
		{
			return allOrganNames;
		}
		
		public WebElement getOrganCreatedconfmsg() 
		{
			return organCreatedconfmsg;
		}

	}

