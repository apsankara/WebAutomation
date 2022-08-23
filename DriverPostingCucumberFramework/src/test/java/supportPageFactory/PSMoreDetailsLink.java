package supportPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utilities.WaitHelper;


public class PSMoreDetailsLink {

	WebDriver driver;
	WaitHelper waithelper;

	// PS path value with clicking the more details link
	@CacheLookup
	@FindBy(css="body > div.xrx-fw-tabbed-content > div > div.xrx-fw-tabbed-content__panel.xrx-fw-tabbed-content__panel--open.xrx-fw-tabbed-content__panel--full-width > div > div > div > div:nth-child(3) > div > div:nth-child(2) > div > div.xrx-fw-downloads-panel__details > a")
	WebElement link_PSMoreDetails;

	@FindBy(xpath="//h1[contains(text(),'V3 Xerox Global Print Driver PostScript')]")
	WebElement Validate_PSMoreDestails;

	//Constructor, as every page needs a Web driver to find elements
	public PSMoreDetailsLink(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);	
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this);
		waithelper=new WaitHelper(driver);

	}

	public void ClickPSMoreDetailsLink() {
		waithelper.WaitForElement(link_PSMoreDetails, 50);
		link_PSMoreDetails.click();
	}		

	public void ValidatePSMoreDetails() {
		String val=Validate_PSMoreDestails.getText();
		if(val.contentEquals("V3 Xerox Global Print Driver PostScript"))
		{
			System.out.println("PS More details name is successful" + "Expected : V3 Xerox Global Print Driver PostScript"+"Actual :" +val);
		}
		else {
			System.out.println("PS More details name is not successful" +"Expected : V3 Xerox Global Print Driver PostScript"+"Actual :" +val);	
		}
	}




}