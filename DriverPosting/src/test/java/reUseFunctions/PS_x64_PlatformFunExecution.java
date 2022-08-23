package reUseFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.GPDLanguage;
import webPageObjectRepository.GPDPlatform;
import webPageObjectRepository.GPDTag;


public class PS_x64_PlatformFunExecution {
	WebDriver driver;
	XeroxHomePage aHomePage;
	ActionDriver aDriver;
	ApplyFiltersBtn aApplyFilters;
	PSFilename_x64 aFilename_x64;
	PSVersion aVersion;
	PSReleasedDate aReleasedDate;
	PSSize_x64 aSize_x64;
	PSTag aTag;
	PSDriverMoreDetailsLink aPSDriverMoreDetails;
	PSDriverAgreeBtn aPSDriverAgree;
	PSDriverDownloadBtn aPSDriverDownload;


	//Constructor
	public  PS_x64_PlatformFunExecution() {
		driver=StartBrowser.driver;
		aDriver=new ActionDriver();
		aApplyFilters=new ApplyFiltersBtn();
		aFilename_x64 =new PSFilename_x64();
		aVersion=new PSVersion();
		aReleasedDate=new PSReleasedDate();
		aSize_x64=new PSSize_x64();
		aTag=new PSTag();
		aPSDriverMoreDetails=new PSDriverMoreDetailsLink();
		aPSDriverAgree=new PSDriverAgreeBtn();
		aPSDriverDownload=new PSDriverDownloadBtn();
		aHomePage=new XeroxHomePage();

	}	

	//support.xerox.com Home Page function
	@Test(priority=1)
	public void HomePage() throws IOException  {
		aHomePage.HomePage();
	}

	//Platform, Language, Tag Selection and apply filters
	@Test(priority=2)
	public void PlatformSelection() throws IOException {	
		try{		
			//Create an object of File class to open xls file
			File file =    new File("TestData/TestData.xls");

			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			//creating workbook instance that refers to .xls file
			@SuppressWarnings("resource")
			HSSFWorkbook workbook=new HSSFWorkbook(inputStream);

			//creating a Sheet object
			HSSFSheet sheet=workbook.getSheet("Platform_x64");

			//get all rows in the sheet
			int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();

			//iterate over all the row to print the data present in each cell.
			for(int i=0;i<=rowCount;i++){

				//get cell count in a row
				int cellcount=sheet.getRow(i).getLastCellNum();

				//iterate over each cell to print its value
				// System.out.println("Row "+ i+" data is :");

				for(int j=0;j<cellcount;j++){

					//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
					String Excelvalue=sheet.getRow(i).getCell(j).getStringCellValue();
					WebElement OSSelect=driver.findElement(GPDPlatform.OS);
					aDriver.click(GPDPlatform.OS,"PlatformDropDownTag");
					Select OSOption=new Select(OSSelect);
					OSOption.selectByVisibleText(Excelvalue);       		
					StartBrowser.childTest=StartBrowser.parentTest.createNode("PlatformSelectionsAndComparisonwithEnglish");
					StartBrowser.childTest.pass("Successfully captured the OS from Excel :" +Excelvalue);
					String osdropdownbox=OSOption.getFirstSelectedOption().getText();
					StartBrowser.childTest.pass("Successfully captured the OS form WebPage :" +osdropdownbox);

					if(Excelvalue.equals(osdropdownbox))
					{ 
						Assert.assertEquals(osdropdownbox, Excelvalue);
						StartBrowser.childTest.pass("OS Selection and Comparison is Successful "+"Actual- " +Excelvalue +" Expected-"+osdropdownbox); 
					}
					else 
					{
						StartBrowser.childTest.fail("OS Selection and Comparison is not Successful "+"Actual- " +Excelvalue +" Expected-"+osdropdownbox);

					}  

					//Language Selection        		
					WebElement languageSelect=driver.findElement(GPDLanguage.Language);		
					aDriver.click(GPDLanguage.Language,"LanguageDropDownTag");
					Select language=new Select(languageSelect);
					language.selectByVisibleText("English (Global)");
					String languagedropdownbox=language.getFirstSelectedOption().getText();       		

					if(languagedropdownbox.equals("English (Global)"))
					{ 
						Assert.assertEquals(languagedropdownbox, "English (Global)");
						StartBrowser.childTest.pass("Language and Selection Comparison is Successful "+"Actual- " +languagedropdownbox +" Expected-English (Global)"); 
					}
					else 
					{
						StartBrowser.childTest.fail("Language Selection and Comparison is not Successful "+"Actual- " +languagedropdownbox +" Expected-English (Global)");

					}        		

					//Tag Selection 
					WebElement tagSelect=driver.findElement(GPDTag.Tag);		
					aDriver.click(GPDTag.Tag,"TagDropDownTag");
					Select tag=new Select(tagSelect);
					//tag.selectByVisibleText("GPD");
					//tag.selectByValue("GPD");
					tag.selectByIndex(1);
					String tagdropdownbox=tag.getFirstSelectedOption().getText();       		

					if(tagdropdownbox.equals("GPD"))
					{ 
						Assert.assertEquals(tagdropdownbox, "GPD");
						StartBrowser.childTest.pass("Tag Selection and Comparison is Successful "+"Actual- " +tagdropdownbox +" Expected-GPD"); 
					}
					else 
					{
						StartBrowser.childTest.fail("Tag Selection and Comparison is not Successful "+"Actual- " +tagdropdownbox +" Expected-GPD");

					}      

					//Apply Filters button
					aApplyFilters.Filters();

					//PSDriver more details link click  
					aPSDriverMoreDetails.PSMoreDetails();

					//PS Driver version Details and Comparison       		        		
					aVersion.Version();   		

					//PS driver FileName and comparison
					aFilename_x64.FileName();

					//PS driver ReleasedDate and comparison   
					aReleasedDate.ReleasedDate();

					//PS driver Size and comparison  
					aSize_x64.FileSize();

					//PS Tag Name and comparison   
					aTag.FileTag();

					//PS Driver Agree Button
					//aPSDriverAgree.PSDriverAgree();

					//PS Driver Download Button
					//aPSDriverDownload.PSDriverDownload();

					//Driver navigate to back.
					driver.navigate().back();
					driver.navigate().refresh();
					//java script for scroll up to get the platform tag	  
					JavascriptExecutor js = (JavascriptExecutor)driver; 
					js.executeScript("window.scrollBy(0,-1000)");
					StartBrowser.childTest=StartBrowser.parentTest.createNode("URL Navigated Back to select another OS");


				}            
			}


		}catch(Exception ex)
		{
			StartBrowser.childTest.fail("Selection is not Successful due to incorrect value or something wrong");
			StartBrowser.childTest.info(ex);
			throw ex;
		}   
	}	







}
