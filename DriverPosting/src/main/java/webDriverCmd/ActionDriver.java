package webDriverCmd;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


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
				StartBrowser.childTest.pass("Successfully Navigated to xerox website :" +Url);
			}else {
				driver.navigate().refresh();
			}						
			
		}catch(Exception ex) {
			StartBrowser.childTest.fail("Unable to Navigate xerox website :" +Url, 
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(ex);
			throw ex;
		}
		
	}
	
//WebDriver Click operation
	public void click(By Locator, String eleName) throws IOException {
		
try {
	driver.findElement(Locator).click();	
	StartBrowser.childTest.pass("Successfully Clicked on :" + eleName);		
		
}catch(Exception ex) {
			StartBrowser.childTest.fail("Unable to Click on :" + eleName,
					MediaEntityBuilder.createScreenCaptureFromBase64String(screenShot()).build());
			StartBrowser.childTest.info(ex);
			throw ex;
		}
		
	}
	
//WebDriver command for sending the values
	
	public void type(By Locator, String text, String eleName) throws IOException {
		try {
	driver.findElement(Locator).sendKeys(text);
	StartBrowser.childTest.pass("Successfully typed text :" + eleName+ "" + text);	
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
			StartBrowser.childTest.pass("Captured Details :" + x);
			return x;
			
		}catch(Exception ex) {
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

	
//Capturing the screenshots for failed test cases	
public String screenShot() {
	return ((TakesScreenshot)driver) .getScreenshotAs(OutputType.BASE64);
}



	}
	

