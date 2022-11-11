package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement from=driver.findElement(By.id("form:drag_content"));
		WebElement to=driver.findElement(By.id("form:drop_content"));
		
		Actions action=new Actions(driver);
		action.clickAndHold(from).moveToElement(to).release(to).build().perform();
		
		//action.dragAndDrop(from, to).build().perform();
		
		//Drag and Drop the table column
		WebElement from2=driver.findElement(By.id("form:j_idt94:j_idt95"));
		WebElement to2=driver.findElement(By.id("form:j_idt94:j_idt99"));
		
		Actions action2=new Actions(driver);
		action2.clickAndHold(from2).moveToElement(to2).release(to2).build().perform();
		
		//Drag and Drop the table Row
		WebElement from3=driver.findElement(By.xpath("(//tr[@role='row'])[17]"));
		WebElement to3=driver.findElement(By.xpath("(//tr[@role='row'])[13]"));
				
		Actions action3=new Actions(driver);
		action3.clickAndHold(from3).moveToElement(to3).release(to3).build().perform();
				
		//Drag and drop the positions.
		WebElement from1=driver.findElement(By.id("form:conpnl_header"));
		//WebElement to1=driver.findElement(By.id("form:drop_content"));
		
		Actions action1=new Actions(driver);
		action1.dragAndDropBy(from1,135, 40).build().perform();
		
		JavascriptExecutor executor=(JavascriptExecutor)driver;
		executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		
	}

}
