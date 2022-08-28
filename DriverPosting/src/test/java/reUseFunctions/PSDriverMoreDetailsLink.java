package reUseFunctions;

import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSMoreDetailLink;

public class PSDriverMoreDetailsLink {
	ActionDriver aDriver=new ActionDriver();
	
	
	public void PSMoreDetails() throws IOException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverMoreDetailsLinkClick");
		//link.MultipleElementSearch(PSMoreDetailLink.PSMoreDetails, "More details: V3 Xerox Global Print Driver PostScript", "PSMoreDetailsSerchLinkClick");
		//aDriver.MultipleElementSearchClick(PSMoreDetailLink.PSMoreDetails, "More details: V3 Xerox Global Print Driver PostScript", "PSMoreDetailsSerchLinkClick");
		aDriver.click(PSMoreDetailLink.PSMoreDetails, "PSMoreDetailsSerchLinkClick");
		//aDriver.PSMoreDetails();
}
}
