package reUseFunctions;

import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSDriverDetails;

public class PSDriverMoreDetailsLink {
	ActionDriver aDriver=new ActionDriver();
	
	public void PSMoreDetails() throws IOException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverMoreDetails");
		aDriver.click(PSDriverDetails.MoreDetails, "PSDriverMoreDetailsLink");
}
}
