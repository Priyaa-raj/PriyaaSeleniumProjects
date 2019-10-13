package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLeadOrg {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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

		// click leads tab
		driver.findElementByXPath("//a[text()='Leads']").click();

		// click find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		Thread.sleep(2000);

		// click email sub tab
		driver.findElementByXPath("//span[text()='Email']").click();

		// Enter email address
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("gmail");

		// click find leads
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);

		// Capture the name of first resulting lead
		WebElement firstLeadName = driver.findElementByXPath("(//div[(contains(@class,'x-grid3-cell-inner'))]/a)[3]");
		String firstName = firstLeadName.getText();
		// System.out.println(firstName);

		// Click the lead of first resulting lead
		WebElement firstLeadwe = driver.findElementByXPath("(//div[(contains(@class,'x-grid3-cell-inner'))]/a)[1]");
		firstLeadwe.click();
		Thread.sleep(2000);

		// Click Duplicate Lead
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();

		// Verify the title

		if (driver.getTitle().equals("Duplicate Lead | opentaps CRM")) {
			System.out.println("Title is verified");
		} else {
			System.out.println("Title is not verified");
		}

		// Click Create Lead
		driver.findElementByXPath("//input[@name='submitButton']").click();

		// Verify name
		String duplicatedName = driver.findElementByCssSelector("#viewLead_firstName_sp").getText();

		if (duplicatedName.equals(firstName)) {
			System.out.println("Duplicated name is verified");
		} else {
			System.out.println("Duplicated name is not verified");
		}

		Thread.sleep(1000);

		// Closing the browser
		driver.quit();

	}

}
