package practice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"user-signup-actions\"]/div[1]/div[1]/a[2]")).click();
		
		WebElement button=driver.findElement(By.xpath("//*[@id=\"file-upload\"]"));
		JavascriptExecutor js=(JavascriptExecutor) driver; 
		js.executeScript("arguments[0].click();", button);
		
		/*
		 * Copy the path
		 * Control +V
		 * Enter
		 * 
		 */
		
		Robot rb=new Robot();
		rb.delay(2000);
		
		//put path file in clip board
		StringSelection ss=new StringSelection("C:\\Users\\AADHINATH\\Downloads\\Sankaralingam_Selenium_Resume.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss,null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);		
		rb.keyRelease(KeyEvent.VK_ENTER);
		rb.delay(2000);
	}

}
