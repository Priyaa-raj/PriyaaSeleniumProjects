package projectSuperBase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import projectUtilities.readDataExcel;

public class LeafTapsSpecificWrapper {
	
	
	public String excelFileName;//For storing excel file name
	public static ChromeDriver driver;
	
	@Parameters("url")
	@BeforeMethod
	public void startApplication(String url) {

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);

	}

	@AfterMethod
	public void closeApplication() throws InterruptedException {
		Thread.sleep(6000);
		driver.quit();
	}
	
	@DataProvider(name="inputData")
	public Object[][] sendData() throws IOException{
		return readDataExcel.readExcel(excelFileName);
	}
		

}
