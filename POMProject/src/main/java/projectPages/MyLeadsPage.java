package projectPages;

import projectSuperBase.LeafTapsSpecificWrapper;

public class MyLeadsPage extends LeafTapsSpecificWrapper{
	
	public CreateLeadPage clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
		return new CreateLeadPage();
	}
	
	

}
