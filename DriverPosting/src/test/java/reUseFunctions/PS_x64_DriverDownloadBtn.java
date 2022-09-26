package reUseFunctions;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;


import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSDriverDetails;

public class PS_x64_DriverDownloadBtn {
	ActionDriver aDriver=new ActionDriver();
	
	public void PSDriverDownload() throws IOException, InterruptedException, AWTException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverDownload");
			aDriver.isFileDownloaded("C:/Users/labadmin/Downloads", "UNIV_5.887.3.0_PS_x64.zip");
			aDriver.click(PSDriverDetails.Download, "PSDriverDownloadButton");
			aDriver.DownlodWaitTime("C:/Users/labadmin/Downloads/UNIV_5.887.3.0_PS_x64.zip");
			
			if(isFileExists("C:/Users/labadmin/Downloads/UNIV_5.887.3.0_PS_x64.zip")) {
				StartBrowser.childTest.pass("Downloaded File Exits-UNIV_5.887.3.0_PS_x64.zip");
			}else {
				
				StartBrowser.childTest.fail("Downloaded File not Exits");
			}				
		
	}
	
	static boolean isFileExists(String Path) {
		File dir = new File(Path);
		if(dir.exists()) {
			return true;
		}
		else {
		return false;
		}
	}
	
}	
