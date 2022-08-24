package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitHelper {

	WebDriver driver;
	
	public WaitHelper(WebDriver driver) {
		this.driver=driver;
	}
	
	public void WaitForElement(WebElement element, long TimeOutInSecond) {
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(TimeOutInSecond));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
}
