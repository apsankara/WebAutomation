package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.support.xerox.com/");
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		//scrolldown
		/*executor.executeScript("window.scroll(0,450)","");
		Thread.sleep(3000);
		//scroll up
		executor.executeScript("window.scroll(0,-450)", "");
		
		//scroll to bottom of the page
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		Thread.sleep(3000);
		//scroll to top of the page
		executor.executeScript("window.scroll(0,0)", "");*/
		
		//Scroll into webelement
		WebElement element=driver.findElement(By.xpath("//div[@class='CoveoSearchbox coveo-search-box']//following::input"));
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
		
		element.sendKeys("GPD \n");
		
		//robo class used for page down and up
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_PAGE_DOWN);
		robo.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		robo.keyPress(KeyEvent.VK_PAGE_UP);
		robo.keyRelease(KeyEvent.VK_PAGE_UP);
		
	}

}
