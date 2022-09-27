package reUseFunctions;

import java.awt.AWTException;
import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PCL6DriverDetails;

public class PCL6_x86_DriverDownloadBtn {
	ActionDriver aDriver=new ActionDriver();
	
	public void PCL6_x86_DriverDownload() throws IOException, InterruptedException, AWTException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPCL6DriverDownload");			
			aDriver.isFileDownloaded("C:/Users/labadmin/Downloads", "UNIV_5.887.3.0_PCL6_x86.zip");
			aDriver.click(PCL6DriverDetails.Download, "PCL6DriverDownloadButton");
			aDriver.DownlodWaitTime("C:/Users/labadmin/Downloads/UNIV_5.887.3.0_PCL6_x86.zip");	
			aDriver.isFileNameCheck("C:/Users/labadmin/Downloads", "UNIV_5.887.3.0_PCL6_x86.zip", "CheckDownloadedFileAvailable");
		
	}
	
}
