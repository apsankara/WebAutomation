package reUseFunctions;

import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSDriverDetails;

public class PSDriverAgreeBtn {
	ActionDriver aDriver=new ActionDriver();
	
	public void PSDriverAgree() throws IOException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverAgree");
		aDriver.click(PSDriverDetails.Agree, "PSDriverAgreeCheckbox");
	}

}
