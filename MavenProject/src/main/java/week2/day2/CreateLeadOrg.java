package week2.day2;

import static org.testng.Assert.assertEquals;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLeadOrg {

	public static void main(String[] args) throws InterruptedException {
		

		// Browser driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Adjust Window size
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open the URL
		driver.get("http://leaftaps.com/opentaps/");

		// Find and input Username
		driver.findElementById("username").sendKeys("demosalesmanager");

		// Find and input password
		driver.findElementById("password").sendKeys("crmsfa");

		// Click on login
		driver.findElementByClassName("decorativeSubmit").click();

		// Click on CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();

		// Click on Create lead shortcut
		driver.findElementByLinkText("Create Lead").click();

		// Enter Values in Company Name, First name and Last name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS");
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys("Priyaa");
		driver.findElementById("createLeadForm_lastName").sendKeys("Selvaraj");
		//Enter First and Last name local
		driver.findElementByCssSelector("#createLeadForm_firstNameLocal").sendKeys("Star");
		driver.findElementByCssSelector("#createLeadForm_lastNameLocal").sendKeys("Ace");
		//Enter Salutation
		driver.findElementByCssSelector("#createLeadForm_personalTitle").sendKeys("Miss");
		//choose source
		WebElement source = driver.findElementByCssSelector("#createLeadForm_dataSourceId");
		Select option = new Select(source);
		option.selectByValue("LEAD_CONFERENCE");
		//enter title and annual revenue
		driver.findElementByCssSelector("#createLeadForm_generalProfTitle").sendKeys("Business Analyst");
		driver.findElementByCssSelector("#createLeadForm_annualRevenue").sendKeys("5 lakhs");
		//choose industry
		WebElement industry = driver.findElementByCssSelector("#createLeadForm_industryEnumId");
		Select option1 = new Select(industry);
		option1.selectByValue("IND_AEROSPACE");
		//choose ownership
		WebElement ownership = driver.findElementByCssSelector("#createLeadForm_ownershipEnumId");
		Select option2 = new Select(ownership);
		option2.selectByValue("OWN_CCORP");
		//Enter SIC code and Description
		driver.findElementByCssSelector("#createLeadForm_sicCode").sendKeys("123456");;
		driver.findElementByCssSelector("#createLeadForm_description").sendKeys("My Description");
		//Enter Importnant note and Country code
		driver.findElementByCssSelector("#createLeadForm_importantNote").sendKeys("My Important note");
		WebElement countryCode = driver.findElementByCssSelector("#createLeadForm_primaryPhoneCountryCode");
		countryCode.clear();
		countryCode.sendKeys("+61");
		//Enter Area Code and extension and department
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneAreaCode").sendKeys("663");
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneExtension").sendKeys("42121");
		driver.findElementByCssSelector("#createLeadForm_departmentName").sendKeys("Automation");
		//Choose preferred currency
		WebElement currency = driver.findElementByCssSelector("#createLeadForm_currencyUomId");
		Select option3 = new Select(currency);
		option3.selectByValue("AUD");
		//Enter no of Employees, ticker symbol
		driver.findElementByCssSelector("#createLeadForm_numberEmployees").sendKeys("6");
		driver.findElementByCssSelector("#createLeadForm_tickerSymbol").sendKeys("NYSE:KUM");
		//Enter person to ask for
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneAskForName").sendKeys("Mufasaa");
		//Enter web url
		driver.findElementByCssSelector("#createLeadForm_primaryWebUrl").sendKeys("www.mypage.com");
		//Enter to name, address 1 and 2 , city
		driver.findElementByCssSelector("#createLeadForm_generalToName").sendKeys("Zazu");
		driver.findElementByCssSelector("#createLeadForm_generalAddress1").sendKeys("29, Hunter Street");
		driver.findElementByCssSelector("#createLeadForm_generalAddress2").sendKeys("Parramatta");
		driver.findElementByCssSelector("#createLeadForm_generalCity").sendKeys("Sydney");
		//Choose state or province
		WebElement state = driver.findElementByCssSelector("#createLeadForm_generalStateProvinceGeoId");
		Select option4 = new Select(state);
		option4.selectByValue("NY");
		//Choose country
		WebElement country = driver.findElementByCssSelector("#createLeadForm_generalCountryGeoId");
		Select option5=new Select(country);
		option5.selectByValue("AUS");
		//Enter zip/postal code and zip/postal code extension
		driver.findElementByCssSelector("#createLeadForm_generalPostalCode").sendKeys("2150");
		driver.findElementByCssSelector("#createLeadForm_generalPostalCodeExt").sendKeys("22");
		//Choose marketing campaign
		WebElement marketing = driver.findElementByCssSelector("#createLeadForm_marketingCampaignId");
		Select option6=new Select(marketing);
		option6.selectByValue("DEMO_MKTG_CAMP");
		//Enter Phone number and email address
		driver.findElementByCssSelector("#createLeadForm_primaryPhoneNumber").sendKeys("0470684596");
		driver.findElementByCssSelector("#createLeadForm_primaryEmail").sendKeys("aussiegirl@yahoo.com");
		//Click Create Lead
		driver.findElementByXPath("//input[@name='submitButton']").click();
		//Verify First Name
		WebElement firstNameSaved = driver.findElementByCssSelector("#viewLead_firstName_sp");
		assertEquals("Priyaa", firstNameSaved.getText());
		System.out.println("First Name is Verified");
		
		
		Thread.sleep(1000);
		driver.quit();
	}
}
