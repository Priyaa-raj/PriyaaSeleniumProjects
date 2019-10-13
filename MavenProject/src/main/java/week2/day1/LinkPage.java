package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS	);
		
		driver.get("http://testleaf.herokuapp.com/pages/Link.html");
		
		//Go to Home Page
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[1]").click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		String attribute = driver.findElementByXPath("//a[text()='Find where am supposed to go without clicking me?']").getAttribute("href");
		System.out.println(attribute);
		
		//Verify am I broken?
		driver.findElementByXPath("//a[text()='Verify am I broken?']").click();
		Thread.sleep(1000);
		String title = driver.getTitle();
		if(title.contains("404"))
		{
			System.out.println("Link is Broken");
		}
		Thread.sleep(2000);
		driver.navigate().back();
		
		//Go to Home Page (Interact with same link name) 
		driver.findElementByXPath("(//a[text()='Go to Home Page'])[2]").click();
		Thread.sleep(2000);
		driver.navigate().back();
		
		//How many links are available in this page?
		List<WebElement> links = driver.findElementsByXPath("//a");
		System.out.println(links.size());
		
		Thread.sleep(2000);
		driver.quit();

	}

}
