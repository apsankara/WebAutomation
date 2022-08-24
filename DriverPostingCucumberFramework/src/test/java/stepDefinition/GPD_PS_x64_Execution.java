package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import supportPageFactory.ApplyFilters;
import supportPageFactory.GPDLanguage;
import supportPageFactory.GPDPlatform;
import supportPageFactory.GPDTag;
import supportPageFactory.PSDriverDetails;
import supportPageFactory.PSMoreDetailsLink_x64;


public class GPD_PS_x64_Execution extends BaseClass {

		@When("SelectOS for PS_x64(.*)$")
	public void selectOS_for_ps_x64(String platform)	 {
		logger.info("################# SelectOS #################");
		cGPDPlatform=new GPDPlatform(driver);
		cGPDPlatform.SelectPlatform(platform);
	}

	@When("SelectLanguage for PS_x64 (.*)$")
	public void selectLanguage_for_ps_x64(String language) {
		logger.info("################# SelectLanguage #################");
		cGPDLanguage=new GPDLanguage(driver);
		cGPDLanguage.SelectLanguage(language);
	}

	@When("SelectTag for PS_x64 (.*)$")
	public void selectTag_for_ps_x64(String tag) {
		logger.info("################# SelectTag #################");
		cGPDTag=new GPDTag(driver);
		cGPDTag.SelectTag(tag);
	}

	@And("Click Apply Filters Btn_x64")
	public void click_apply_filters_btn_x64() {
		logger.info("################# Apply Filters #################");
		cApplyFilters=new ApplyFilters(driver);
		cApplyFilters.ApplyFilter();
	}

	@And("Click PS_x64 Driver MoreDetails Link")
	public void click_ps_x64_driver_more_details_link() {
		logger.info("################# PS Driver MoreDetails Link #################");
		cPSMoreDetailsLink_x64=new PSMoreDetailsLink_x64(driver);
		cPSMoreDetailsLink_x64.ClickPSMoreDetailsLink();
		cPSMoreDetailsLink_x64.ValidatePSMoreDetails();
	}

	@When("Get PS_x64 Driver ReleasedDate (.*)$")
	public void get_ps_x64_driver_releaseddate(String released) {
		logger.info("################# Get PS Driver Released date #################");
		cPSDriverDetails=new PSDriverDetails(driver);
		cPSDriverDetails.Get_ReleasedDate(released);
	}
	
	
	@When("Get PS_x64 Driver Version (.*)$")
	public void get_ps_x64_driver_version(String version) {
	    
	}
	
	@When("Get PS_x64 Driver Size (.*)$")
	public void get_ps_x64_driver_size(String size) {
	    
	}
	
	@When("Get PS_x64 Driver Filename (.*)$")
	public void get_ps_x64_driver_filename(String filename) {
	    
	}
	
	@When("Get PS_x64 Driver Tagname (.*)$")
	public void get_ps_x64_driver_tagname(String tagname) {
	    
	}

	

}
