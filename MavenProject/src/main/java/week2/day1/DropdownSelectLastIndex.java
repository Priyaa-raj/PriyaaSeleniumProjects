package week2.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelectLastIndex {

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
		
		//3. choose first dropdown
		WebElement firstDropdown = driver.findElementById("dropdown1");
		
		Select sc= new Select(firstDropdown);
		
		// use function to get all the options/values of first dropdown
		List<WebElement> options = sc.getOptions();
		
		//find size of the options
		int size = options.size();
		
		//Clicking the option
		options.get(size-1).click();
		
		//printing the value
		System.out.println(options.get(size-1).getText());
			
		Thread.sleep(7000);
		
		// Closing all browser instances
		driver.close();

	}

}
