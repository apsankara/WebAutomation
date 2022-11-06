package reUseFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
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


public class PS_x64_Language_Link_Verification {
	WebDriver driver;
	XeroxHomePage aHomePage;
	ActionDriver aDriver;
	ApplyFiltersBtn aApplyFilters;
	PSFilename_x64 aFilename_x64;
	DriverVersion aVersion;
	DriverReleasedDate aReleasedDate;
	PSSize_x64 aSize_x64;
	PSTag aTag;
	PSDriverMoreDetailsLink aPSDriverMoreDetails;
	PSDriverAgreeBtn aPSDriverAgree;
	PS_x64_DriverDownloadBtn aPSDriverDownload;
	XeroxModel aXeroxModel;
	XeroxModelSearchLink aXeroxModelSearchLink;
	SinglePlatformSelection aSinglePlatformSelect;


	//Constructor
	public  PS_x64_Language_Link_Verification() {
		driver=StartBrowser.driver;
		aDriver=new ActionDriver();
		aApplyFilters=new ApplyFiltersBtn();
		aFilename_x64 =new PSFilename_x64();
		aVersion=new DriverVersion();
		aReleasedDate=new DriverReleasedDate();
		aSize_x64=new PSSize_x64();
		aTag=new PSTag();
		aPSDriverMoreDetails=new PSDriverMoreDetailsLink();
		aPSDriverAgree=new PSDriverAgreeBtn();
		aPSDriverDownload=new PS_x64_DriverDownloadBtn();
		aHomePage=new XeroxHomePage();
		aXeroxModel=new XeroxModel();
		aXeroxModelSearchLink=new XeroxModelSearchLink();
		aSinglePlatformSelect=new SinglePlatformSelection();

	}	

	//support.xerox.com Home Page function
	@Test(priority=1)
	public void HomePage() throws IOException  {
		aHomePage.XeroxSupportPage();
	}

	//Model Search Link in the support page
	@Test(priority=2,dependsOnMethods="HomePage",alwaysRun=false)
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
	public void LanguageSelection() throws IOException {	
		try{		
			//Create an object of File class to open xls file
			File file =    new File("TestData/TestData.xls");

			//Create an object of FileInputStream class to read excel file
			FileInputStream inputStream = new FileInputStream(file);

			//creating workbook instance that refers to .xls file
			@SuppressWarnings("resource")
			HSSFWorkbook workbook=new HSSFWorkbook(inputStream);

			//creating a Sheet object
			HSSFSheet sheet=workbook.getSheet("Language");

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
					WebElement LanSelect=driver.findElement(LanguageSelection.Language);
					StartBrowser.childTest=StartBrowser.parentTest.createNode(Excelvalue +" Language Selection and Verification");
					aDriver.click(LanguageSelection.Language,"LanguageDropDownTag");
					Select LanguageOption=new Select(LanSelect);
					LanguageOption.selectByVisibleText(Excelvalue);       		
					StartBrowser.childTest.pass("Successfully captured the Language from Excel=" +Excelvalue);
					String Languagedropdownbox=LanguageOption.getFirstSelectedOption().getText();
					StartBrowser.childTest.pass("Successfully captured the OS form WebPage=" +Languagedropdownbox);

					if(Excelvalue.equals(Languagedropdownbox))
					{ 
						Assert.assertEquals(Languagedropdownbox, Excelvalue);
						StartBrowser.childTest.pass("Language Selection and Comparison is Successful "+"Actual=" +Excelvalue +" Expected="+Languagedropdownbox); 
					}
					else 
					{
						StartBrowser.childTest.fail("Language Selection and Comparison is not Successful "+"Actual=" +Excelvalue +" Expected="+Languagedropdownbox);										
						TakesScreenshot ts=((TakesScreenshot)driver); 
						File src=ts.getScreenshotAs(OutputType.FILE);
						File location=new File(".\\ScreenShots\\Platform.png");					
						org.apache.commons.io.FileUtils.copyFile(src, location);
					}  

					//Single OS selection
					StartBrowser.childTest=StartBrowser.parentTest.createNode("PlatformSelections");
					WebElement OSSelect=driver.findElement(PlatformSelection.OS);
					aDriver.click(PlatformSelection.OS,"PlatformDropDownTag");
					Select OSOption=new Select(OSSelect);
					OSOption.selectByVisibleText("Windows 11");
					String val=OSOption.getFirstSelectedOption().getText();
					if(val.equals("Windows 11"))
					{ 
						Assert.assertEquals(val, "Windows 11");
						StartBrowser.childTest.pass("OS Selection and Comparison is Successful "+"Actual=" +val +" Expected=Windows 11"); 
					}
					else 
					{
						StartBrowser.childTest.fail("OS Selection and Comparison is not Successful "+"Actual=" +val +" Expected=Windows 11");

					}  
					//Tag Selection 
					StartBrowser.childTest=StartBrowser.parentTest.createNode("Tag Selection");
					WebElement tagSelect=driver.findElement(TagSelection.Tag);		
					aDriver.click(TagSelection.Tag,"TagDropDownTag");
					Select tag=new Select(tagSelect);
					//tag.selectByVisibleText("GPD");
					//tag.selectByValue("GPD");
					tag.selectByIndex(4);
					String tagdropdownbox=tag.getFirstSelectedOption().getText();       		

					if(tagdropdownbox.equals("PostScript"))
					{ 
						Assert.assertEquals(tagdropdownbox, "PostScript");
						StartBrowser.childTest.pass("Tag Selection and Comparison is Successful "+"Actual=" +tagdropdownbox +" Expected=PostScript"); 
					}
					else 
					{
						StartBrowser.childTest.fail("Tag Selection and Comparison is not Successful "+"Actual=" +tagdropdownbox +" Expected=PostScript");

					}   
					
					
					//Apply Filters button
					aApplyFilters.Filters();

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

					StartBrowser.childTest=StartBrowser.parentTest.createNode("Back to Select Another for OS-x64bit,Language and Tag");
					StartBrowser.childTest.pass("Selection of another Language_Windows_x64_GPD");
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

