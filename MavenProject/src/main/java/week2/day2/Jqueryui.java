package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jqueryui {

	public static void main(String[] args) throws InterruptedException {
// classroom assignment for drag and drop
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Adjust Window size
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

		// Open the URL
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions builder = new Actions(driver);
		
		WebElement drag = driver.findElementByXPath("//div[@id='draggable']");
		
		WebElement drop = driver.findElementByXPath("//div[@id='droppable']");
		
		builder.dragAndDrop(drag, drop).perform();
		
		//builder.contextClick().keyDown(Keys.DOWN).
		
		Thread.sleep(3000);
		
		driver.quit();


	}

}
