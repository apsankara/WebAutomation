package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class XeroxDropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.support.xerox.com/");
		
		WebElement Searchbox=driver.findElement(By.xpath("//*[@class='CoveoOmnibox magic-box']//input"));
		Searchbox.sendKeys("GPD \n");
		
		List<WebElement>ModelSearchlinks=driver.findElements(By.xpath("//div[@class='coveo-result-list-container coveo-list-layout-container']//a"));
		System.out.println("No of Links Found for GPD_ModelSearchlinks: " +ModelSearchlinks.size());
		
		for(WebElement Links:ModelSearchlinks) {
			System.out.println(Links.getText());
			System.out.println(Links.getAttribute("href"));
			if(Links.getText().contains("Drivers & Downloads - Xerox Global Print Driver")) {
				JavascriptExecutor executor=(JavascriptExecutor)driver;
				executor.executeScript("arguments[0].click()", Links);
			break;
			
		}}
		WebElement OSSelect=driver.findElement(By.xpath("//select[@name='platform']"));
		Select OSOption=new Select(OSSelect);
		OSOption.selectByIndex(2);
		OSOption.selectByValue("win10");
		OSOption.selectByVisibleText("Windows 11");
		
		List<WebElement> alllist=OSOption.getOptions();
		
		System.out.println(alllist.size());
		
		OSSelect.sendKeys("Windows 7");
		
		for(WebElement val:alllist) {
			System.out.println(val.getText());
		}
		
		WebElement Lanselect=driver.findElement(By.xpath("//*[@name='language']"));
		Select lanoptions=new Select(Lanselect);
		
		List<WebElement> alllanguage=lanoptions.getOptions();
		
		for(WebElement val:alllanguage) {
			System.out.println(val.getText());
		}
		
		
	}
}
