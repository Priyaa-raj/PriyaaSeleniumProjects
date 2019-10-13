package stepDefinitionPackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class createLeadCucu {
	
	public ChromeDriver driver;
	
	@Given("Open the Chrome Browser")
	public void open_the_Chrome_Browser() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Given("Maximise the browser window")
	public void maximise_the_browser_window() {
	    
		driver.manage().window().maximize();
	}

	@Given("Set the timeouts")
	public void set_the_timeouts() {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    
	}

	@Given("Load the URL")
	public void load_the_URL() {
	    
		driver.get("http://leaftaps.com/opentaps/control/main");
	}

	@Given("Enter UserName as (.*)")
	public void enter_UserName_as_Demosalesmanager(String userName) {
		driver.findElementById("username").sendKeys(userName);
	    
	}

	@Given("Enter password as (.*)")
	public void enter_password_as_crmfsa(String passWord) {
		driver.findElementById("password").sendKeys(passWord);
	}

	@Given("Click Login")
	public void click_Login() {
		driver.findElementByClassName("decorativeSubmit").click();
	}

	@Given("Click CRMFSA link")
	public void click_CRMFSA_link() {
		driver.findElementByLinkText("CRM/SFA").click(); 
	}

	@Given("Click Create Lead")
	public void click_Create_Lead() {
		driver.findElementByLinkText("Create Lead").click();
	}

	@Given("Enter Company Name as (.*)")
	public void enter_Company_Name_as_New_Company(String cName) {
		driver.findElementById("createLeadForm_companyName").sendKeys(cName);
	}

	@Given("Enter FirstName as (.*)")
	public void enter_FirstName_as_Priyaa(String fname) {
		WebElement firstName = driver.findElementById("createLeadForm_firstName");
		firstName.sendKeys(fname);
	}

	@Given("Enter LastName as (.*)")
	public void enter_LastName_as_Raj(String lName) {
		driver.findElementById("createLeadForm_lastName").sendKeys(lName);
	}

	@When("Click Create Leads Button")
	public void click_Create_Leads_Button() {
		driver.findElementByXPath("//input[@name='submitButton']").click();
	    
	}

	@Then("Verify lead is created successfully for (.*)")
	public void verify_lead_is_created_successfully(String fName) {
		WebElement fnameVerifi = driver.findElementByCssSelector("#viewLead_firstName_sp");
		
		if(fnameVerifi.getText().contains(fName))
				{
		 System.out.println("First Name is Verified");
				}
		driver.quit();
	}


}
