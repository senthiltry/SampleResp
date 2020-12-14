package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Setup;

public class Drag extends Setup {
	
	private static WebElement element;
	
	public static WebElement dragLeftNav(WebDriver driver) {
		//element = driver.findElement(By.xpath("(//div[@id='sidebar']//ul//li)[1]/a"));
		element = driver.findElement(By.linkText("Draggable"));
		return element;
		
	}
	
	public static WebElement dragFrame(WebDriver driver) {
		element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		return element;
	}
	public static WebElement dragEle(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='draggable']"));
		return element;
	}

}
