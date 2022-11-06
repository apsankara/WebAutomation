package testCases;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PS_x64_PlatformFunExecution;
import reUseFunctions.TestCaseIRetryLisener;

public class TC0_PS_X64_Exeution extends StartBrowser {
  @Test(retryAnalyzer=TestCaseIRetryLisener.class)
  public void PSDriver_X64_PlatformExecution() throws Exception {
	  PS_x64_PlatformFunExecution PSExe=new PS_x64_PlatformFunExecution();
	  PSExe.HomePage();
	  PSExe.TypeXeroxModel();
	  PSExe.ModelSearchLink();
	  PSExe.PlatformSelection();
	
}
}
