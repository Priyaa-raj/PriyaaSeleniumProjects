package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailExample {

	public static void main(String[] args) throws InterruptedException {
		// Classroom Assignment 2

		// Browser driver path
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		// invoke Chrome Driver
		ChromeDriver driver = new ChromeDriver();

		// Adjust Window size
		driver.manage().window().maximize();

		// Open the URL
		driver.get("http://erail.in/");

		WebElement fromStation = driver.findElementByXPath("//input[@id='txtStationFrom']");

		fromStation.clear();
		fromStation.sendKeys("MAS", Keys.TAB);

		// txtStationTo
		WebElement toStation = driver.findElementByXPath("//input[@id='txtStationTo']");

		toStation.clear();
		toStation.sendKeys("SBC", Keys.TAB);
		
		Thread.sleep(3000);
		
		String mysoreExpTrainNumber = driver.findElementByXPath("//a[text()='MYSURU EXP']/preceding::a[1]").getText();

		System.out.println("Mysore Express Train Number is: " + mysoreExpTrainNumber);

		// wait on screen
		
			Thread.sleep(3000);
			
		String depTime = driver.findElementByXPath("//a[text()='12007']/following::td[@class='Sorted']").getText();
		System.out.println("Depature Time of Train Number 12007 is: " + depTime);

		Thread.sleep(1000);
			
		// Closing the driver
		driver.close();

	}

}
