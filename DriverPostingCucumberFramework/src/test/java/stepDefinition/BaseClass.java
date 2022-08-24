package stepDefinition;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import supportPageFactory.ApplyFilters;
import supportPageFactory.GPDLanguage;
import supportPageFactory.GPDPlatform;
import supportPageFactory.GPDTag;
import supportPageFactory.PSDriverDetails;
import supportPageFactory.PSMoreDetailsLink_x64;
import supportPageFactory.PSMoreDetailsLink_x86;
import supportPageFactory.SupportPage;

public class BaseClass {

	public WebDriver driver;
	public SupportPage cSupportPage;
	public GPDPlatform  cGPDPlatform;
	public GPDLanguage cGPDLanguage;
	public GPDTag cGPDTag;
	public ApplyFilters cApplyFilters;
	public PSMoreDetailsLink_x86 cPSMoreDetailsLink_x86;
	public PSMoreDetailsLink_x64 cPSMoreDetailsLink_x64;
	public PSDriverDetails cPSDriverDetails;
	public static Logger logger;
	public Properties configprop;
	
	
}
