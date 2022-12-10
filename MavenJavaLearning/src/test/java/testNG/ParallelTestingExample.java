package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelTestingExample {

	
		@Test
		public void openGoogle()
		{
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com/");
		}
		@Test
		public void openBing()
		{
			System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.bing.com/");
		}
		
	}

