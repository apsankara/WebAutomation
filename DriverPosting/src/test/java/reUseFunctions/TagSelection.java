package reUseFunctions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.GPDTag;

public class TagSelection {
	ActionDriver aDriver=new ActionDriver();
	WebDriver driver;
	public void GPD() throws IOException {
		
		WebElement TagSelect=driver.findElement(GPDTag.Tag);
		Select GPDSelect=new Select(TagSelect);
		GPDSelect.selectByVisibleText("GPD");
		String TagSelectdropdownbox=GPDSelect.getFirstSelectedOption().getText();
		StartBrowser.childTest.pass("Successfully captured the tag form WebPage :" +TagSelectdropdownbox);
		
		if(TagSelectdropdownbox.equals("GPD"))
		  { 
			Assert.assertEquals(TagSelectdropdownbox, "GPD");
			  StartBrowser.childTest.pass("Language Selection Comparison is Successful "+"Actual- " +TagSelectdropdownbox +" Expected-GPD"); 
		 }
		  else 
		 {
		  StartBrowser.childTest.fail("Language Selection Comparison is not Successful "+"Actual- " +TagSelectdropdownbox +" Expected-GPD");
		  
		  }        		
	}
}

