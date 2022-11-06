package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {
	
	public static void main(String[] args) throws InterruptedException {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		String title=driver.getTitle();
		System.out.println("Page Title: " +title);

		//findElement() -->return a single WebElement
		WebElement searchbox=driver.findElement(By.xpath("//input[@id='small-searchterms']"));
		searchbox.sendKeys("Sankara");

		//findElements ==>return a multiple WebElements
		List<WebElement>links=driver.findElements(By.xpath("//div[@class='footer-block information']//a"));
		System.out.println(links.size());
		
		for(WebElement element:links) {
			System.out.println(element.getText());
			if(element.getText().contains("sitemap")) {
				element.click();
				break;
			}
		}
		//driver.quit();
	}

}
