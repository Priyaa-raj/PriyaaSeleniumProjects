package week4.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub 
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		
		driver.findElementByLinkText("Contact Us").click();
		
		Set<String> winAll = driver.getWindowHandles();
		List<String> winList = new ArrayList<String>(winAll);
		WebDriver currentWindow = driver.switchTo().window(winList.get(1));
		
		String title = currentWindow.getTitle();
		String currentUrl = currentWindow.getCurrentUrl();
		
		System.out.println("Curernt Window Title is : " + title);
		System.out.println("Current Window URL is : "+ currentUrl);
		
		WebDriver firstWindow = driver.switchTo().window(winList.get(0));
		firstWindow.close();
		
		driver.switchTo().window(winList.get(1)).close();
		
		Thread.sleep(2000);
        driver.quit();

	}

}
