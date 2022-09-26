package webDriverCmd;


import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.FluentWait;

import com.aventstack.extentreports.MediaEntityBuilder;

import commonConfig.StartBrowser;

public class ActionDriver {
	WebDriver driver;
	
//Creating Constructor for driver object
	
	public ActionDriver() {
		
		driver=StartBrowser.driver;		
	}
		
//driver navigation to application site
	public void navigateToApplication(String Url) throws IOException {
		
		try {
			driver.get(Url);
			String pageTitle=driver.getTitle();
			
			if(pageTitle.equalsIgnoreCase("Product Support and Drivers – Xerox")){
				StartBrowser.childTest.pass("Successfully Navigated to xerox website: " +Url);
			}else {
				driver.navigate().refresh();
			}						
			
		}catch(Exception ex) {
			StartBrowser.childTest.fail("Unable to Navigate xerox website: " +Url, 
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(ex);
			throw ex;
		}
		
	}
	
//WebDriver Click operation
	public void click(By Locator, String eleName) throws IOException {
		
try {
	driver.findElement(Locator).click();	
	StartBrowser.childTest.pass("Successfully Clicked on: " + eleName);		
		
}catch(Exception ex) {
			StartBrowser.childTest.fail("Unable to Click on :" + eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(ex);
			throw ex;
		}
		
	}
	
	//Model search in list of web elements
	public void MultipleElementSearchClick(By Locator, String linkname, String eleName) throws IOException 
	{
		try {
			List<WebElement>Searchlinks=driver.findElements(Locator);		
			System.out.println("No of Links Found for ModelSearchlinks: " +Searchlinks.size());
			for(WebElement links :Searchlinks) 
			{
				System.out.println(links.getText());
				if(links.getText().contains(linkname))
				{
					JavascriptExecutor jse = (JavascriptExecutor)driver;
					jse.executeScript("arguments[0].click()", links);
					//links.click();
					StartBrowser.childTest.pass("SearchLink Clicked: " +linkname);
					break;
				}
			}
			}catch(Exception ex){
				StartBrowser.childTest.fail("Unable to Capture the details ", 
						MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
				StartBrowser.childTest.info(ex);
				throw ex;
		}
		
}
//WebDriver command for sending the values
	
	public void type(By Locator, String text, String eleName) throws IOException {
		try {
	driver.findElement(Locator).sendKeys(text);
	StartBrowser.childTest.pass("Successfully Typed Text: " + eleName+ "" + text);	
		}catch(Exception ex) {
			StartBrowser.childTest.fail("Unable to type the text :" + eleName + "" + text, 
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(ex);
			throw ex;
		}
	}
	
	//get the text value from the web page
	public String gettext(By Locator) throws IOException{
		try {
			String x= driver.findElement(Locator).getText();
			StartBrowser.childTest.pass("Captured Details: " + x);
			return x;
			
		}catch(Exception ex) {
			StartBrowser.childTest.fail("Unable to Capture the details ", 
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(ex);
			throw ex;
		}
		
	}
	
	//Model search in list of web elements
	public void MultipleElementGetText(By Locator, String textname, String eleName) throws IOException 
	{
		try {			
			List<WebElement>SearchTextName=driver.findElements(Locator);
			//List<WebElement>filename=driver.findElements(Locator2);
			//System.out.println("No of Links Found for GPD_ModelSearchlinks: " +ModelSearchlinks.size());
			for(WebElement llinks :SearchTextName) 
			{
				//System.out.println(llinks.getText());
				if(llinks.getText().contains(textname))
				{
					//Assert.assertEquals(textname, "");
					StartBrowser.childTest.pass("Driver Value Comparison is Successful Actual:"+textname +" Expected:" +llinks.getText());
					break;
				}				
			}
			}catch(Exception ex){
				StartBrowser.childTest.fail("Unable to Capture the details ", 
						MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
				StartBrowser.childTest.info(ex);
				throw ex;
		}
		
}
	
	//Model search in list of web elements //not used for any where
		public void MoreDetailsClick(By Locator1, By Locator2, String filename, String linkname) throws IOException 
		{
			try {
				List<WebElement> PS64bitfilename=driver.findElements(Locator1);	
				//System.out.println("No of Links Found for GPD_ModelSearchlinks: " +ModelSearchlinks.size());
				List<WebElement>PSMoreDetailslinks=driver.findElements(Locator2);
				for (WebElement filename1:PS64bitfilename) 
				{
					
					if(filename1.getText().contains(filename))				
							{						
						for(WebElement Pslinks :PSMoreDetailslinks) 
						{						
							if((filename1.getText().contains(filename))&&(Pslinks.getText().contains(linkname)))
							 {	
								JavascriptExecutor jse = (JavascriptExecutor)driver;
								jse.executeScript("arguments[0].click()", Pslinks);
								//Pslinks.click();
								StartBrowser.childTest.pass("SearchLink Clicked: " +linkname);
							 }
						}break;
							}
				}
				}catch(Exception ex){
					StartBrowser.childTest.fail("Unable to Capture the details ", 
							MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
					StartBrowser.childTest.info(ex);
					throw ex;
			}
			
	}
	
	//Mouse Action Movement method
	public void mouseHover(By Locator, String eleName) throws IOException {
		try {
			Actions a=new Actions(driver);
			WebElement movemouse=driver.findElement(Locator);
			a.moveToElement(movemouse).build().perform();
			StartBrowser.childTest.pass("Successfully Performed the Action :" + eleName);
			
		}catch(Exception ex) {
			StartBrowser.childTest.fail("Successfully not Performed the Action :" + eleName, 
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(ex);
			throw ex;
		}
	}

	//delete the downloaded file in the directory
	public boolean isFileDownloaded(String downloadPath, String fileName) {
		  File dir = new File(downloadPath);
		  File[] dirContents = dir.listFiles();

		  for (int i = 0; i < dirContents.length; i++) {
		      if (dirContents[i].getName().equals(fileName)) {
		          // File has been found, it can now be deleted:
		          dirContents[i].delete();
		          StartBrowser.childTest.pass("File has been found,Existing Downloaded File Deleted");
		          return true;
		          
		      }
		          }
		  	StartBrowser.childTest.pass("File Does not Exits to Delete");
		      return false;
		  }
	
	
		
//Capturing the screenshots for failed test cases	
public String screenShot() {
	return ((TakesScreenshot)driver) .getScreenshotAs(OutputType.BASE64);
}


  //Wait time for driver to download for upto 4 min 
public void DownlodWaitTime(String path) { File file = new File(path);
  FluentWait<WebDriver> wait = new
  FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(50)).
  pollingEvery(Duration.ofMillis(200000)); wait.until( x -> file.exists()); }
 

	}
	

