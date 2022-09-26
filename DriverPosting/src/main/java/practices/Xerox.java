package practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xerox {

	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
				System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
				driver.get("https://www.support.xerox.com/");
				String title=driver.getTitle();
				System.out.println("Page Title: " +title);

				//findElement() -->return a single WebElement
				WebElement searchbox=driver.findElement(By.xpath("//*[@id=\"searchbox\"]/div[3]/div[2]/div/div[1]/input"));
				searchbox.sendKeys("GPD");
				searchbox.sendKeys(Keys.RETURN);

				//findElements ==>return a multiple WebElements
				//GPD model search link and clicked on the gpd models driver s 
				
				List<WebElement>ModelSearchlinks=driver.findElements(By.xpath("//div[@class='coveo-result-list-container coveo-list-layout-container']//a"));
				System.out.println("No of Links Found for GPD_ModelSearchlinks: " +ModelSearchlinks.size());
				
				for(WebElement modellinks :ModelSearchlinks) 
				{
					System.out.println(modellinks.getText());
					  if(modellinks.getText().contains("Drivers & Downloads - Xerox Global Print Driver")) {
						 JavascriptExecutor jse = (JavascriptExecutor)driver;
						jse.executeScript("arguments[0].click()", modellinks);
					  //modellinks.click(); 
					  break;			 
					}
				}
				
				WebElement OSSelect=driver.findElement(By.xpath("//select[@name='platform']"));
				Select OSOption=new Select(OSSelect);
				OSOption.selectByVisibleText("Windows 10");
				
				
				driver.findElement(By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div/div[4]/button")).click();
				
								try {
					List<WebElement> PSx86bitfilename=driver.findElements(By.xpath("//div[@class='xrx-fw-css-grid-row']//li"));
					System.out.println("No of Links Found for PSx86bitfilename: " +PSx86bitfilename.size());
					
					List<WebElement>AgreeBtn=driver.findElements(By.xpath("//span[@class='xrx-fw-terms-conditions__text']"));
					System.out.println("No of Links Found for AgreeBtn: " +AgreeBtn.size());
					
					WebElement element=driver.findElement(By.xpath("//h3[normalize-space()='V3 Xerox Global Print Driver PostScript']"));
						String val=element.getText();
						System.out.println(val);																			
									for(WebElement AgreeBtnlinks :AgreeBtn) 
									{					System.out.println(AgreeBtnlinks.getText());	
										if(val.contains("V3 Xerox Global Print Driver PostScript") )
										 {	
											JavascriptExecutor jse=(JavascriptExecutor)driver;
											jse.executeScript("arguments[0].click()", AgreeBtnlinks);
											//Pslinks.click();
											break;
										 }
									}
										
											
					}catch(StaleElementReferenceException ex){
						
					}
			
	}

}
