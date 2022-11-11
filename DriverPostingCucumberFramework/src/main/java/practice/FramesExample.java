package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://leafground.com/frame.xhtml");
		
		driver.switchTo().frame(0);
		WebElement frame1=driver.findElement(By.id("Click"));
		frame1.click();
		
		String text=driver.findElement(By.id("Click")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		//Nested iframe to click the button
		driver.switchTo().frame(2);
		driver.switchTo().frame("frame2");
		WebElement frame2=driver.findElement(By.id("Click"));
		frame2.click();
		
		String text1=driver.findElement(By.id("Click")).getText();
		System.out.println(text1);		
		
		//how many frames in the page
		driver.switchTo().defaultContent();
		List<WebElement>iframecount=driver.findElements(By.tagName("iframe"));
		int size=iframecount.size();
		System.out.println(size);
		
		}

}
