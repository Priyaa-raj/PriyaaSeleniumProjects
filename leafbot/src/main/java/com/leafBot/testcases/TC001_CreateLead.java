package com.leafBot.testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.leafBot.pages.LoginPage;
import com.leafBot.testng.api.base.ProjectSpecificMethods;

public class TC001_CreateLead extends  ProjectSpecificMethods{
	@BeforeTest
	public void setData() {
		excelFileName="CreateLead_testData";
		testcaseName="Create Lead";
		testcaseDec = "Create New Lead through Leaftaps";
		author="Priyaa";
		category="smoke";
		
	}
	
	@Test(dataProvider="fetchData")
	public void runTC001(String userName, String passWord, String fname, String lName, String cName) throws InterruptedException {
		new LoginPage()
		.enterUsername(userName).enterPassword(passWord).clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fname).enterLastName(lName).enterCompanyName(cName).clickCreateLead()
		.verifyFirstName(fname);
	}

}
