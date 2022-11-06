package webPageObjectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlatformSelection {
		
	//platform drop down verification
	public static By OS=By.xpath("//select[@name='platform']");
	
	@FindBy(xpath="//select[@name='platform']")
	public static WebElement select_OS;
			
}
