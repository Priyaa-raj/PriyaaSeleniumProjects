package week5.day1.testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MergeLead extends LeafTapsSpecificWrapper{
	@BeforeTest
	public void setData() {
		excelFileName="MergeLead";
	}

	@Test
	public void mergeLeadRun() throws InterruptedException {

		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.findElementByXPath("//a[@href='/crmsfa/control/leadsMain']").click();
		driver.findElementByXPath("//a[@href='/crmsfa/control/mergeLeadsForm']").click();

		// declare lead id input field and find lead button
		/*
		 * WebElement leadID = driver.findElementByXPath("//input[@name='id']");
		 * WebElement findLeads =
		 * driver.findElementByXPath("//button[text()='Find Leads']"); WebElement
		 * searchResult = driver.findElementByXPath("(//a[@class='linktext'])[1]");
		 * WebElement result =
		 * driver.findElementByXPath("//div[text()='No records to display']");
		 */

		// Click to open From Leads search window
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[1]").click();
		// Handling new windows
		Set<String> allWinFrom = driver.getWindowHandles();
		List<String> lsFrom = new ArrayList<String>(allWinFrom);
		driver.switchTo().window(lsFrom.get(1));
		// input and searching From lead
		// leadID.sendKeys("16");
		driver.findElementByXPath("//input[@name='id']").sendKeys("16");
		// findLeads.click();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		// getting the first search result
		// WebElement fromSearchResult =
		// wait.until(ExpectedConditions.visibilityOf(searchResult));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='linktext'])[1]")));
		WebElement fromSearchResult = driver.findElementByXPath("(//a[@class='linktext'])[1]");
		String fromText = fromSearchResult.getText();
		System.out.println(fromText);
		Thread.sleep(2000);
		fromSearchResult.click();
		driver.switchTo().window(lsFrom.get(0));
		// Click to open to leads search window
		driver.findElementByXPath("(//img[@src='/images/fieldlookup.gif'])[2]").click();
		// Handling new window
		Set<String> allWinTo = driver.getWindowHandles();
		List<String> lsTo = new ArrayList<String>(allWinTo);
		driver.switchTo().window(lsTo.get(1));
		// searching to lead
		// leadID.sendKeys("3");
		driver.findElementByXPath("//input[@name='id']").sendKeys("3");
		// findLeads.click();
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		// clicking first search result
		// WebElement toSearchResult =
		// wait.until(ExpectedConditions.visibilityOf(searchResult));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@class='linktext'])[1]")));
		Thread.sleep(2000);
		driver.findElementByXPath("(//a[@class='linktext'])[1]").click();
		driver.switchTo().window(lsTo.get(0));
		// Click Merge button
		driver.findElementByXPath("//a[text()='Merge']").click();
		// Handling alert
		String textAlert = driver.switchTo().alert().getText();
		if (textAlert.equals("Are you sure?")) {
			driver.switchTo().alert().accept();
			System.out.println("Accept merging");
			// waiting until merging is done
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Company Name']")));
			// Click find leads
			driver.findElementByXPath("//a[text()='Find Leads']").click();;
			System.out.println("bring in"+fromText);
			// Enter from lead ID
			// leadID.sendKeys(fromText);
			driver.findElementByXPath("//input[@name='id']").sendKeys(fromText);
			// findLeads.click();
			driver.findElementByXPath("//button[text()='Find Leads']").click();

			// if(wait.until(ExpectedConditions.visibilityOf(result)).getText().equals("No
			
			if (wait.until(
					ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='No records to display']")))
					.getText().equals("No records to display")) {
				System.out.println("Test Verified");
			} else {
				System.out.println("Test Verified");
			}
		} else {
			driver.switchTo().alert().dismiss();
			System.out.println("Cancel merging");
		}
	}
}
