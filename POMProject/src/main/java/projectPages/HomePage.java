package projectPages;

import projectSuperBase.LeafTapsSpecificWrapper;

public class HomePage extends LeafTapsSpecificWrapper{
	
	public MyHomePage clickCRMSFA() {
		driver.findElementByLinkText("CRM/SFA").click();
		return new MyHomePage();
	}

}
