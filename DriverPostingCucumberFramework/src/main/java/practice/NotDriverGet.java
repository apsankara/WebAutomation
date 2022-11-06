package practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class NotDriverGet {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		
		executor.executeScript("window.location='https://www.google.com'");
	}

}
