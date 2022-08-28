package practice;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DownloadFile {

	public static void main(String[] args) {
		
		//https://www.youtube.com/watch?v=ZsSTZmlyIvc&list=PLUDwpEzHYYLtEENXAFbVPrLeLNHM6OLk7&index=30
		String location=System.getProperty("C:\\Users\\AADHINATH\\Downloads");
		
		// Crime default
		
		  HashMap preferences=new HashMap();
		  preferences.put("download.default_directory", location);
		  
		  ChromeOptions options=new ChromeOptions();
		  options.setExperimentalOption("prefs", preferences);
		 
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver(options);		
		driver.get("https://www.support.xerox.com/en-us/product/global-printer-driver/content/155711");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='xrx-fw-terms-conditions__checkbox--155711']")).click();
		
		driver.findElement(By.xpath("//a[normalize-space()='Download']")).click();
		

	}

}
