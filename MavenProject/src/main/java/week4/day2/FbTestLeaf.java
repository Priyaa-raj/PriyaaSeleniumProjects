package week4.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FbTestLeaf {

	public static void main(String[] args) throws InterruptedException {

		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("https://www.facebook.com/");

		driver.findElementByCssSelector("#email").sendKeys("priyaarajriyaa@gmail.com");
		driver.findElementByCssSelector("#pass").sendKeys("SP@10v35yd2odC");
		driver.findElementByXPath("//input[@data-testid='royal_login_button']").click();

		driver.findElementByXPath("//input[@data-testid='search_input']").sendKeys("TestLeaf");
		driver.findElementByXPath("//button[@data-testid='facebar_search_button']").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[text()='Places'])[1]").click();
		// driver.findElementByXPath("//div[text()='Places'][2]").click();
		WebElement findTestleaf = driver.findElementByXPath("//a[contains(text(),'TestLeaf')]");
		WebElement orgDetail = driver.findElementByXPath("//span[text()='Software Company']");

		if (findTestleaf.isDisplayed() && orgDetail.isDisplayed()) {
			System.out.println("TestLeaf is Present");
			WebElement likeButton = driver.findElementByXPath("//button[@data-testid='search_like_button_test_id'][1]");
			String textLike = likeButton.getText().trim();
			System.out.println(textLike);
			if (textLike.equals("Like")) {
				likeButton.click();
			} else if (textLike.equals("Liked")) {
				System.out.println("Button is already Liked");
			}
			findTestleaf.click();
			if (driver.getTitle().contains("TestLeaf")) {
				System.out.println("Title is verified");
			} else {
				System.out.println("Title is not verified");
			}
			System.out.println(driver.findElementByXPath("//div[contains(text(),'people like this')]").getText()
					.replaceAll("\\D", ""));

		} else {

			System.out.println("TestLeaf not Present");
		}

		Thread.sleep(3000);
		driver.quit();

	}

}
