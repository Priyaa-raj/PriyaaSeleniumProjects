package com.leafBot.pages;

import com.leafBot.selenium.api.base.SeleniumBase;


public class MyHomePage extends SeleniumBase{
	
	public MyLeadsPage clickLeads()
	{
		click(locateElement("xpath", "//a[text()='Leads']"));
		return new MyLeadsPage();
	}

}
