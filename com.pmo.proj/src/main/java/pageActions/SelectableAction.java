package pageActions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import pageObjects.Drag;
import pageObjects.Selectable;

public class SelectableAction extends Selectable {
	public void clickSelectableleftNav(WebDriver driver) {
		waitForEle(driver,Selectable.selectableLeftNav(driver),3000,100);
		Selectable.selectableLeftNav(driver).click();
	}
	public void enterSelectableFrame(WebDriver driver) throws InterruptedException {
		waitForEle(driver,Selectable.selectableFrame(driver),3000,100);
		driver.switchTo().frame(Selectable.selectableFrame(driver));
		
	}
	public void selectablefunc(WebDriver driver) throws InterruptedException, AWTException {
		Actions action = new Actions(driver);
		Thread.sleep(1000);
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		}
		List<WebElement> list=Selectable.selectableEle(driver);
		action.keyDown(Keys.CONTROL);
		action.click(list.get(0)).build().perform();
		action.click(list.get(2)).build().perform();
		action.click(list.get(4)).build().perform();
		action.keyUp(Keys.CONTROL);
		driver.switchTo().defaultContent();
		Thread.sleep(1000);
		
	}

}
