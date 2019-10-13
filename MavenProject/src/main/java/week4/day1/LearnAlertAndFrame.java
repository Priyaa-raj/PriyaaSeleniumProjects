package week4.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlertAndFrame {

	public static void main(String[] args) throws InterruptedException {
		// classroom session
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
        driver.findElementByXPath("//button[text()='Try it']").click();
        driver.switchTo().alert().sendKeys("Priyaa");
        driver.switchTo().alert().accept();
        
        String text = driver.findElementById("demo").getText();
        
        if(text.contains("Priyaa"))
        {
        	System.out.println("Text Verified");
        }
        else
        {
        	System.out.println("Text not Verified");
        }
        
        driver.switchTo().defaultContent();
        
        Thread.sleep(2000);
        driver.quit();
	}

}
