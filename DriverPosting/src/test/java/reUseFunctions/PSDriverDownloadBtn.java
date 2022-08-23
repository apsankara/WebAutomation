package reUseFunctions;

import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSDriverDetails;

public class PSDriverDownloadBtn {
	ActionDriver aDriver=new ActionDriver();
	
	public void PSDriverDownload() throws IOException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverDownload");
		aDriver.click(PSDriverDetails.Download, "PSDriverDownloadButton");
		
	}
	
}
