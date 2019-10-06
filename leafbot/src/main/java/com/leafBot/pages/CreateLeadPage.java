package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;

public class CreateLeadPage extends SeleniumBase {
	
	public CreateLeadPage enterFirstName(String fname)
	{
		clearAndType(locateElement("id", "createLeadForm_firstName"), fname);
		
		return this;
	}
	public CreateLeadPage enterLastName(String lName)
	{
		clearAndType(locateElement("id", "createLeadForm_lastName"), lName);
		//driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String cName)
	{
		clearAndType(locateElement("id", "createLeadForm_companyName"), cName);
		//driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	public ViewLeadPage clickCreateLead()
	{
		click(locateElement("xpath","//input[@name='submitButton']"));
		//driver.findElementByXPath("//input[@name='submitButton']").click();
		return new ViewLeadPage();
	}
	

}
