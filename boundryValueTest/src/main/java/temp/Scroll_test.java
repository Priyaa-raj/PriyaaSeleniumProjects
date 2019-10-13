package temp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://demo.guru99.com/test/guru99home/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		// Scroll by pixel

		// jse.executeScript("window.scrollBy(0,1000)");

		// Scroll by visible element

		/*
		 * WebElement qtp = driver.findElementByLinkText("QTP");
		 * 
		 * jse.executeScript("arguments[0].scrollIntoView();", qtp);
		 * 
		 * System.out.println(driver.findElementByXPath(
		 * "(//div[@class='module-content'])[4]//p").getText());
		 * 
		 */

		// scroll to the bottom of the page
		jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		System.out.println(driver.findElementByLinkText("Books to Read").getText());
		Thread.sleep(2000);

		driver.quit();

	}

}
