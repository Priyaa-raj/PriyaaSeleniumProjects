package week2.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPage {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://testleaf.herokuapp.com/pages/Button.html");
		
		//Click button to travel to Home Page
		driver.findElementByXPath("//button[@id='home']").click();
		
		Thread.sleep(1000);
		driver.navigate().back();
		
		//Find position of button (x,y) 
		Point location = driver.findElementByXPath("//button[@id='position']").getLocation();
		System.out.println(location);
		
		//Find button color
		String cssValue = driver.findElementByXPath("//button[@id='color']").getCssValue("background-color");
		System.out.println(cssValue);
		
		//Find the height and width 
		Dimension size = driver.findElementByXPath("//button[@id='size']").getSize();
		System.out.println(size);
		
		
		
		
		Thread.sleep(3000);
		
		driver.quit();

	}

}
