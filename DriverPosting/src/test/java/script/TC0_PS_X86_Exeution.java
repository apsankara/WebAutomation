package script;

import java.io.IOException;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PS_x86_PlatformFunExecution;

public class TC0_PS_X86_Exeution extends StartBrowser {
  @Test
  public void PSDriver_X86_PlatformExecution() throws IOException {
	  PS_x86_PlatformFunExecution PSExe=new PS_x86_PlatformFunExecution();
	  PSExe.HomePage();
	  PSExe.PlatformSelection();
  }
}
