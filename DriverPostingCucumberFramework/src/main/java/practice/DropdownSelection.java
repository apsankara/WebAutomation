package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection {
static WebDriver driver;

WebElement element=driver.findElement(By.id(""));

	public static void dropdownselectionlist(WebElement locator, String list) {
		
		Select drp=new Select(locator);
		
		List<WebElement> element=drp.getOptions();
		for(WebElement options:element) {
			if(options.getText().equals(list)) {
				options.click();
				break;
			}
			
		}
		
		
	}

}

