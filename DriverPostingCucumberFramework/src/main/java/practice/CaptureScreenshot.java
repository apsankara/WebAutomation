package practice;

import java.io.File;
import java.io.IOException;

import org.codehaus.plexus.util.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.support.xerox.com/");
		driver.manage().window().maximize();
		
		//full page screenshot
		TakesScreenshot ts=((TakesScreenshot)driver); 
		File src=ts.getScreenshotAs(OutputType.FILE);
		File location=new File(".\\ScreenShots\\Image.png");
		FileUtils.copyFile(src, location);
		
		//section or portion of the screenshot
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div[3]/div[2]/div/div[1]/input"));
		File src1=searchbox.getScreenshotAs(OutputType.FILE);
		File location1=new File(".\\ScreenShots\\portion.png");
		FileUtils.copyFile(src1, location1);
		driver.close();
		
	}

}
