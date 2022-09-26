package reUseFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.LanguageSelection;
import webPageObjectRepository.PlatformSelection;
import webPageObjectRepository.TagSelection;


public class PS_x86_PlatformFunExecution {
	WebDriver driver;
	XeroxHomePage aHomePage;
	ActionDriver aDriver;
	ApplyFiltersBtn aApplyFilters;
	PSFilename_x86 aFilename_x86;
	DriverVersion aVersion;
	DriverReleasedDate aReleasedDate;
	PSSize_x86 aSize_x86;
	PSTag aTag;
	PSDriverMoreDetailsLink aPSDriverMoreDetails;
	PSDriverAgreeBtn aPSDriverAgree;
	PS_x86_DriverDownloadBtn aPSDriverDownload;
	XeroxModel aXeroxModel;
	XeroxModelSearchLink aXeroxModelSearchLink;


	//Constructor
	public  PS_x86_PlatformFunExecution() {
		driver=StartBrowser.driver;
		aDriver=new ActionDriver();
		aApplyFilters=new ApplyFiltersBtn();
		aFilename_x86 =new PSFilename_x86();
		aVersion=new DriverVersion();
		aReleasedDate=new DriverReleasedDate();
		aSize_x86=new PSSize_x86();
		aTag=new PSTag();
		aPSDriverMoreDetails=new PSDriverMoreDetailsLink();
		aPSDriverAgree=new PSDriverAgreeBtn();
		aPSDriverDownload=new PS_x86_DriverDownloadBtn();
		aHomePage=new XeroxHomePage();
		aXeroxModel=new XeroxModel();
		aXeroxModelSearchLink=new XeroxModelSearchLink();


	}	

	//support.xerox.com Home Page function
		@Test(priority=1)
		public void HomePage() throws IOException  {
			aHomePage.XeroxSupportPage();
		}
		
		//Model Search Link in the support page
		@Test(priority=2)
		public void TypeXeroxModel() throws IOException  {
			aXeroxModel.Model();
		}
		
		//Model entered in the support page
			@Test(priority=3)
			public void ModelSearchLink() throws IOException  {
				aXeroxModelSearchLink.ModelSearchLink();
			}

	//Platform, Language, Tag Selection and apply filters
	@Test(priority=4)
	public void PlatformSelection() throws Exception {	
		try{		
			//Create an object of File class to open xls file
			File file =    new File("TestData/TestData.xls");

			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			//creating workbook instance that refers to .xls file
			@SuppressWarnings("resource")
			HSSFWorkbook workbook=new HSSFWorkbook(inputStream);

			//creating a Sheet object
			HSSFSheet sheet=workbook.getSheet("Platform_x86");

			//get all rows in the sheet
			int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();

			//iterate over all the row to print the data present in each cell.
			for(int i=0;i<=rowCount;i++){

				//get cell count in a row
				int cellcount=sheet.getRow(i).getLastCellNum();

				//iterate over each cell to print its value
				//System.out.println("Row "+ i+" data is :");

				for(int j=0;j<cellcount;j++){

					//System.out.print(sheet.getRow(i).getCell(j).getStringCellValue() +",");
					StartBrowser.childTest=StartBrowser.parentTest.createNode("PlatformSelectionsAndComparisonwithFrench");
					String Excelvalue=sheet.getRow(i).getCell(j).getStringCellValue();
					WebElement OSSelect=driver.findElement(PlatformSelection.OS);
					aDriver.click(PlatformSelection.OS,"PlatformDropDownTag");
					Select OSOption=new Select(OSSelect);
					OSOption.selectByVisibleText(Excelvalue);       		
					
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
					WebElement languageSelect=driver.findElement(LanguageSelection.Language);		
					aDriver.click(LanguageSelection.Language,"LanguageDropDownTag");
					Select language=new Select(languageSelect);
					language.selectByVisibleText("French");
					String languagedropdownbox=language.getFirstSelectedOption().getText();       		

					if(languagedropdownbox.equals("French"))
					{ 
						Assert.assertEquals(languagedropdownbox, "French");
						StartBrowser.childTest.pass("Language and Selection Comparison is Successful "+"Actual- " +languagedropdownbox +" Expected-French"); 
					}
					else 
					{
						StartBrowser.childTest.fail("Language Selection and Comparison is not Successful "+"Actual- " +languagedropdownbox +" Expected-French");

					}        		

					//Tag Selection 
					WebElement tagSelect=driver.findElement(TagSelection.Tag);		
					aDriver.click(TagSelection.Tag,"TagDropDownTag");
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
					//aPSDriverMoreDetails.PSMoreDetails();

					//PS Driver version Details and Comparison       		        		
					aVersion.Version();   		

					//PS driver FileName and comparison
					aFilename_x86.FileName();

					//PS driver ReleasedDate and comparison   
					aReleasedDate.ReleasedDate();

					//PS driver Size and comparison  
					aSize_x86.FileSize();

					//PS Tag Name and comparison   
					aTag.FileTag();

					//PS Driver Agree Button
					//aPSDriverAgree.PSDriverAgree();

					//PS Driver Download Button
					//aPSDriverDownload.PSDriverDownload();

					//Driver navigate to back.
					//driver.navigate().back(); 
					//driver.navigate().refresh();
					//java script for scroll up to get the platform tag	  
					//JavascriptExecutor js = (JavascriptExecutor)driver; 
					//js.executeScript("window.scrollBy(0,-1000)");
					StartBrowser.childTest=StartBrowser.parentTest.createNode("Back to Select Another for OS-x86bit,Language and Tag");
					StartBrowser.childTest.pass("Selection of another OS_x86bit_French_GPD");
				}            
			}


		}catch(Exception ex)
		{
			StartBrowser.childTest.fail("Selection is not Successful due to incorrect value or something went wrong check exception");
			StartBrowser.childTest.info(ex);
			throw ex;
		}   
	}	







}
