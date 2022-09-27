package reUseFunctions;

import java.awt.AWTException;
import java.io.IOException;


import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSDriverDetails;

public class PS_x86_DriverDownloadBtn {
	ActionDriver aDriver=new ActionDriver();
	
	public void PSDriverDownload() throws IOException, InterruptedException, AWTException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverDownload");
			aDriver.isFileDownloaded("C:/Users/labadmin/Downloads", "UNIV_5.887.3.0_PS_x86.zip");
			aDriver.click(PSDriverDetails.Download, "PSDriverDownloadButton");
			aDriver.DownlodWaitTime("C:/Users/labadmin/Downloads/UNIV_5.887.3.0_PS_x86.zip");	
			aDriver.isFileNameCheck("C:/Users/labadmin/Downloads", "UNIV_5.887.3.0_PS_x86.zip", "CheckDownloadedFileAvailable");
		
	}
	
}	
