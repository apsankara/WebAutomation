package supportPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utilities.WaitHelper;


public class PSMoreDetailsLink_x64 {

	WebDriver driver;
	WaitHelper waithelper;

	// PS path value with clicking the more details link
	@FindBy(xpath="//a[@name='&lid=more-details-155711']")
	WebElement link_PSMoreDetails_x64;

	@FindBy(xpath="//h1[contains(text(),'V3 Xerox Global Print Driver PostScript')]")
	WebElement Validate_PSMoreDestails_x64;

	//Constructor, as every page needs a Web driver to find elements
	public PSMoreDetailsLink_x64(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);	
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this);
		waithelper=new WaitHelper(driver);

	}

	public void ClickPSMoreDetailsLink() {
		waithelper.WaitForElement(link_PSMoreDetails_x64, 50);
		link_PSMoreDetails_x64.click();
	}		

	public void ValidatePSMoreDetails() {
		String val=Validate_PSMoreDestails_x64.getText();
		if(val.contentEquals("V3 Xerox Global Print Driver PostScript"))
		{
			System.out.println("PS More details name is successful" + "Expected : V3 Xerox Global Print Driver PostScript"+"Actual :" +val);
		}
		else {
			System.out.println("PS More details name is not successful" +"Expected : V3 Xerox Global Print Driver PostScript"+"Actual :" +val);	
		}
	}




}