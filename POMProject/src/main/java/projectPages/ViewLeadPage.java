package projectPages;

import org.openqa.selenium.WebElement;

import projectSuperBase.LeafTapsSpecificWrapper;

public class ViewLeadPage extends LeafTapsSpecificWrapper {

	public ViewLeadPage verifyFirstName(String fname) throws InterruptedException {
		
		WebElement fnameVerifi = driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");

		if (fnameVerifi.getText().contains(fname)) {
			System.out.println("First Name is Verified");
		}
		return this;
	}

}
