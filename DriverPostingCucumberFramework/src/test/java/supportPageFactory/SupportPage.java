package supportPageFactory;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import utilities.WaitHelper;

public class SupportPage {

	public WebDriver driver;
	WaitHelper waithelper;

	//Constructor, as every page needs a Web driver to find elements
	public SupportPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,30);
		PageFactory.initElements(factory, this);
		waithelper=new WaitHelper(driver);
	}

	public static By ModelSearchBox=By.xpath("//*[@id=\"searchbox\"]/div[3]/div[2]/div/div[1]/input");
	public static By ModelSearchBtn=By.className("coveo-search-button-svg");


	@FindBy(xpath="//*[@id=\"searchbox\"]/div[3]/div[2]/div/div[1]/input")
	WebElement txt_ModelSearch;

	@FindBy(className="coveo-search-button-svg")
	WebElement btn_ModelSearch;

	@FindBy(xpath="//a[contains(text(),'Drivers & Downloads - Xerox Global Print Driver')]")
	WebElement model_SearchLink;
	
	@FindBy(xpath="//div[@class='coveo-result-list-container coveo-list-layout-container']//a")
	List<WebElement> ModelSearchlinks;
	

	@FindBy(xpath="//h2[contains(text(),'Xerox Global Print Driver')]")
	WebElement validate_modelSearch;

	public void typeModel(String model) {
		waithelper.WaitForElement(txt_ModelSearch, 50);
		txt_ModelSearch.clear();
		txt_ModelSearch.sendKeys(model);
	}

	public void BtnSearch() {
		waithelper.WaitForElement(btn_ModelSearch, 50);
		btn_ModelSearch.click();
	}

	public void ModelSearchLink() {
		try {
		//List<WebElement>ModelSearchlinks=driver.findElements(By.xpath("//div[@class='coveo-result-list-container coveo-list-layout-container']//a"));
		waithelper.WaitForElement(ModelSearchlinks, 50);
		//System.out.println("No of Links Found for GPD_ModelSearchlinks: " +ModelSearchlinks.size());
		for(WebElement modellinks :ModelSearchlinks) 
		{
			//System.out.println(modellinks.getText());
			if(modellinks.getText().contains("Drivers & Downloads - Xerox Global Print Driver"))
			{
				modellinks.click();
				break;
			}
		}
		}catch(Exception ex) {
			
		}
	}

	public void ValidateGPDPage() {
		String val=validate_modelSearch.getText();
		if(val.contains("Xerox Global Print Driver"))
		{
			System.out.println("GPD Page shown successfully " + "Expected=Xerox Global Print Driver "+"Actual=" +val);
		}
		else {
			System.out.println("GPD Page is not shown successfully " +"Expected=Xerox Global Print Driver "+"Actual=" +val);
			driver.navigate().refresh();
		}
	}

}
