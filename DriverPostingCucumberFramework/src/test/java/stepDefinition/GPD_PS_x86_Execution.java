package stepDefinition;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import supportPageFactory.ApplyFilters;
import supportPageFactory.GPDLanguage;
import supportPageFactory.GPDPlatform;
import supportPageFactory.GPDTag;
import supportPageFactory.PSDriverDetails;
import supportPageFactory.PSMoreDetailsLink_x64;
import supportPageFactory.PSMoreDetailsLink_x86;
import supportPageFactory.SupportPage;

public class GPD_PS_x86_Execution extends BaseClass {
	public WebDriver driver;
	public static Logger logger;
	public Properties configprop;
	
	@Before
	public void setup() throws IOException {

		//Reading Properties
		configprop=new Properties();
		FileInputStream configpropfile=new FileInputStream("config.properties");
		configprop.load(configpropfile);

		logger=Logger.getLogger("Driver Posting");//Added Logger
		PropertyConfigurator.configure("Log4j.properties");//Added Logger

		String br=configprop.getProperty("browser");

		if(br.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			//String ProjectPath="C:\\SeleniumSetup\\chromedriver_win32\\chromedriver.exe";		
			//System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");		
			driver = new ChromeDriver();		
			driver.manage().window().maximize();	
			logger.info("################# Open Chrome Browser #################");
		}
		else if(br.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
			driver.manage().window().maximize();
			logger.info("################# Open Firefox Browser #################");
		}
		else if(br.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();		
			driver.manage().window().maximize();
			logger.info("################# Open Edge Browser #################");
		}
	}

	
	@Given("User open URL {string}")
	public void user_open_url(String Url) {
		logger.info("################# Open URL #################");
		driver.get(Url);
	}

	@Then("Validate the support page displayed")
	public void validate_the_support_page_displayed() {
		String supportpagetitle=driver.getTitle();
		if(supportpagetitle.equalsIgnoreCase("Product Support and Drivers – Xerox"))
		{
			logger.info("################# Validate the support page directly #################");
		}
		else {
			logger.info("################# Validate the support page with refresh #################");
			driver.navigate().refresh();
		}
	}

	@When("Type Driver {string}")
	public void type_driver_model(String model) {
		logger.info("################# Type Driver Model #################");
		cSupportPage=new SupportPage(driver);
		cSupportPage.typeModel(model);
	}

	@And("Click on Search button")
	public void click_on_search_button() {
		logger.info("################# Click on Search button #################");
		cSupportPage.BtnSearch();
	}

	@And("Clcik on Model Search Link")
	public void clcik_on_model_search_link() {	
		String linkpresent=driver.getPageSource();	
		if(linkpresent.contains("Drivers & Downloads")) 
		{		
			cSupportPage.ModelSearchLink();
			logger.info("################# Clciked on Model Search Link without refresh #################");
		}
		else
		{
			driver.navigate().refresh();
			cSupportPage.ModelSearchLink();
			logger.info("################# Clciked on Model Search Link with refresh #################");
		}					
	}		

	@Then("Validate the Model LinkPage")
	public void validate_the_model_link() {
		logger.info("################# Validate the Model LinkPage #################");
		cSupportPage.ValidateGPDPage();
	}

	@When("SelectOS for PS_x86(.*)$")
	public void selectOS_for_ps_x86(String platform)	 {
		logger.info("################# SelectOS #################");
		cGPDPlatform=new GPDPlatform(driver);
		cGPDPlatform.SelectPlatform(platform);
	}
	
	@When("SelectOS for PS_x64(.*)$")
	public void selectOS_for_ps_x64(String platform)	 {
		logger.info("################# SelectOS #################");
		cGPDPlatform=new GPDPlatform(driver);
		cGPDPlatform.SelectPlatform(platform);
	}
	
	@When("SelectLanguage for PS_x86 (.*)$")
	public void selectLanguage_for_ps_x86(String language) {
		logger.info("################# SelectLanguage #################");
		cGPDLanguage=new GPDLanguage(driver);
		cGPDLanguage.SelectLanguage(language);
	}
	
	@When("SelectLanguage for PS_x64 (.*)$")
	public void selectLanguage_for_ps_x64(String language) {
		logger.info("################# SelectLanguage #################");
		cGPDLanguage=new GPDLanguage(driver);
		cGPDLanguage.SelectLanguage(language);
	}
	
	

	@When("SelectTag for PS_x86 (.*)$")
	public void selectTag_for_ps_x86(String tag) {
		logger.info("################# SelectTag #################");
		cGPDTag=new GPDTag(driver);
		cGPDTag.SelectTag(tag);
	}
	
	@When("SelectTag for PS_x64 (.*)$")
	public void selectTag_for_ps_x64(String tag) {
		logger.info("################# SelectTag #################");
		cGPDTag=new GPDTag(driver);
		cGPDTag.SelectTag(tag);
	}


	@And("Click Apply Filters Btn_x86")
	public void click_apply_filters_btn_x86() {
		logger.info("################# Apply Filters #################");
		cApplyFilters=new ApplyFilters(driver);
		cApplyFilters.ApplyFilter();
	}
	@And("Click Apply Filters Btn_x64")
	public void click_apply_filters_btn_x64() {
		logger.info("################# Apply Filters #################");
		cApplyFilters=new ApplyFilters(driver);
		cApplyFilters.ApplyFilter();
	}
	
	
	@And("Click PS_x86 Driver MoreDetails Link")
	public void click_ps_x86_driver_more_details_link() {		
		logger.info("################# PS Driver MoreDetails Link #################" );
		cPSMoreDetailsLink_x86=new PSMoreDetailsLink_x86(driver);
		cPSMoreDetailsLink_x86.ClickPSMoreDetailsLink();
		cPSMoreDetailsLink_x86.ValidatePSMoreDetails();
	}
	
	@And("Click PS_x64 Driver MoreDetails Link")
	public void click_ps_x64_driver_more_details_link() {
		logger.info("################# PS_x64bit Driver MoreDetails Link #################");
		cPSMoreDetailsLink_x64=new PSMoreDetailsLink_x64(driver);
		cPSMoreDetailsLink_x64.ClickPSMoreDetailsLink();
		cPSMoreDetailsLink_x64.ValidatePSMoreDetails();
	}

	
	@When("Get PS_x86 Driver ReleasedDate (.*)$")
	public void get_ps_x86_driver_releaseddate(String released) {
		logger.info("################# Get PS_x86 Driver ReleasedDate #################");
		cPSDriverDetails=new PSDriverDetails(driver);
		cPSDriverDetails.Get_ReleasedDate(released);
	}

	@When("Get PS_x64 Driver ReleasedDate (.*)$")
	public void get_ps_x64_driver_releaseddate(String released) {
		logger.info("################# Get PS_x64 Driver ReleasedDate #################");
		cPSDriverDetails=new PSDriverDetails(driver);
		cPSDriverDetails.Get_ReleasedDate(released);
	}
	
	@When("Get PS_x86 Driver Version (.*)$")
	public void get_ps_x86_driver_version(String version) {
		logger.info("################# Get PS_x86 Driver Version #################");
		cPSDriverDetails.Get_Version(version);
	}

	@When("Get PS_x64 Driver Version (.*)$")
	public void get_ps_x64_driver_version(String version) {
		logger.info("################# Get PS_x64 Driver Version #################");
		cPSDriverDetails.Get_Version(version);
	}
	
	@When("Get PS_x86 Driver Size (.*)$")
	public void get_ps_x86_driver_size(String size) {
		logger.info("################# Get PS_x86 Driver Size #################");
		cPSDriverDetails.Get_Size(size);
	}

	@When("Get PS_x64 Driver Size (.*)$")
	public void get_ps_x64_driver_size(String size) {
		logger.info("################# Get PS_x64 Driver Size #################");
		cPSDriverDetails.Get_Size(size);
	}
	
	@When("Get PS_x86 Driver Filename (.*)$")
	public void get_ps_x86_driver_filename(String filename) {
		logger.info("################# PS_x86 Driver Filename #################");
		cPSDriverDetails.Get_Filename(filename);
	}
	@When("Get PS_x64 Driver Filename (.*)$")
	public void get_ps_x64_driver_filename(String filename) {
		logger.info("################# Get PS_x64 Driver Filename #################");
		cPSDriverDetails.Get_Filename(filename);
	}
			
	@When("Get PS_x86 Driver Tagname (.*)$")
	public void get_ps_x86_driver_tagname(String tagname) {
		logger.info("################# Get PS_x86 Driver Tagname #################");
		cPSDriverDetails.Get_Tag(tagname);
	}

	@When("Get PS_x64 Driver Tagname (.*)$")
	public void get_ps_x64_driver_tagname(String tagname) {
		logger.info("################# Get PS_x64 Driver Tagname #################");
		cPSDriverDetails.Get_Tag(tagname);
	}
	
	@When("Click CheckAgreeBtn")
	public void click_checkAgreeBtn() {
		logger.info("#################  Click CheckAgreeBtn #################");
		cPSDriverDetails.Get_Agree();
	}
	
	@When("Clcik DownloadBtn")
	public void clcik_downloadBtn() {
		logger.info("################# Clcik DownloadBtn #################");
		cPSDriverDetails.Get_Download();
	}
	
	@After
	public void closebrowser() 
	{
		logger.info("################# Close Browser #################");
		driver.quit();
	}
	



}
