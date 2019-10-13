package projectPages;

import projectSuperBase.LeafTapsSpecificWrapper;

public class MyHomePage extends LeafTapsSpecificWrapper{
	
	public MyLeadsPage clickLeads()
	{
		driver.findElementByXPath("//a[text()='Leads']").click();
		return new MyLeadsPage();
	}

}
