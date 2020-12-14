package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageActions.ResizableAction;
import utility.Setup;

public class ResizableTC_003 extends ResizableAction {
	
	private WebDriver driver;
	Setup set;
	
	@BeforeTest
	public void LaunchBrowser() {
		set = new Setup();
		driver=set.setBrowser(driver);
		set.loadurl(driver);
		
	}
	@Test
	public void execDropFunc() throws InterruptedException {
		clickResizableLeftNav(driver);
		enterResizableFrame(driver);
		ResizableFunc(driver);
		
	}
	@AfterTest
	public void exitBrwoser() {
		driver.quit();
	}

}
