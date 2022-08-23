package stepDefinition;

import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;

import supportPageFactory.ApplyFilters;
import supportPageFactory.GPDLanguage;
import supportPageFactory.GPDPlatform;
import supportPageFactory.GPDTag;
import supportPageFactory.PSMoreDetailsLink;
import supportPageFactory.SupportPage;

public class BaseClass {

	public WebDriver driver;
	public SupportPage cSupportPage;
	public GPDPlatform  cGPDPlatform;
	public GPDLanguage cGPDLanguage;
	public GPDTag cGPDTag;
	public ApplyFilters cApplyFilters;
	public PSMoreDetailsLink cPSMoreDetailsLink;
	public static Logger logger;
	public Properties configprop;
	
}
