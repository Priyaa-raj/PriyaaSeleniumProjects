package week5.day1.testcase;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateLead extends LeafTapsSpecificWrapper {
	@BeforeTest
	public void setData() {
		excelFileName = "CreateLead_DataSet";
	}

	@Test(dataProvider = "inputData")
	public void createLeadRun(String cName, String fname, String lName, String firstNameLocal, String lastNameLocal,
			String salutation, String source, String title, String annualRev, String industry, String ownership,
			String codeSic, String description, String impNote, String countryCode, String areaCode, String extn,
			String dept, String currencyPref, String empCount, String tickerSymbol, String personAsk, String webURL,
			String toName, String address1, String address2, String city, String state, String country, String zipCode,
			String zipCodeExtn, String marketingCamp, String phoneNo, String emailId) {

		// Click on Create lead shortcut
		driver.findElementByLinkText("Create Lead").click();

		// Enter Values in Company Name, First name and Last name
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys(fname);
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);

		// Enter First and Last name local
		driver.findElementByCssSelector("#createLeadForm_firstNameLocal").sendKeys(firstNameLocal);
		driver.findElementByCssSelector("#createLeadForm_lastNameLocal").sendKeys(lastNameLocal);
		// Enter Salutation
		driver.findElementByCssSelector("#createLeadForm_personalTitle").sendKeys(salutation);
		// choose source
		WebElement source1 = driver.findElementByCssSelector("#createLeadForm_dataSourceId");
		Select option = new Select(source1);
		option.selectByValue(source);
		// enter title and annual revenue
		driver.findElementByCssSelector("#createLeadForm_generalProfTitle").sendKeys(title);
		driver.findElementByCssSelector("#createLeadForm_annualRevenue").sendKeys(annualRev);
		// choose industry
		WebElement industry1 = driver.findElementByCssSelector("#createLeadForm_industryEnumId");
		Select option1 = new Select(industry1);
		option1.selectByValue(industry);
		// choose ownership
		WebElement ownership1 = driver.findElementByCssSelector("#createLeadForm_ownershipEnumId");
		Select option2 = new Select(ownership1);
		option2.selectByValue(ownership);
		// Enter SIC code and Description
		driver.findElementByCssSelector("#createLeadForm_sicCode").sendKeys(codeSic);
		;
		driver.findElementByCssSelector("#createLeadForm_description").sendKeys(description);
		// Enter Importnant note and Country code
		driver.findElementByCssSelector("#createLeadForm_importantNote").sendKeys(impNote);
		WebElement countryCode1 = driver.findElementByCssSelector("#createLeadForm_primaryPhoneCountryCode");
		countryCode1.clear();
		countryCode1.sendKeys(countryCode);
		// Enter Area Code and extension and department
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneAreaCode").sendKeys(areaCode);
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneExtension").sendKeys(extn);
		driver.findElementByCssSelector("#createLeadForm_departmentName").sendKeys(dept);
		// Choose preferred currency
		WebElement currency = driver.findElementByCssSelector("#createLeadForm_currencyUomId");
		Select option3 = new Select(currency);
		option3.selectByValue(currencyPref);
		// Enter no of Employees, ticker symbol
		driver.findElementByCssSelector("#createLeadForm_numberEmployees").sendKeys(empCount);
		driver.findElementByCssSelector("#createLeadForm_tickerSymbol").sendKeys(tickerSymbol);
		// Enter person to ask for
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneAskForName").sendKeys(personAsk);
		// Enter web url
		driver.findElementByCssSelector("#createLeadForm_primaryWebUrl").sendKeys(webURL);
		// Enter to name, address 1 and 2 , city
		driver.findElementByCssSelector("#createLeadForm_generalToName").sendKeys(toName);
		driver.findElementByCssSelector("#createLeadForm_generalAddress1").sendKeys(address1);
		driver.findElementByCssSelector("#createLeadForm_generalAddress2").sendKeys(address2);
		driver.findElementByCssSelector("#createLeadForm_generalCity").sendKeys(city);

		// Choose country
		WebElement country1 = driver.findElementByCssSelector("#createLeadForm_generalCountryGeoId");
		Select option5 = new Select(country1);
		option5.selectByValue(country);
		// Choose state or province
		WebElement state1 = driver.findElementByCssSelector("#createLeadForm_generalStateProvinceGeoId");
		Select option4 = new Select(state1);
		option4.selectByValue(state);

		// Enter zip/postal code and zip/postal code extension
		driver.findElementByCssSelector("#createLeadForm_generalPostalCode").sendKeys(zipCode);
		driver.findElementByCssSelector("#createLeadForm_generalPostalCodeExt").sendKeys(zipCodeExtn);
		// Choose marketing campaign
		WebElement marketing = driver.findElementByCssSelector("#createLeadForm_marketingCampaignId");
		Select option6 = new Select(marketing);
		option6.selectByValue(marketingCamp);
		// Enter Phone number and email address
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneNumber").sendKeys(phoneNo);
		driver.findElementByCssSelector("#createLeadForm_primaryEmail").sendKeys(emailId);

		// Click Create Lead
		driver.findElementByXPath("//input[@name='submitButton']").click();
		/*
		 * // Verify First Name WebElement firstNameSaved =
		 * driver.findElementByCssSelector("#viewLead_firstName_sp");
		 * assertEquals("Priyaa", firstNameSaved.getText());
		 * System.out.println("First Name is Verified");
		 */

	}
	/*
	 * @DataProvider(name="inputData") public Object[][] sendData(){
	 * 
	 * Object[][] data = new Object[2][3]; data[0][0]="TCS"; data[0][1]="Priyaa";
	 * data[0][2]="Selvaraj";
	 * 
	 * data[1][0]="Google"; data[1][1]="Babu"; data[1][2]="Kannan";
	 * 
	 * return data;
	 * 
	 * }
	 */

}
