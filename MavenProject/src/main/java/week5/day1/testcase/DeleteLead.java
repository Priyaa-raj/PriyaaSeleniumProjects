package week5.day1.testcase;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DeleteLead extends LeafTapsSpecificWrapper {

	@BeforeTest
	public void setData() {
		excelFileName = "DeleteLead_DataSet";
	}
	
	@Test(dataProvider = "inputData")
	public void deleteLeadRun(String phoneNo,String verifi) throws InterruptedException {
		
				// click leads tab
				driver.findElementByXPath("//a[text()='Leads']").click();

				// click find leads
				driver.findElementByXPath("//a[text()='Find Leads']").click();
				
				//click subtab phone 
				driver.findElementByXPath("//span[text()='Phone']").click();
				
				//Enter phone number
				driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys(phoneNo);
				
				//click find leads
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				Thread.sleep(2000);
				
				//Capture the lead of first resulting lead
				WebElement firstLeadwe = driver.findElementByXPath("(//div[(contains(@class,'x-grid3-cell-inner'))]/a)[1]");
				String firstLead = firstLeadwe.getText();
				System.out.println(firstLead);
				Thread.sleep(2000);
				
				//click first resulting lead
				firstLeadwe.click();
				
				//Click delete
				driver.findElementByXPath("//a[text()='Delete']").click();
				
				// click find leads
				driver.findElementByXPath("//a[text()='Find Leads']").click();
				
				//enter captured lead id
				driver.findElementByXPath("//input[@name='id']").sendKeys(firstLead);
				
				//click find leads
				driver.findElementByXPath("//button[text()='Find Leads']").click();
				
				//Verify no records message
				String message = driver.findElementByXPath("//div[text()='No records to display']").getText();
				
				if(message.equals(verifi))
				{
					System.out.println("Confirms Successful Deletion");
				}
				else
				{
					System.out.println(" Not deleted Successfully");
				}
								
	}

}
