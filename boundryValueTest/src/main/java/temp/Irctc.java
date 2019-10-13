package temp;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irctc {

	public static void main(String[] args) throws InterruptedException {
		
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElementByXPath("(//i[contains(@class,'fa-align-justify')])[1]").click();
		driver.findElementByXPath("//button[@class='search_btn' and text()='LOGIN']").click();
		driver.findElementByLinkText("REGISTER").click();
		
		
		
		Thread.sleep(2000);
		driver.quit();
		

	}

}
