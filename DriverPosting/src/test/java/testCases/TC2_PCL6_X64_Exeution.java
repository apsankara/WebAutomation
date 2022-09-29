package testCases;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PCL6_x64_PlatformFunExecution;


public class TC2_PCL6_X64_Exeution extends StartBrowser {
  @Test
  public void PCL6Driver_X64_PlatformExecution() throws Exception {
	  PCL6_x64_PlatformFunExecution PCL6Exe=new PCL6_x64_PlatformFunExecution();
	  PCL6Exe.HomePage();
	  PCL6Exe.TypeXeroxModel();
	  PCL6Exe.ModelSearchLink();
	  PCL6Exe.PlatformSelection();
	
}
}
