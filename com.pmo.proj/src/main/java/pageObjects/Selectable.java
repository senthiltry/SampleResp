package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utility.Setup;

public class Selectable extends Setup {
	private static WebElement element;
	
	public static WebElement selectableLeftNav(WebDriver driver) {
		//element = driver.findElement(By.xpath("(//div[@id='sidebar']//ul//li)[1]/a"));
		element = driver.findElement(By.linkText("Selectable"));
		return element;
		
	}
	
	public static WebElement selectableFrame(WebDriver driver) {
		element = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		return element;
	}
	public static List<WebElement> selectableEle(WebDriver driver) {
		List<WebElement> list = driver.findElements(By.xpath("//body//ol//li"));
		return list;
	}


}
