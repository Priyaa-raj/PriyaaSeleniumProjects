package week5.day1.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DuplicateLead extends LeafTapsSpecificWrapper{

	@Test
	public void duplicateLeadRun() throws InterruptedException {
		
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
	}

}
