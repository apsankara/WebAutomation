package utilities;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class BrowserSetup {
	public static WebDriver driver;

	@Before(order=0)
	@SuppressWarnings("deprecation")
	public void openbrowser() {
		//WebDriverManager.chromedriver().setup();
		//String ProjectPath="C:\\SeleniumSetup\\chromedriver_win32\\chromedriver.exe";		
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}

	@After(order=1)
	public void closebrowser() 
	{
		driver.quit();
	}

}
