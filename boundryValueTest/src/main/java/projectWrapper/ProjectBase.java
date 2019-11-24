package projectWrapper;

import java.awt.AWTException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import utilis.DataRead;

public class ProjectBase {

	public String excelFileName;
	public static ChromeDriver driver;

	@Parameters("url")
	@BeforeMethod
	public void startApplication(String url) throws AWTException, InterruptedException {

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		

	}

	@AfterMethod
	public void closeApplication() throws InterruptedException {
		
		driver.quit();
	}

	@DataProvider(name = "inputData")
	public Object[][] sendData() throws IOException {
		return DataRead.readExcel(excelFileName);
	}

}
