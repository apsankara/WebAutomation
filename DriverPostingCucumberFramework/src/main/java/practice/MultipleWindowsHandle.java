package practice;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowsHandle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(300));
		driver.get("https://demoqa.com/browser-windows");
		
		String oldwindow=driver.getWindowHandle();
		System.out.println(oldwindow);
		WebElement newwindow=driver.findElement(By.id("windowButton"));
		newwindow.click();
		
		Set<String>newindow=driver.getWindowHandles();
		
		for (String string : newindow) {
			System.out.println(string);
			driver.switchTo().window(string);
		}
		
		WebElement element=driver.findElement(By.id("sampleHeading"));	
		
		System.out.println(element.getText());
		
		driver.close();
		
		driver.switchTo().window(oldwindow);
		
		WebElement clickbtn=driver.findElement(By.id("tabButton"));
		clickbtn.click();
		
		Set<String>newindow1=driver.getWindowHandles();
		
		for (String string1 : newindow1) {
			System.out.println(string1);
			driver.switchTo().window(string1);
		}
		
		WebElement element1=driver.findElement(By.id("sampleHeading"));	
		
		System.out.println(element1.getText());
		
		driver.close();
		
	}
	
}
