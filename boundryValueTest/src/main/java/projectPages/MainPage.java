package projectPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import projectWrapper.ProjectBase;

public class MainPage extends ProjectBase {

	public MainPage resizePage() throws AWTException, InterruptedException  {
		System.out.println("zooming");

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(2000);
		driver.get(driver.getCurrentUrl());
		return this;
	}

	public RegisterationPage clickRegister() throws InterruptedException {
		
		Thread.sleep(2000);
		WebElement registerButton = driver
				.findElementByXPath("//a[contains(text(),'REGISTER') and @class='ng-star-inserted']");

		if (registerButton.isDisplayed()) {
			System.out.println("Visible");
		} else {
			System.out.println("Not Visible");
		}
		registerButton.sendKeys(Keys.ENTER);
	
		return new RegisterationPage();
	}

}
