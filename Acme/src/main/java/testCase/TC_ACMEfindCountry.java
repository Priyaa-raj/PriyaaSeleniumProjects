package testCase;

import java.awt.AWTException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class TC_ACMEfindCountry {
	
	@Test
	public void executeTest() throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://acme-test.uipath.com/account/login");
		
		WebElement userName = driver.findElementById("email");
		userName.sendKeys("kumar.testleaf@gmail.com");
		userName.sendKeys(Keys.TAB);
		WebElement passWord = driver.findElementById("password");
		passWord.sendKeys("leaf@12");
		passWord.sendKeys(Keys.ENTER);
		
		driver.findElementById("buttonLogin").click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		WebElement vendor = driver.findElementByXPath("(//div[@class='dropdown']/button)[4]");
		
		jse.executeScript("arguments[0].scrollIntoView();", vendor);
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(vendor).perform();
		
		Thread.sleep(1000);
		
		driver.findElementByLinkText("Search for Vendor").click();
		
		driver.findElementById("vendorName").sendKeys("Blue Lagoon");
		driver.findElementById("buttonSearch").click();
		
		WebElement table = driver.findElementByXPath("//table[@class='table']");		
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
			WebElement currentRow = allrows.get(1);
			List<WebElement> col = currentRow.findElements(By.tagName("td"));
			String country = col.get(4).getText();
			System.out.println("Printing Country : " +country);
		Thread.sleep(2000);
		driver.quit();
	}
	

}
