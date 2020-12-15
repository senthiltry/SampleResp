package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.Drag;
import utility.Setup;

public class DragAction extends Drag {
	
	public void clickDragleftNav(WebDriver driver) {
		waitForEle(driver,Drag.dragLeftNav(driver),3000,100);
		Drag.dragLeftNav(driver).click();
	}
	public void enterFrame(WebDriver driver) throws InterruptedException {
		waitForEle(driver,Drag.dragFrame(driver),3000,100);
		driver.switchTo().frame(Drag.dragFrame(driver));
		
	}
	public void dragfunc(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		waitForEle(driver,Drag.dragEle(driver),3000,100);
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		}
		action.dragAndDropBy(Drag.dragEle(driver), 100, 0).perform();
		waitForEle(driver,Drag.dragEle(driver),3000,100);
		driver.switchTo().defaultContent();
		
	}
	

}
