package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageActions.DropAction;
import utility.Setup;

public class DropTC_002 extends DropAction{
	
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
		clickDropLeftNav(driver);
		enterDropFrame(driver);
		dragAndDropFunc(driver);
		System.out.println("Drop function successfully performed");
				
	}
	@AfterTest
	public void exitBrwoser() {
		driver.quit();
	}

}
