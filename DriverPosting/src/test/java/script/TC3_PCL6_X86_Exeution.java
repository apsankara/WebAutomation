package script;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PCL6_x86_PlatformFunExecution;

public class TC3_PCL6_X86_Exeution extends StartBrowser {
  @Test
  public void PCL6Driver_X86_PlatformExecution() throws Exception {
	  PCL6_x86_PlatformFunExecution PCL6Exe=new PCL6_x86_PlatformFunExecution();
	  PCL6Exe.HomePage();
	  PCL6Exe.TypeXeroxModel();
	  PCL6Exe.ModelSearchLink();
	  PCL6Exe.PlatformSelection();
  }
}
