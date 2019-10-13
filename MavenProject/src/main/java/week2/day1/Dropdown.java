package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		//Classroom assignment 2
		
		//Browser driver path
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		
		//invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();
		
		//Adjust Window size
		driver.manage().window().maximize();
		
		//1. Open the URL
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		//2. find how many dropdown are there in the page
		List<WebElement> allDropdown = driver.findElementsByTagName("select");
		int numberOfDropdown = allDropdown.size();
		System.out.println(numberOfDropdown);
		
		//3. choose first dropdown
		WebElement firstDropdown = allDropdown.get(0);
		
//		//4. Select value Selenium in first drop down with sendkeys
        firstDropdown.sendKeys("Selenium");
		
					
		Thread.sleep(7000);
		
		// Closing all browser instances
		driver.close();

	}

}
