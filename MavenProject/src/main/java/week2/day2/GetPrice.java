package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetPrice {

	public static void main(String[] args) {
		// Classroom assignment using Xpath - amazon get price from results

		// Browser driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Adjust Window size
		driver.manage().window().maximize();

		// Open the URL
		driver.get("http://amazon.in/");

		WebElement dropdown = driver.findElementByXPath("//select[@id='searchDropdownBox']");

		Select sc = new Select(dropdown);

		sc.selectByVisibleText("Electronics");

		driver.findElementByXPath("//input[@id='twotabsearchtextbox']").sendKeys("redmi", Keys.ENTER);

		String result = driver.findElementByXPath("(//span[@class='a-price-whole'])[2]").getText();
		
		System.out.println("The Price of Second Result is Rs:"+result);

		// wait on screen
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Closing the driver
		driver.close();

	}

}
