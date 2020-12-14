package testCases;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageActions.SelectableAction;
import utility.Setup;

public class SelectableTC_004 extends SelectableAction{
	private WebDriver driver;
	Setup set;
	
	@BeforeTest
	public void LaunchBrowser() {
		set = new Setup();
		driver=set.setBrowser(driver);
		set.loadurl(driver);
		
	}
	@Test
	public void execDropFunc() throws InterruptedException, AWTException {
		clickSelectableleftNav(driver);
		enterSelectableFrame(driver);
		selectablefunc(driver);
		
	}
	@AfterTest
	public void exitBrwoser() {
		driver.quit();
	}

}
