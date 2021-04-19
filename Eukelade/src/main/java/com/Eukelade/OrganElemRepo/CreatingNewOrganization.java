package com.Eukelade.OrganElemRepo;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class CreatingNewOrganization {
	
	


	@FindBy(name="accountname")
	private WebElement organizationNametb;
	
	@FindBy(name="industry")
	private WebElement industrynamesList;
	
	@FindBy(xpath="(//input[@name='assigntype'])[2]")
	private WebElement groupRadioBtn;
	
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement ratingList;
	
	/*@FindBys({
		@FindBy(xpath="//select[@name='rating']")
		
	})
	private List<WebElement> allRatingDD;*/
	
	@FindBy(xpath="//select[@name='rating']")
	private WebElement allRatingDD;
	
	@FindBy(name="notify_owner")
	private WebElement notifyownerchkbox;
	

	@FindBy(xpath="//input[contains(@value,'Save')]")
	private WebElement savebtnClk;
	
	public WebElement getOrganizationNametb() {
		return organizationNametb;
	}

	public WebElement getIndustrynamesList() {
		return industrynamesList;
	}

	public WebElement getGroupRadioBtn() {
		return groupRadioBtn;
	}
	

	public WebElement getRatingList() 
	{
		return ratingList;
	}

	public WebElement getAllRatingDD() 
	{
		return allRatingDD;
	}

	public WebElement getNotifyownerchkbox()
	{
		return notifyownerchkbox;
	}

	public WebElement getSavebtnClk() {
		return savebtnClk;
	}
}
