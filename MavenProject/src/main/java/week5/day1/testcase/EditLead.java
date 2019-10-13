package week5.day1.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EditLead extends LeafTapsSpecificWrapper {

	@BeforeTest
	public void setData() {
		excelFileName = "EditLead_DataSet";
	}
	@Test(dataProvider = "inputData")
	public void editLeadRun(String firstName,String titleVerify,String newCompName) throws InterruptedException {
		
		// click leads tab
		driver.findElementByXPath("//a[text()='Leads']").click();

		// click find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		// Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys(firstName);
		// click find leads button
		driver.findElementByXPath("//button[text()='Find Leads']").click();

		Thread.sleep(3000);

		// Click on first resulting lead

		/*
		 * WebElement table =
		 * driver.findElementByXPath("(//table[@class='x-grid3-row-table'])[1]");
		 * WebElement row = table.findElement(By.tagName("tr")); List<WebElement> col =
		 * row.findElements(By.tagName("td")); String firstLead = col.get(1).getText();
		 */

		WebElement firstLeadwe = driver.findElementByXPath("(//div[(contains(@class,'x-grid3-cell-inner'))]/a)[1]");
		// String firstLead = firstLeadwe.getText();
		// System.out.println(firstLead);
		firstLeadwe.click();

		Thread.sleep(1000);

		// verify title of the page
		String title = driver.getTitle();
		if (title.equals(titleVerify)) {
			System.out.println("Title of the Page is verified");
		}

		// Click edit

		driver.findElementByXPath("//a[text()='Edit']").click();
		
		//Change company name
		
		WebElement companyName = driver.findElementByCssSelector("#updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys(newCompName);
		
		//Click Update
		driver.findElementByXPath("//input[@value='Update']").click();
		
		//Verify if updated company name is present
		WebElement updatedCompany = driver.findElementByCssSelector("#viewLead_companyName_sp");
		String comNameVerify = updatedCompany.getText();
		if(comNameVerify.contains(newCompName))
		{
			System.out.println(" Company Name is changed successfully");
		}
		

	}

}
