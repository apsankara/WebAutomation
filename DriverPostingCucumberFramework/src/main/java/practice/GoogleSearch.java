package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		
		ChromeOptions chromeoptions=new ChromeOptions();
		chromeoptions.addArguments("--start-maximized");
		WebDriver driver=new ChromeDriver();
		
		//driver maximize size options
		//Dimension dim=new Dimension(1024,860);		
		//driver.manage().window().setSize(dim);
		
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Sankaralingam");
		Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));
		
		int Position=0;
		for(WebElement options:list) {
			String val=options.getText();
			System.out.println(val);
			Position++;
			if(Position==3) {
				options.click();
				break;
			}
			/*if(val.equalsIgnoreCase("sankaralingam")) {
				options.click();
				break;
			}*/
		}
		driver.close();
	}
}