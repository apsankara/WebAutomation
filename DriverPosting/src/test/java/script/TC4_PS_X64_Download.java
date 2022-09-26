package script;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PS_x64_DriverDownloadFun;


public class TC4_PS_X64_Download extends StartBrowser {
  @Test
  public void PSDriver_X64_PlatformDownload() throws Exception {
	  PS_x64_DriverDownloadFun PSExe=new PS_x64_DriverDownloadFun();
	  PSExe.HomePage();
	  PSExe.TypeXeroxModel();
	  PSExe.ModelSearchLink();
	  PSExe.PlatformSelection();
	
}
}
