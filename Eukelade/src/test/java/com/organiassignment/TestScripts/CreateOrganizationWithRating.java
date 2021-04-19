package com.organiassignment.TestScripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Eukelade.OrganElemRepo.CreatingNewOrganization;
import com.Eukelade.OrganElemRepo.HomePage;
import com.Eukelade.OrganElemRepo.OrganizationsPage;
import com.Eukelade.genericrepository.BaseClass;
import com.Eukelade.genericrepository.JavaUtility;
import com.Eukelade.genericrepository.WebDriverUtility;

public class CreateOrganizationWithRating extends BaseClass{
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
		wdu.selectbyvaluedd(ratingList, "Acquired");
		cno.getSavebtnClk().click();
		WebElement organclk = hp.getOrganizationsClick();
		wdu.waitforElement(organclk );
		wdu.elementisclickable(driver, organclk);
		String actresult = op.getOrganCreatedconfmsg().getText();
		System.out.println( actresult);

}
}