package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.Drop;
import utility.Setup;

public class DropAction extends Drop {
	public void clickDropLeftNav(WebDriver driver)
	{
		waitForEle(driver,Drop.dropLeftNav(driver),1000,100);
		Drop.dropLeftNav(driver).click();
	}
	public void enterDropFrame(WebDriver driver) {
		waitForEle(driver,Drop.dropFrame(driver),1000,100);
		driver.switchTo().frame(Drop.dropFrame(driver));
	}
	public void dragAndDropFunc(WebDriver driver) {
		Actions action= new Actions(driver);
		waitForEle(driver,Drop.dragFrom(driver),1000,100);
		waitForEle(driver,Drop.dropTo(driver),1000,100);
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		}
		action.dragAndDrop(Drop.dragFrom(driver), Drop.dropTo(driver)).perform();
		driver.switchTo().defaultContent();
	}
	

}
