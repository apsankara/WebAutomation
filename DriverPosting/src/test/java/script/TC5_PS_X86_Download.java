package script;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PS_x86_DriverDownloadFun;


public class TC5_PS_X86_Download extends StartBrowser {
  @Test
  public void PSDriver_X86_PlatformDownload() throws Exception {
	  PS_x86_DriverDownloadFun PSExe=new PS_x86_DriverDownloadFun();
	  PSExe.HomePage();
	  PSExe.TypeXeroxModel();
	  PSExe.ModelSearchLink();
	  PSExe.PlatformSelection();
	
}
}
