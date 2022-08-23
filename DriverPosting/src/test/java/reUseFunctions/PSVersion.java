package reUseFunctions;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import commonConfig.StartBrowser;
import webDriverCmd.ActionDriver;
import webPageObjectRepository.PSDriverDetails;

public class PSVersion {
ActionDriver aDriver=new ActionDriver();
	
	public void Version() throws IOException {
	//Create an object of File class to open xlsx file
    File file =    new File("TestData/TestData.xls");
    
    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);
    
    //Creating workbook instance that refers to .xls file
    @SuppressWarnings("resource")
	HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
    
    //Creating a Sheet object using the sheet Name
    HSSFSheet sheet=workbook.getSheet("PSDriver");
    
    //Create a row object to retrieve row at index 1
    HSSFRow row=sheet.getRow(1);
    
    //Create a cell object to retreive cell at index 1
    HSSFCell cell=row.getCell(1);
    
    //Get the address in a variable
    String address= cell.getStringCellValue();
    
    //Printing the address
    //System.out.println("Address is :"+ address);
    String driverVersion=aDriver.gettext(PSDriverDetails.Version);		
	  if(driverVersion.equals(address))
	  { 
		  StartBrowser.childTest.pass(" Driver Version Comparison is Successful "+"Actual- " +driverVersion +" Expected- " +address); 
	 }
	  else 
	 {
	  StartBrowser.childTest.fail(" Driver Version Comparison is not Successful "+"Actual- " +driverVersion +" Expected- " +address);
	  
	  }	  
    
}
}
