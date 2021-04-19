package com.Eukelade.OrganElemRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(linkText="Products")
	private WebElement productlink;
	
	@FindBy(xpath="(//img[contains(@src,'themes/softed')])[2]")
	private WebElement Signoutdd;
	
	@FindBy(linkText="Sign Out")
	private WebElement Signoutlink;
	
	@FindBy(xpath="(//a[text()='Organizations'])[1]")
	private WebElement organizationsClick;
	
	public WebElement getProductLink()
	{
		return productlink;
	}
	public WebElement getSignoutdd()
	{
		return Signoutdd;
	}
	public WebElement getSignOutLink()
	{
		return Signoutlink;
	}
	
	public WebElement getOrganizationsClick() 
	{
		return organizationsClick;
	}
	
}
