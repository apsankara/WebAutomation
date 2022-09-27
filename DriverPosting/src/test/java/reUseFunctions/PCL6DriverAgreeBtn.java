package reUseFunctions;

import java.io.IOException;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PCL6DriverDetails;

public class PCL6DriverAgreeBtn {
	ActionDriver aDriver=new ActionDriver();
	
	public void PCL6DriverAgree() throws IOException {
		StartBrowser.childTest=StartBrowser.parentTest.createNode("GPDPSDriverAgree");
		//aDriver.MultipleElementSearchClick(PSDriverDetails.Agree,"More details: V3 Xerox Global Print Driver PostScript", "AgreeBtnClick");
		aDriver.click(PCL6DriverDetails.PDLAgree, "PCLAgreeBtnClick");
	}

}
