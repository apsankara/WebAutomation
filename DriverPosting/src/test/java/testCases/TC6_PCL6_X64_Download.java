package testCases;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PCL6_x64_DriverDownloadFun;


public class TC6_PCL6_X64_Download extends StartBrowser {
  @Test
  public void PCL6Driver_X64_PlatformDownload() throws Exception {
	  PCL6_x64_DriverDownloadFun PCLExe=new PCL6_x64_DriverDownloadFun();
	  PCLExe.HomePage();
	  PCLExe.TypeXeroxModel();
	  PCLExe.ModelSearchLink();
	  PCLExe.PlatformSelection();
	
}
}
