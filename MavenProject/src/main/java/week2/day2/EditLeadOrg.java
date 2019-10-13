package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeadOrg {

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

		// click leads tab
		driver.findElementByXPath("//a[text()='Leads']").click();

		// click find leads
		driver.findElementByXPath("//a[text()='Find Leads']").click();

		// Enter first name
		driver.findElementByXPath("(//input[@name='firstName'])[3]").sendKeys("s");
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
		if (title.equals("View Lead | opentaps CRM")) {
			System.out.println("Title of the Page is verified");
		}

		// Click edit

		driver.findElementByXPath("//a[text()='Edit']").click();
		
		//Change company name
		
		WebElement companyName = driver.findElementByCssSelector("#updateLeadForm_companyName");
		companyName.clear();
		companyName.sendKeys("New Company");
		
		//Click Update
		driver.findElementByXPath("//input[@value='Update']").click();
		
		//Verify if updated company name is present
		WebElement updatedCompany = driver.findElementByCssSelector("#viewLead_companyName_sp");
		String comNameVerify = updatedCompany.getText();
		if(comNameVerify.contains("New Company"))
		{
			System.out.println(" Company Name is changed successfully");
		}
				
		Thread.sleep(1000);
		
		//Closing the browser
		driver.quit();

	}

}
