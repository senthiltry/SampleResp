package utility;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class Setup extends Constant {
	
	public WebDriver setBrowser(WebDriver driver) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Supporting Files For Automation\\chromedriver v86\\chromedriver.exe");
		ChromeOptions option=new ChromeOptions();
		option.addArguments("start-maximized");
		driver= new ChromeDriver(option);
		return driver;
		
	}
	
	public void loadurl(WebDriver driver) {
		driver.get(Constant.url);
		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
	}

	public void waitForEle(WebDriver driver, WebElement element, int timeout, int pollTime) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver> (driver)
				.withTimeout(Duration.ofSeconds(1000))
				.pollingEvery(Duration.ofMillis(30))
				.ignoring(Exception.class);
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
}
