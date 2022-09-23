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
		aDriver.MoreDetailsClick(PSMoreDetailLink.PSx86bitfilename,PSMoreDetailLink.link_PSMoreDetails_x86,"Filename: UNIV_5.887.3.0_PS_x86.zip", "More details: V3 Xerox Global Print Driver PostScript");
		//aDriver.MultipleElementSearchClick(PSMoreDetailLink.link_PSMoreDetails_x86,"More details: V3 Xerox Global Print Driver PostScript", "GPDPSDriverMoreDetailsLink");
		//aDriver.click(PSMoreDetailLink.PSMoreDetails, "PSMoreDetailsSerchLinkClick");
		//aDriver.PSMoreDetails();
}
}
