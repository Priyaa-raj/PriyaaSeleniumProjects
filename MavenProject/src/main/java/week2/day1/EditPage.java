package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditPage {

	public static void main(String[] args) {

		//Classroom Assignment
		// Browser driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Adjust Window size
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Open the URL
		driver.get("http://testleaf.herokuapp.com/pages/Edit.html");
		
		//Enter email address element
		driver.findElementByXPath("//input[@id='email']").sendKeys("example@gmail.com");
		
		//Append text and press keyboard tab
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("NewText",Keys.TAB);
		
		//Get default text entered 
		String defaultValue = driver.findElementByXPath("//input[@value='TestLeaf']").getAttribute("value");
		System.out.println(defaultValue);
		
		//Clear the text
		driver.findElementByXPath("//input[@value='Clear me!!']").clear();
		
		//Confirm that edit field is disabled
		boolean enabled = driver.findElementByXPath("//label[text()='Confirm that edit field is disabled']/following-sibling::input").isEnabled();

		if(enabled)
		{
			System.out.println("Field is Enabled");
		}
		else
		{
			System.out.println("Field is Disabled");
		}
		
	
		driver.quit();
	}

}
