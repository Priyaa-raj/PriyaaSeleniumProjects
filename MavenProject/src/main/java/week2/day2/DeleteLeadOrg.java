package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadOrg {

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
				
				//click subtab phone 
				driver.findElementByXPath("//span[text()='Phone']").click();
				
				//Enter phone number
				driver.findElementByXPath("//input[@name='phoneNumber']").sendKeys("123");
				
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
				
				if(message.equals("No records to display"))
				{
					System.out.println("Confirms Successful Deletion");
				}
				else
				{
					System.out.println(" Not deleted Successfully");
				}
				
				Thread.sleep(1000);
				
				//Closing the browser
				driver.quit();

				
				
				
	}

}
