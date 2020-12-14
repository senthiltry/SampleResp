package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Setup;

public class Resizable extends Setup {
	
	private static WebElement element;
	
	public static WebElement resizableLeftNav(WebDriver driver)
	{
		element = driver.findElement(By.linkText("Resizable"));
		return element;
	}
	public static WebElement resizableFrame(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		return element;
	}
	public static WebElement resizableEle(WebDriver driver)
	{
		element = driver.findElement(By.xpath("//div[@id='resizable']//div/following::div[2]"));
		return element;
	}
	
}