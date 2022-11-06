package reUseFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PlatformSelection;

public class SinglePlatformSelection {
ActionDriver aDriver=new ActionDriver();
	
	public void Platform() throws IOException {
	//Create an object of File class to open xlsx file
    File file =    new File("TestData/TestData.xls");
    
    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);
    
    //Creating workbook instance that refers to .xls file
    @SuppressWarnings("resource")
	HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
    
    //Creating a Sheet object using the sheet Name
    HSSFSheet sheet=workbook.getSheet("Download_x64");
    
    //Create a row object to retrieve row at index 1
    HSSFRow row=sheet.getRow(0);
    
    //Create a cell object to retreive cell at index 1
    HSSFCell cell=row.getCell(0);
    
    //Get the address in a variable
    String address= cell.getStringCellValue();
      
    StartBrowser.childTest=StartBrowser.parentTest.createNode("OS Selections for language link Verification");
    aDriver.click(PlatformSelection.OS,"PlatformDropDownTag");
	Select OSOption=new Select(PlatformSelection.select_OS);
	OSOption.selectByVisibleText(address);       		
	StartBrowser.childTest.pass("Successfully captured the OS from Excel=" +address);
	String osdropdownbox=OSOption.getFirstSelectedOption().getText();
	StartBrowser.childTest.pass("Successfully captured the OS form WebPage=" +osdropdownbox);

	if(address.equals(osdropdownbox))
	{ 
		Assert.assertEquals(osdropdownbox, address);
		StartBrowser.childTest.pass("OS Selection and Comparison is Successful "+"Actual=" +address +" Expected="+osdropdownbox); 
	}
	else 
	{
		StartBrowser.childTest.fail("OS Selection and Comparison is not Successful "+"Actual=" +address +" Expected="+osdropdownbox);

	}  

       
}
}
