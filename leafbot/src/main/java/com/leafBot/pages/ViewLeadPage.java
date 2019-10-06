package com.leafBot.pages;

import org.openqa.selenium.WebElement;

import com.leafBot.selenium.api.base.SeleniumBase;


public class ViewLeadPage extends SeleniumBase {

	public ViewLeadPage verifyFirstName(String fname) throws InterruptedException {
		
		WebElement fnameVerifi = locateElement("xpath","//span[@id='viewLead_firstName_sp']");
				
			//	driver.findElementByXPath("//span[@id='viewLead_firstName_sp']");

		if (fnameVerifi.getText().contains(fname)) {
			System.out.println("First Name is Verified");
		}
		return this;
	}

}
