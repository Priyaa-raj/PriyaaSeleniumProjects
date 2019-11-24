package projectPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import projectWrapper.ProjectBase;

public class RegisterationPage extends ProjectBase{
		
	public RegisterationPage enterUsername(String userName)
	{
		WebDriverWait wait = new WebDriverWait(driver, 120);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("userName"))).sendKeys(userName);
			return this;
	}
	
	public RegisterationPage enterPassword(String passWord)
	{
		driver.findElementById("usrPwd").sendKeys(passWord);
		return this;
		}
	
	public RegisterationPage chooseQuestion()
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
	       WebElement secQue = driver.findElementByXPath("//label[text()='Select Security Question']");
	       js.executeScript("arguments[0].scrollIntoView();", secQue);
	       secQue.click();
	       List<WebElement> dropdownList = driver.findElementsByXPath("//span[contains(@class,'ng-tns-c13-8')]");
	       for (WebElement choice : dropdownList) {
	           //Thread.sleep(4000);
	           for (int i = 0; i < 10; i++) {
	               try {
	                   if (choice.getText().contains("What is your pet name?")) {
	                       choice.click();
	                       break;
	                   }
	               } catch (Exception e) {
	                   System.out.println(e.getMessage());
	               }
	           }
	       }
	       return this;
	   }
	
	
	public RegisterationPage enterSecAnswer(String secAns)
	{
		driver.findElementByXPath("//input[@formcontrolname ='secAns']").sendKeys(secAns);
		return this;
	}
	
	public RegisterationPage enterEmailId(String emailId)
	{
		driver.findElementById("email").sendKeys(emailId);
		return this;
	}
		
	public RegisterationPage verifyTest()
	{
		
		List<WebElement> userErr = driver.findElementsByXPath("//div[contains(text(),'User ID is invalid.Between 3 to 35 character.Only letter and number are allowed.')]");
		List<WebElement> passErr = driver.findElementsByXPath("//div[contains(text(),'Password is invalid')]");
		List<WebElement> secAnsErr = driver.findElementsByXPath("//div[contains(text(),'Security Answer is invalid')]");
		List<WebElement> emailErr = driver.findElementsByXPath("//div[contains(text(),'Email Min 10 character')]");
		
		Boolean uFail = userErr.size() > 0;
		Boolean pFail = passErr.size() > 0;
		Boolean sFail = secAnsErr.size() > 0;
		Boolean eFail = emailErr.size() > 0;
		
			if(pFail||uFail||sFail||eFail)
			{
				Assert.fail("Invalid Data Input");
			}
			
			return this;
	}

}
