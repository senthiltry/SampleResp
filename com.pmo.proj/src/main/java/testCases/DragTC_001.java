package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageActions.DragAction;
import utility.Setup;


public class DragTC_001 extends DragAction {
	private WebDriver driver;
	Setup set;
	
	@BeforeTest
	public void LaunchBrowser() {
		set = new Setup();
		driver=set.setBrowser(driver);
		set.loadurl(driver);
		System.out.println("Driver Launched successfully");
		
		
	}
	@Test
	public void execDragFunc() throws InterruptedException {
		clickDragleftNav(driver);
		enterFrame(driver);
		dragfunc(driver);
		System.out.println("Drag function successfully performed");
	}
	@AfterTest
	public void exitBrwoser() {
		driver.quit();
	}

}