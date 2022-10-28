package property;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class UsingProperty {
	
	public static void main(String[] agrs ) throws IOException {
		
		FileInputStream input=new FileInputStream("config.properties");
		
		Properties properties=new Properties();
		properties.load(input);
		String browser=properties.getProperty("browser");
		String driverloacation=properties.getProperty("DriverLocation");
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", driverloacation);
			//WebDriver driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.chrome.driver", driverloacation);
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("webdriver.chrome.driver", driverloacation);
		}
		
	}

}