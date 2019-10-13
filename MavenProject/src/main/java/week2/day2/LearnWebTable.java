package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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
		
		WebElement sortCheck = driver.findElementByXPath("//input[@id='chkSelectDateOnly']");
		
		boolean selected = sortCheck.isSelected();
		
		if(selected)
		{
			sortCheck.click();
		}

		Thread.sleep(3000);

		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		int rowCount = allrows.size();

		for (int i = 0; i < rowCount; i++) {
			WebElement currentRow = allrows.get(i);
			List<WebElement> col = currentRow.findElements(By.tagName("td"));
			String trainName = col.get(1).getText();
			System.out.println(trainName);
		}

		Thread.sleep(1000);
		driver.quit();
	}

}
