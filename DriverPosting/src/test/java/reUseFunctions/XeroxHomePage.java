package reUseFunctions;

import java.io.IOException;
import java.util.NoSuchElementException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;

public class XeroxHomePage {
	ActionDriver aDriver=new ActionDriver();
	
	public void XeroxSupportPage() throws IOException {
		try {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("XeroxHomePageToSearchModel");
		aDriver.navigateToApplication("https://www.support.xerox.com/");
		//aDriver.type(XeroxSupportPage.DriverSearchBox, "Xerox Global Print Driver", "");
		//aDriver.click(XeroxSupportPage.DriverSearchBtn,"DriverSearchButton");
		//aDriver.MultipleElementSearchClick(ModelLinkPage.SearchLink,"Drivers & Downloads - Xerox Global Print Driver","SerchLinkClick");
		}catch(NoSuchElementException ex) {				
			aDriver.navigateToApplication("https://www.support.xerox.com/en-us/product/global-printer-driver/downloads");
			StartBrowser.childTest.fail("Url is not navigated successfully, hence directly enterd the GPD download page");
	}		
	}
}
