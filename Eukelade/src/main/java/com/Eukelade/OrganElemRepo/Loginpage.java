package com.Eukelade.OrganElemRepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpage {
	@FindBy(name="user_name")
	private WebElement username9tb;
	
	@FindBy(name="user_password")
	private WebElement passwordtb;
	
	@FindBy(id="submitButton")
	private WebElement loginbtn;
	
	@FindBy(xpath="//div[contains(text(),'You must specify')]	")
	private WebElement errormsg;

	public WebElement getusername9tb()
	{
		return username9tb;
	}
	
	public WebElement getpasswordtb()
	{
		return passwordtb;
	}
	public WebElement getloginbtn()
	{
		return loginbtn;
	}
	
	public WebElement geterrormsg()
	{
		return errormsg;
	}
	public void loginApp(String username,String password) {
		username9tb.sendKeys(username);
		passwordtb.sendKeys(password);
		loginbtn.click();
	}

}
