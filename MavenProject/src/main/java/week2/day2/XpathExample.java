package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;


public class XpathExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Browser driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Adjust Window size
		driver.manage().window().maximize();

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
		
		//Click on lead Tab
		driver.findElementByXPath("//a[text() = 'Leads']").click();
		
		//

	}

}
