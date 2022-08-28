package practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class XeroxFindElements {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.support.xerox.com/");
		String title=driver.getTitle();
		System.out.println("Page Title: " +title);

		//findElement() -->return a single WebElement
		WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div[3]/div[2]/div/div[1]/input"));
		searchbox.sendKeys("Xerox Global Print Driver");
		searchbox.sendKeys(Keys.RETURN);

		//findElements ==>return a multiple WebElements
		//GPD model search link and clicked on the gpd models driver s 
		List<WebElement>ModelSearchlinks=driver.findElements(By.xpath("//div[@class='coveo-result-list-container coveo-list-layout-container']//a"));
		System.out.println("No of Links Found for GPD_ModelSearchlinks: " +ModelSearchlinks.size());
		for(WebElement modellinks :ModelSearchlinks) 
		{
			System.out.println(modellinks.getText());
			if(modellinks.getText().contains("Drivers & Downloads - Xerox Global Print Driver"))
			{
				modellinks.click();
				break;
			}
		}
		
		WebElement OSSelect=driver.findElement(By.name("platform"));
		Select OSOption=new Select(OSSelect);
		OSOption.selectByVisibleText("Windows 10");
		
		driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div/div[4]/button")).click();
		//Pdl search link and clicked on the more details of PS driver
		//List<WebElement>PdlSearchlinks=driver.findElements(By.xpath("(//div[contains(@class,'xrx-fw-css-grid-row')])[2]//a"));
		//System.out.println("No of Links Found for PdlSearchlinks: " +PdlSearchlinks.size());
		
		List<WebElement> PS64bitfilename=driver.findElements(By.xpath("(//li[contains(@class,'xrx-fw-downloads-panel__stat')])"));	
		System.out.println("No of Links Found for PdlSearchlinks: " +PS64bitfilename.size());
		
		List<WebElement>PdlSearchlinks=driver.findElements(By.xpath("//div[@class='xrx-fw-css-grid-row']//a"));		
		System.out.println(PdlSearchlinks.size());
		
		for (WebElement filename:PS64bitfilename) 
		{
			System.out.println(filename.getText());
			
			if(filename.getText().contains("Filename: UNIV_5.887.3.1_PS_x86.zip"))				
					{
				
				for(WebElement pdllinks :PdlSearchlinks) 
				{
					System.out.println(pdllinks.getText());
					if((pdllinks.getAccessibleName().contains("More details: V3 Xerox Global Print Driver PostScript")))
					 {			
					  pdllinks.click();
					  break;
					 }
				}break;
					
		}
		
		
		/*
		 * for(WebElement pdllinks :PdlSearchlinks) {
		 * //System.out.println(pdllinks.getText());
		 * //sSystem.out.println(pdllinks.getAttribute("aria-label"));
		 * //System.out.println(pdllinks.getAccessibleName());
		 * 
		 * 
		 * //System.out.println("No of name Found for Pdlfilename: "
		 * +driverdetails.size());
		 * 
		 * if((pdllinks.getAccessibleName().
		 * contains("More details: V3 Xerox Global Print Driver PostScript"))) {
		 * pdllinks.click(); break; }
		 */
			
		
		}

		
		  WebElement checkagreebox=driver.findElement(By.className("xrx-fw-terms-conditions__checkbox")); 
		  checkagreebox.click();
		  
		  WebElement
		  downloadbtn=driver.findElement(By.xpath("//a[normalize-space()='Download']"));		  
		  downloadbtn.click();
		 
		Thread.sleep(3000);
		
		driver.quit();
	}

}
