package projectPages;

//import org.openqa.selenium.WebDriver;

import projectSuperBase.LeafTapsSpecificWrapper;

public class LoginPage extends LeafTapsSpecificWrapper {
	
	/*public LoginPage(WebDriver driver) {
		this.driver = driver;
	}*/

	public LoginPage enterUsername(String userName) {
		driver.findElementById("username").sendKeys(userName);
		return this;
	}

	public LoginPage enterPassword(String passWord) {
		driver.findElementById("password").sendKeys(passWord);
		return this;
	}

	public HomePage clickLogin() {
		driver.findElementByClassName("decorativeSubmit").click();
		return new HomePage();
	}
}
