package supportPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utilities.WaitHelper;

public class PSDriverDetails {

	WebDriver driver;
	WaitHelper waithelper;
	// PS path value with clicking the more details link
	public static By MoreDetails = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[3]/a");
	
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/div/ul/li[1]")
	WebElement Released;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/div/ul/li[2]")
	WebElement Version;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/div/ul/li[3]")
	WebElement Size;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/div/ul/li[4]")
	WebElement Filename;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/div/ul/li[5]")
	WebElement Tags;
	
	@FindBy(id="xrx-fw-terms-conditions__checkbox--155711")
	WebElement Ageree;
	
	@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/div/div[3]/div/div/a")
	WebElement Download;

	//Constructor, as every page needs a Web driver to find elements
	public PSDriverDetails(WebDriver driver){
		this.driver=driver;
		//PageFactory.initElements(driver, this);	
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,50);
		PageFactory.initElements(factory, this);
		waithelper=new WaitHelper(driver);
	}

	public void Get_ReleasedDate(String releasedate) {
		waithelper.WaitForElement(Released, 20);
		String val=Released.getText();
		if(val.contentEquals(releasedate))
		{
			System.out.println("Released date is successful validation" + "Expected : " + releasedate +"Actual :" +val);
		}
		else {
			System.out.println("Released date is not successful validation" + "Expected : " + releasedate +"Actual :" +val);	
		}
	}		
	
	
	
	
	
}
