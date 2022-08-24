package stepDefinition;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import supportPageFactory.SupportPage;

public class GPDSupportPage extends BaseClass{

	
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
			//WebDriverManager.chromedriver().setup();
			//String ProjectPath="C:\\SeleniumSetup\\chromedriver_win32\\chromedriver.exe";		
			System.setProperty("webdriver.chrome.driver", "C:/SeleniumSetup/chromedriver_win32/chromedriver.exe");		
			driver = new ChromeDriver();		
			driver.manage().window().maximize();	
			logger.info("################# Open Chrome Browser #################");
		}
		else if(br.equals("firefox")) {
			//WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();		
			driver.manage().window().maximize();
			logger.info("################# Open Firefox Browser #################");
		}
		else if(br.equals("edge")) {
			//WebDriverManager.edgedriver().setup();
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
	
	@After
	public void closebrowser() 
	{
		logger.info("################# Close Browser #################");
		driver.quit();
	}
	
}
