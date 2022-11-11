package reUseFunctions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadExample {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement download=driver.findElement(By.xpath("//span[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-icon-left']"));
		download.click();
		Thread.sleep(4000);
		
		String filename="C:\\Users\\labadmin\\Downloads\\Sankar.txt";
		
		//String  translation
		StringSelection selction=new StringSelection(filename);
		
		//Copy the string into the system clipboard
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selction, null);
		
		//Key function using the robo class 
		Robot robo=new Robot();
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);		
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyRelease(KeyEvent.VK_ENTER);

	}

}
