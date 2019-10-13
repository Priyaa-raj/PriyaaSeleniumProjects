package projectPages;

import projectSuperBase.LeafTapsSpecificWrapper;

public class CreateLeadPage extends LeafTapsSpecificWrapper{
	
	public CreateLeadPage enterFirstName(String fname)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(fname);
		return this;
	}
	public CreateLeadPage enterLastName(String lName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
		return this;
	}
	
	public CreateLeadPage enterCompanyName(String cName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		return this;
	}
	public ViewLeadPage clickCreateLead()
	{
		driver.findElementByXPath("//input[@name='submitButton']").click();
		return new ViewLeadPage();
	}
	
}
