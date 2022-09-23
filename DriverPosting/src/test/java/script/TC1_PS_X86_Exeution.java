package script;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PS_x86_PlatformFunExecution;

public class TC1_PS_X86_Exeution extends StartBrowser {
  @Test
  public void PSDriver_X86_PlatformExecution() throws Exception {
	  PS_x86_PlatformFunExecution PSExe=new PS_x86_PlatformFunExecution();
	  PSExe.HomePage();
	  PSExe.TypeXeroxModel();
	  PSExe.ModelSearchLink();
	  PSExe.PlatformSelection();
  }
}
