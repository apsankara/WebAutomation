package supportPageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

import utilities.WaitHelper;

public class GPDTag {
	
	WebDriver driver;
	WaitHelper waithelper;
	//attributeIdtag drop down verification
			public static By Tag=By.xpath("/html/body/div[4]/div/div[2]/div/div/form/div/div[3]/select");
	
			@FindBy(xpath="/html/body/div[4]/div/div[2]/div/div/form/div/div[3]/select")
			WebElement select_tag;

			public GPDTag (WebDriver driver){
				this.driver=driver;	
				AjaxElementLocatorFactory factory= new AjaxElementLocatorFactory(driver,30);
				PageFactory.initElements(factory, this);
				waithelper=new WaitHelper(driver);
			}
			
			public void SelectTag(String tag) {
				Select tag1=new Select(select_tag);
				tag1.selectByVisibleText(tag);
			}

}
