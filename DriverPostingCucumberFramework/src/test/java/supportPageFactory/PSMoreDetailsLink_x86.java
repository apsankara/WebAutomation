package supportPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
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
		// PS path value with clicking the more details link
		//@FindBy(xpath="//div[@class='xrx-fw-css-grid-row']//a")
		//List<WebElement> link_PSMoreDetails_x86;		
		//@FindBy(xpath="(//li[contains(@class,'xrx-fw-downloads-panel__stat')])")
		//List<WebElement> PSx86bitfilename;
		
	@FindBy(xpath="//h1[normalize-space()='V3 Xerox Global Print Driver PostScript']")
	WebElement Validate_PSMoreDestails_x86;
	//h1[contains(text(),'V3 Xerox Global Print Driver PostScript')]
	
	//Constructor, as every page needs a Web driver to find elements
	public PSMoreDetailsLink_x86(WebDriver driver){
	this.driver=driver;
		//PageFactory.initElements(driver, this);	
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,50);
		PageFactory.initElements(factory, this);
		waithelper=new WaitHelper(driver);
	}

	public void ClickPSMoreDetailsLink() {
		try {
			List<WebElement> PSx86bitfilename=driver.findElements(By.xpath("(//li[contains(@class,'xrx-fw-downloads-panel__stat')])"));
			//System.out.println("No of Links Found for PdlSearchlinks: " +PSx86bitfilename.size());
			
			List<WebElement>link_PSMoreDetails_x86=driver.findElements(By.xpath("//div[contains(@class,'xrx-fw-css-grid-container')]//a"));	
			//div[@class='xrx-fw-css-grid-row']//a
			//System.out.println(link_PSMoreDetails_x86.size());
			
					waithelper.WaitForElement(link_PSMoreDetails_x86, 50);	
					for (WebElement filename:PSx86bitfilename) 
						
					{			//System.out.println(filename.getText());		
						if(filename.getText().contains("Filename: UNIV_5.887.3.1_PS_x86.zip"))				
								{						
							for(WebElement Pslinks :link_PSMoreDetails_x86) 
							{					//System.out.println(Pslinks.getAccessibleName());	
								if((Pslinks.getAccessibleName().contains("More details: V3 Xerox Global Print Driver PostScript")))
								 {			
									Pslinks.click();
									break;
								 }
							} break;
								}
					}				
			}catch(StaleElementReferenceException ex){
				
			}
	}
	
	public void ValidatePSMoreDetails() {
		String val=Validate_PSMoreDestails_x86.getText();
		if(val.contentEquals("V3 Xerox Global Print Driver PostScript"))
		{
			System.out.println("PS More details name is successful " + "Expected=V3 Xerox Global Print Driver PostScript "+"Actual=" +val);
		}
		else {
			System.out.println("PS More details name is not successful " +"Expected=V3 Xerox Global Print Driver PostScript "+"Actual=" +val);	
		}
	}
}