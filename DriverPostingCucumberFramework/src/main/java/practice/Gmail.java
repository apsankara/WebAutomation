package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://accounts.google.com/v3/signin/identifier?dsh=S-334918445%3A1666883353169337&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&rip=1&sacu=1&service=mail&flowName=GlifWebSignIn&flowEntry=ServiceLogin&ifkv=AQDHYWoDl6qqgKLaTTIBQWz4JO75P9PquZR9mUvmOBrrreTLYQSimhvGvBITy6SjGcc1_cziQ7ks");
		driver.manage().window().maximize();
		driver.findElement(By.id("identifierId")).sendKeys("apsankara@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/div/button/span")).click();
		driver.findElement(By.id("Passwd")).sendKeys("3070720503707422");
		driver.findElement(By.id("signIn")).click();
		
	}

}
