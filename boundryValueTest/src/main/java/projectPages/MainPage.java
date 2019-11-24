package projectPages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import projectWrapper.ProjectBase;

public class MainPage extends ProjectBase {

	public MainPage resizePage() throws AWTException, InterruptedException  {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_SUBTRACT);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		driver.navigate().refresh();
		return this;
	}

	public RegisterationPage clickRegister() throws InterruptedException {
		
		
		WebElement registerButton = driver
				.findElementByXPath("//a[contains(text(),'REGISTER') and @class='ng-star-inserted']");

				registerButton.sendKeys(Keys.ENTER);
	
		return new RegisterationPage();
	}

}
