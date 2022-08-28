package reUseFunctions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonConfig.StartBrowser;

public class MultipleSearchLink {
	WebDriver driver;
	
	public void MultipleElementSearch(By Locator, String linkname, String eleName) {
	StartBrowser.childTest=StartBrowser.parentTest.createNode("ModelSearchLink");
	List<WebElement>Searchlinks=driver.findElements(Locator);
	//System.out.println("No of Links Found for GPD_ModelSearchlinks: " +ModelSearchlinks.size());
	for(WebElement links :Searchlinks) 
	{
		//System.out.println(modellinks.getText());
		if(links.getAttribute("aria-label").contains(linkname))
		{
			links.click();
			break;
		}
	}
}
	
}
