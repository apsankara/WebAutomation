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

public class DriverVersion {
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
    StartBrowser.childTest=StartBrowser.parentTest.createNode("Driver Details Validations");
    StartBrowser.childTest.pass("Comparison of Driver Version");
    aDriver.MultipleElementGetText(PSDriverDetails.MoreDetails, address, "DriverValue");
    
    
}
}
