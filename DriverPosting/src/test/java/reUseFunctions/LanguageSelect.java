package reUseFunctions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.LanguageSelection;

public class LanguageSelect {
	ActionDriver aDriver=new ActionDriver();
	WebDriver driver;

	public void EnglishGlobal() throws IOException {
		
		StartBrowser.childTest=StartBrowser.parentTest.createNode("Language Selection and Comparison");
		WebElement languageSelect=driver.findElement(LanguageSelection.Language);		
		aDriver.click(LanguageSelection.Language,"LanguageDropDownTag");
		Select language=new Select(languageSelect);
		language.selectByVisibleText("English (Global)");
		String languagedropdownbox=language.getFirstSelectedOption().getText();
		//StartBrowser.childTest.pass("Successfully captured the language form WebPage :" +languagedropdownbox);

		if(languagedropdownbox.equals("English (Global)"))
		{ 
			Assert.assertEquals(languagedropdownbox, "English (Global)");
			StartBrowser.childTest.pass("Language Selection Comparison is Successful "+"Actual=" +languagedropdownbox +" Expected=English (Global)"); 
		}
		else 
		{
			StartBrowser.childTest.fail("Language Selection Comparison is not Successful "+"Actual=" +languagedropdownbox +" Expected=English (Global)");

		}        		
	}
}
