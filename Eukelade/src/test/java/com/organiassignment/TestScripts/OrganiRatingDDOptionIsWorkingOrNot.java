package com.organiassignment.TestScripts;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.Eukelade.OrganElemRepo.CreatingNewOrganization;
import com.Eukelade.OrganElemRepo.HomePage;
import com.Eukelade.OrganElemRepo.OrganizationsPage;
import com.Eukelade.genericrepository.BaseClass;
import com.Eukelade.genericrepository.JavaUtility;
import com.Eukelade.genericrepository.WebDriverUtility;

public class OrganiRatingDDOptionIsWorkingOrNot extends BaseClass {

	
	WebDriverUtility wdu=new WebDriverUtility();
	JavaUtility ju=new JavaUtility();
	@Test
	public void organAssignToMarketingGroup() throws Exception
	{
		 int num=ju.createRandomNumber();
		 String orgname="Tesla"+num;
			HomePage hp=PageFactory.initElements(driver,HomePage .class);
			OrganizationsPage op=PageFactory.initElements(driver,OrganizationsPage .class);
			CreatingNewOrganization cno= PageFactory.initElements(driver,CreatingNewOrganization.class);
			hp.getOrganizationsClick().click();
			op.getCreateOrganizationclk().click();
			cno.getOrganizationNametb().sendKeys(orgname);
			WebElement ratingList = cno.getRatingList();
			Select s=new Select(ratingList);
			List<WebElement> ratinglistopt=s.getOptions();
			for(WebElement we:ratinglistopt)
			{
				System.out.println(we.getText());
			
				if(we.isDisplayed())
				{
					System.out.println("PASS");
				}else {
					System.out.println("fail");
				}
			
			//System.out.println(ratinglistopt);
			}
			}
}
