package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LoginWithCRMSFA {

	public static void main(String[] args) {
		
		//Browser driver path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		
		//Adjust Window size
		driver.manage().window().maximize();
		
		//Open the URL
		driver.get("http://leaftaps.com/opentaps/");
		
		//Find and input Username
		driver.findElementById("username").sendKeys("demosalesmanager");
		
		//Find and input password
		driver.findElementById("password").sendKeys("crmsfa");
		
		//Click on login
		driver.findElementByClassName("decorativeSubmit").click();
		
		//Click on CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();
		
		//Click on Create lead shortcut
		driver.findElementByLinkText("Create Lead").click();
		
		//Enter Values in Company Name, First name and Last name
		driver.findElementById("createLeadForm_companyName").sendKeys("TCS"); 
		driver.findElementById("createLeadForm_firstName").sendKeys("Priyaa");
		driver.findElementById("createLeadForm_lastName").sendKeys("Selvaraj");
		
		//Click for creating the lead
		driver.findElementByClassName("smallSubmit").click();
		
		//get Title of the current page = View Lead | opentaps CRM
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
		//wait
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Closing all browser instances
		driver.quit();

	}

}
