package pageActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import pageObjects.Drop;
import pageObjects.Resizable;

public class ResizableAction extends Resizable {
	public void clickResizableLeftNav(WebDriver driver) {
		waitForEle(driver, Resizable.resizableLeftNav(driver), 1000, 100);
		Resizable.resizableLeftNav(driver).click();
	}

	public void enterResizableFrame(WebDriver driver) {
		waitForEle(driver, Resizable.resizableFrame(driver), 1000, 100);
		driver.switchTo().frame(Resizable.resizableFrame(driver));
	}

	public void ResizableFunc(WebDriver driver) throws InterruptedException {
		Actions action = new Actions(driver);
		waitForEle(driver, Resizable.resizableEle(driver), 2000, 100);
		for (int i = 1; i <= 10; i++) {
			driver.findElement(By.tagName("body")).sendKeys(Keys.ARROW_DOWN);
		}
//		action.click(Resizable.resizableEle(driver)).moveByOffset(200,-200).perform();
		action.clickAndHold(Resizable.resizableEle(driver)).moveByOffset(200, 200).release().perform();
		Thread.sleep(3000);
		action.clickAndHold(Resizable.resizableEle(driver)).moveByOffset(-200, -200).release().perform();
		Thread.sleep(3000);
		driver.switchTo().defaultContent();
	}

}