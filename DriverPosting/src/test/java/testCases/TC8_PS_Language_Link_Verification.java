package testCases;

import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import reUseFunctions.PS_x64_Language_Link_Verification;

public class TC8_PS_Language_Link_Verification extends StartBrowser {

	@Test
	public void PS_Language_Link_Verification() throws Exception {
		PS_x64_Language_Link_Verification PSExe=new PS_x64_Language_Link_Verification();
		  PSExe.HomePage();
		  PSExe.TypeXeroxModel();
		  PSExe.ModelSearchLink();
		  PSExe.LanguageSelection();
		
	}
}
