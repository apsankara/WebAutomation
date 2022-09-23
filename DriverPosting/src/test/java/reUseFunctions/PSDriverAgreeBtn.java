package reUseFunctions;

import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSDriverDetails;

public class PSDriverAgreeBtn {
	ActionDriver aDriver=new ActionDriver();
	
	public void PSDriverAgree() throws IOException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverAgree");
		//aDriver.MultipleElementSearchClick(PSDriverDetails.Agree,"More details: V3 Xerox Global Print Driver PostScript", "AgreeBtnClick");
		aDriver.click(PSDriverDetails.Agree, "AgreeBtnClick");
	}

}
