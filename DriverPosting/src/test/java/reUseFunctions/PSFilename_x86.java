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

public class PSFilename_x86 extends PSDriverDetails{
	ActionDriver aDriver=new ActionDriver();
	
	public void FileName() throws IOException {
		
	//StartBrowser.childTest=StartBrowser.parentTest.createNode("Driver Filename Validation For PS");
	//Create an object of File class to open xlsx file
    File file =    new File("TestData/TestData.xls");
    
    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);
    
    //Creating workbook instance that refers to .xls file
    @SuppressWarnings("resource")
	HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
    
    //Creating a Sheet object using the sheet Name
    HSSFSheet sheet=workbook.getSheet("PSDriver");
    
    //Create a row object to retrieve row at index 2
    HSSFRow row=sheet.getRow(2);
    
    //Create a cell object to retreive cell at index 0
    HSSFCell cell=row.getCell(0);
    
    //Get the address in a variable
    String address= cell.getStringCellValue();
    StartBrowser.childTest.pass("Comparison of Driver FileName_x86");
    aDriver.MultipleElementGetText(PSDriverDetails.MoreDetails, address, "DriverValue");  
    //Printing the address
    //System.out.println("Address is :"+ address);
	/*
	 * String driverFilename=aDriver.gettext(PSDriverDetails.Filename);
	 * if(driverFilename.equals(address)) {
	 * StartBrowser.childTest.pass(" Driver Filename Comparison is Successful "
	 * +"Actual=" +driverFilename +" Expected=" +address); } else {
	 * StartBrowser.childTest.fail(" Driver filename Comparison is not Successful "
	 * +"Actual=" +driverFilename +" Expected=" +address);
	 * 
	 * }
	 */  
    
}
	
}

