package projectTestcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import projectPages.LoginPage;
import projectSuperBase.LeafTapsSpecificWrapper;

public class TC001_CreateLead_TestCase extends LeafTapsSpecificWrapper {
	@BeforeTest
	public void setData() {
		excelFileName = "CreateLead_testData";
	}	
	
	@Test(dataProvider = "inputData")
	public void executeCreateLead(String userName, String passWord, String fname, String lName, String cName) throws InterruptedException
	{
		new LoginPage()
		.enterUsername(userName).enterPassword(passWord).clickLogin()
		.clickCRMSFA()
		.clickLeads()
		.clickCreateLead()
		.enterFirstName(fname).enterLastName(lName).enterCompanyName(cName).clickCreateLead()
		.verifyFirstName(fname);
	}

}
