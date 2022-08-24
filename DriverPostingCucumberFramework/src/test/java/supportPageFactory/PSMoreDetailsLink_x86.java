package supportPageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utilities.WaitHelper;


public class PSMoreDetailsLink_x86 {

	WebDriver driver;
	WaitHelper waithelper;

	// PS path value with clicking the more details link
	@FindBy(xpath="//a[contains(@name,'&lid=more-details-156146')]")
	WebElement link_PSMoreDetails_x86;

	@FindBy(xpath="//h1[contains(text(),'V3 Xerox Global Print Driver PostScript')]")
	WebElement Validate_PSMoreDestails_x86;

	//Constructor, as every page needs a Web driver to find elements
	public PSMoreDetailsLink_x86(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);	
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,20);
		PageFactory.initElements(factory, this);
		waithelper=new WaitHelper(driver);

	}

	public void ClickPSMoreDetailsLink() {
		waithelper.WaitForElement(link_PSMoreDetails_x86, 50);
		link_PSMoreDetails_x86.click();
	}		

	public void ValidatePSMoreDetails() {
		String val=Validate_PSMoreDestails_x86.getText();
		if(val.contentEquals("V3 Xerox Global Print Driver PostScript"))
		{
			System.out.println("PS More details name is successful" + "Expected : V3 Xerox Global Print Driver PostScript"+"Actual :" +val);
		}
		else {
			System.out.println("PS More details name is not successful" +"Expected : V3 Xerox Global Print Driver PostScript"+"Actual :" +val);	
		}
	}




}