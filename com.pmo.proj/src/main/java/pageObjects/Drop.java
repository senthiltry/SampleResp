package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Setup;

public class Drop extends Setup {
	
	private static WebElement element;
	
	public static WebElement dropLeftNav(WebDriver driver) {
		element = driver.findElement(By.linkText("Droppable"));
		return element;
	}
	public static WebElement dropFrame(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		return element;
	}
	public static WebElement dragFrom(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='draggable']"));
		return element;
	}
	public static WebElement dropTo(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='droppable']"));
		return element;
	}
}
