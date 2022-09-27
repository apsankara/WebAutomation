package script;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PCL6_x86_DriverDownloadFun;


public class TC7_PCL6_X86_Download extends StartBrowser {
  @Test
  public void PCL6Driver_X86_PlatformDownload() throws Exception {
	  PCL6_x86_DriverDownloadFun PCLExe=new PCL6_x86_DriverDownloadFun();
	  PCLExe.HomePage();
	  PCLExe.TypeXeroxModel();
	  PCLExe.ModelSearchLink();
	  PCLExe.PlatformSelection();
	
}
}
