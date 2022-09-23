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
import webPageObjectRepository.PCL6DriverDetails;

public class PCL6Tag {
ActionDriver aDriver=new ActionDriver();
	
	public void FileTag() throws IOException {
	//StartBrowser.childTest=StartBrowser.parentTest.createNode("Driver Tag Validation For PS");
	//Create an object of File class to open xlsx file
    File file =    new File("TestData/TestData.xls");
    
    //Create an object of FileInputStream class to read excel file
    FileInputStream inputStream = new FileInputStream(file);
    
    //Creating workbook instance that refers to .xls file
    @SuppressWarnings("resource")
	HSSFWorkbook workbook=new HSSFWorkbook(inputStream);
    
    //Creating a Sheet object using the sheet Name
    HSSFSheet sheet=workbook.getSheet("PCL6Driver");
    
    //Create a row object to retrieve row at index 1
    HSSFRow row=sheet.getRow(1);
    
    //Create a cell object to retreive cell at index 4
    HSSFCell cell=row.getCell(4);
    
    //Get the address in a variable
    String address= cell.getStringCellValue();
    StartBrowser.childTest.pass("Comparison of Driver Tag");
    aDriver.MultipleElementGetText(PCL6DriverDetails.MoreDetails, address, "DriverValue");
    //Printing the address
    //System.out.println("Address is :"+ address);
	/*
	 * String driverTag=aDriver.gettext(PSDriverDetails.Tags);
	 * if(driverTag.equals(address)) {
	 * StartBrowser.childTest.pass(" Driver Tag Comparison is Successful "+"Actual="
	 * +driverTag +" Expected=" +address); } else {
	 * StartBrowser.childTest.fail(" Driver Tag Comparison is not Successful "
	 * +"Actual=" +driverTag +" Expecte= " +address);
	 * 
	 * }
	 */  
    
}
}
