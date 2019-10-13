package week2.day1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectPage {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS	);
		
		driver.get("http://testleaf.herokuapp.com/pages/Dropdown.html");
		
		WebElement drop1 = driver.findElementByXPath("//select[@id='dropdown1']");
		Select sc = new Select(drop1);
		sc.selectByIndex(1);
		
		WebElement drop2 = driver.findElementByXPath("//select[@name='dropdown2']");
		Select sc1 = new Select(drop2);
		sc1.selectByVisibleText("Selenium");
		
		WebElement drop3 = driver.findElementByXPath("//select[@id='dropdown3']");
		Select sc2 = new Select(drop3);
		sc2.selectByValue("1");
		
		WebElement drop4 = driver.findElementByXPath("//select[@class='dropdown']");
		Select sc3 = new Select(drop4);
		List<WebElement> options = sc3.getOptions();
		System.out.println(options.size());
		
		driver.findElementByXPath("//option[text()='You can also use sendKeys to select']/parent::select").sendKeys("Selenium");
		
		driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[1]").click();
		
		Thread.sleep(5000);
		driver.quit();
		

	}

}
