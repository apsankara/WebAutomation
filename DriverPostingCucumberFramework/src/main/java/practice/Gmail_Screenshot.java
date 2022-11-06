package practice;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Gmail_Screenshot {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-334918445%3A1666883353169337&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWoDl6qqgKLaTTIBQWz4JO75P9PquZR9mUvmOBrrreTLYQSimhvGvBITy6SjGcc1_cziQ7ks");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("apsankara@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;		
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);		
		File destinationfile=new File("C:\\SeleniumSetup\\Screenshot\\Sample.png");		
		FileHandler.copy(sourcefile, destinationfile);
		
		Robot robot=new Robot();		
		Dimension screensize=Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle=new Rectangle(screensize);
		File destfile=new File("C:\\SeleniumSetup\\Screenshot\\SampleRobo.png");
		BufferedImage srcfile=robot.createScreenCapture(rectangle);
		ImageIO.write(srcfile, "png", destfile);
		
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);
		driver.quit();
		
	}

}
