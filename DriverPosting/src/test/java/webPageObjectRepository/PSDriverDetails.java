package webPageObjectRepository;

import org.openqa.selenium.By;

public class PSDriverDetails {

	// PS path value with clicking the more details link
	//absolute path
	//public static By MoreDetails = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[2]/div/div[2]/div/div[3]/a");
	
	//relative path
	public static By MoreDetails=By.xpath("//a[contains(text(),'Drivers & Downloads - Xerox Global Print Driver')]");
	
	public static By Released = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/ul/li[1]");
	public static By Version = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/ul/li[2]");
	public static By Size = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/ul/li[3]");
	public static By Filename = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/ul/li[4]");
	public static By Tags = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/ul/li[5]");
	public static By Agree = By.id("xrx-fw-terms-conditions__checkbox--155711");
	public static By Download = By.xpath("/html/body/div[4]/div/div[2]/div/div/div/div[3]/div/div/a");

	
	  //PS path value without clicking the more details link
	  
		/*
		 * public static By Released=By.xpath(
		 * "/html/body/div[4]/div/div[2]/div/div/div/div[1]/div/div[2]/div/ul/li[1]");
		 * public static By Version=By.xpath(
		 * "/html/body/div[4]/div/div[2]/div/div/div/div[1]/div/div[2]/div/ul/li[2]");
		 * public static By Size=By.xpath(
		 * "/html/body/div[4]/div/div[2]/div/div/div/div[1]/div/div[2]/div/ul/li[3]");
		 * public static By Filename=By.xpath(
		 * "/html/body/div[4]/div/div[2]/div/div/div/div[1]/div/div[2]/div/ul/li[4]");
		 * public static By Tags=By.xpath(
		 * "/html/body/div[4]/div/div[2]/div/div/div/div[1]/div/div[2]/div/ul/li[5]");
		 */
	 

}
