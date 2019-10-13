package projectPages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import projectWrapper.ProjectBase;

public class RegisterationPage extends ProjectBase{
	
	
	
	public RegisterationPage enterUsername(String userName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName"))).sendKeys(userName);
	
		return this;
	}
	
	public RegisterationPage enterPassword(String passWord)
	{
		driver.findElementById("usrPwd").sendKeys(passWord);
		return this;
		}
	public RegisterationPage verifyTest()
	{
		Boolean uFail=driver.findElementsByXPath("//div[contains(text(),'Not Available')]").size() >0;
		Boolean pFail =driver.findElementsByXPath("//div[contains(text(),'Password is invalid')]").size() > 0;
			if(pFail || uFail)
			{
				Assert.fail();
			}
			
			return this;
	}

}
