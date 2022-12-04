package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class ExplicitWaitExample {

	public static void main(String[] args) {		
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://phptravels.net/login");
		
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Email']"));
		userName.sendKeys("user@phptravels.com");
		
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));		
		password.sendKeys("demouser");
		
		driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg btn-block effect ladda-button waves-effect']")).click();
		
		WebElement profile=driver.findElement(By.linkText("My Profile"));
		
		/*WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(profile));*/
		
		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
		
		WebElement element=wait.until( x -> driver.findElement(By.linkText("My Profile"))); 
		
		/*
		 * wait.until(new Function<WebDriver, WebElement>(){
		 * 
		 * public WebElement apply(WebDriver driver) { return profile; } });
		 */
		element.click();
		System.out.println("Welcome");
		driver.quit();		
	}

}
