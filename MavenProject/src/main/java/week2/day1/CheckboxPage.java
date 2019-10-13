package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckboxPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		
		driver.findElementByXPath("//label[text()='Select the languages that you know?']/following-sibling::input[1]").click();
		
		boolean selected = driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input").isSelected();
		
		if(selected)
		{
		System.out.println("Selenium is checked");
		}
		
		List<WebElement> unselect = driver.findElementsByXPath("//label[text()='DeSelect only checked']/following-sibling::input");
				
		for (WebElement check : unselect) {
			if(check.isSelected())
			{
				check.click();
			}
		}
		
		List<WebElement> allselect = driver.findElementsByXPath("//label[text()='Select all below checkboxes ']/following-sibling::input");
		
		for (WebElement allClick : allselect) {
			if(!allClick.isSelected())
			{
			allClick.click();
			}
		}
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
