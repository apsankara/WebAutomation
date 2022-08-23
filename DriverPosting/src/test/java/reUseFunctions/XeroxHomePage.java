package reUseFunctions;

import java.io.IOException;
import java.util.NoSuchElementException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.GPDPage;
import webPageObjectRepository.HomePage;

public class XeroxHomePage {
	ActionDriver aDriver=new ActionDriver();
	
	public void HomePage() throws IOException {
		try {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("XeroxHomePageToSearchModel");
		aDriver.navigateToApplication("https://www.support.xerox.com/");
		aDriver.type(HomePage.DriverSearchBox, "Global Print Driver", "");
		aDriver.click(HomePage.DriverSearchBtn,"DriverSearchButton");
		aDriver.click(GPDPage.GPDSearchLink, "GPDLink");
		}catch(NoSuchElementException ex) {				
			aDriver.navigateToApplication("https://www.support.xerox.com/en-us/product/global-printer-driver/downloads");
			StartBrowser.childTest.fail("Url is not navigated successfully, hence directly enterd the GPD download page");
	}
	}
}
