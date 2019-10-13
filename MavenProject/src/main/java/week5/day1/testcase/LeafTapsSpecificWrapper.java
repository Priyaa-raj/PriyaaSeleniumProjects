package week5.day1.testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import week5.day2.Utils.readDataExcel;

public class LeafTapsSpecificWrapper {
	
	
	public String excelFileName;//For storing excel file name
	public ChromeDriver driver;
	
	@Parameters({"url","userName","passWord"})
	@BeforeMethod
	public void startApplication(String url,String userName, String passWord) {
		// Browser driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// invoke Chrome Driver
		driver = new ChromeDriver();

		// Adjust Window size
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// Open the URL
		driver.get(url);

		// Find and input Username
		driver.findElementById("username").sendKeys(userName);

		// Find and input password
		driver.findElementById("password").sendKeys(passWord);

		// Click on login
		driver.findElementByClassName("decorativeSubmit").click();

		// Click on CRM/SFA link
		driver.findElementByLinkText("CRM/SFA").click();

	}

	@AfterMethod
	public void closeApplication() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}
	
	@DataProvider(name="inputData")
	public Object[][] sendData() throws IOException{
		return readDataExcel.readExcel(excelFileName);
	}
	
	
	
	
	
	
	
	
	
	
	

}
