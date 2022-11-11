package practice;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileDownloadExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/file.xhtml");
		
		WebElement download=driver.findElement(By.xpath("//span[normalize-space()='Download']"));
		download.click();
		Thread.sleep(4000);
		File filelocation=new File("C:\\Users\\labadmin\\Downloads");
		
		File[] totalfile=filelocation.listFiles();
		
		for (File file : totalfile) {
			String filename=file.getName();
			
			if(filename.equals("TestLeaf Logo.png")) {
				System.out.println(" File has downlaoded and found name: "+filename);
				break;
			}
		}
		for (File file1 : totalfile) {
			String filename1=file1.getName();
			if(filename1.equals("TestLeaf Logo.png")) {			
				System.out.println(" File has downlaoded and found name: "+filename1);
				file1.delete();
				break;
			}
			
		}
		
	}

}
