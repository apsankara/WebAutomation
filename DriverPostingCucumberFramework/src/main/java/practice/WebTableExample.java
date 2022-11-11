package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		
		List<WebElement>totalcolunm=driver.findElements(By.tagName("th"));
		int colum=totalcolunm.size();		
		System.out.println("No of Colunm: "+colum);
		for (WebElement webElement : totalcolunm) {
			System.out.println(webElement.getText());
		}
		
		List<WebElement>totalrow=driver.findElements(By.tagName("tr"));
		int rows=totalrow.size();		
		System.out.println("No of Rows: "+rows);
		for(WebElement rowlist:totalrow) {
			System.out.println(rowlist.getText());
		}
		
		WebElement val=driver.findElement(By.xpath("//*[@id=\"form:j_idt89_data\"]/tr[2]/td[text()='Lionel Alejandro']//following::td[1]/span[3]"));
		System.out.println(val.getText());
	}

}
