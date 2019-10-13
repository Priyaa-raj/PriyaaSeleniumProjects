package boundryValueTest;

import java.awt.AWTException;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import projectPages.MainPage;
import projectWrapper.ProjectBase;

public class TestCaseForBVA extends ProjectBase {

	 @BeforeTest
	public void setData() {
	 excelFileName = "TestData";
	 }

	@Test
	(dataProvider = "inputData")
	public void executeBVATest(String uName, String pWord) throws InterruptedException, AWTException {

		new MainPage().resizePage().clickRegister()
		.enterUsername(uName)
		.enterPassword(pWord)
		.verifyTest();
}
}
