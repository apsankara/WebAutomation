package webPageObjectRepository;

import org.openqa.selenium.By;

public class PCL6DriverDetails {

	//PCL6 path value with clicking the more details link
	//relative path available in the "MoreDetails" Released Version Size Filename Tags
	public static By MoreDetails=By.xpath("//div[@class='xrx-fw-css-grid-row']//li");
	public static By Agree = By.xpath("(//span[contains(@class,'xrx-fw-terms-conditions__text')][normalize-space()='I agree to the'])[1]");
	public static By Download = By.xpath("//a[@aria-label='Download: V3 Xerox Global Print Driver PCL6']");
	
}
