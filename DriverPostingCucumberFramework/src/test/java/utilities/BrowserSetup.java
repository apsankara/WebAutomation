package utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserSetup {
	public static WebDriver driver;


	public void openbrowser() {
		//WebDriverManager.chromedriver().setup();
		//String ProjectPath="C:\\SeleniumSetup\\chromedriver_win32\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		
	}


	public void closebrowser() 
	{
		driver.quit();
	}

}
