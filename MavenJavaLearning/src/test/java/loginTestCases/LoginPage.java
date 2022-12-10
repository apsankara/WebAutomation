package loginTestCases;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class LoginPage {
	
	WebDriver driver;
	String [][] data=null;
		
	
	@DataProvider(name="LoginData")
	public String [][] LoginData() throws IOException, BiffException {
		
		data=getExcelData();
		
		return data;
	}
	
	@SuppressWarnings("unused")
	public String[][] getExcelData() throws IOException, BiffException {
		
		//Create an object of FileInputStream class to read excel file
		FileInputStream excelinput = new FileInputStream("C:\\WebAutomation\\MavenJavaLearning\\TestData.xls");
		
		//create workbook object
		
		Workbook workbook=Workbook.getWorkbook(excelinput);
		
		Sheet sheet=workbook.getSheet(0);
		
		int rowCount=sheet.getRows();
		int columnCount=sheet.getColumns();
		
		String testData[][]=new String[rowCount-1][columnCount];
		
		for(int i=1;i<rowCount;i++) {
			
			for(int j=0;j<columnCount;j++) {
				
				testData[i-1][j]=sheet.getCell(j,i).getContents();
			}
		}
		
		return testData;
	}
	
	
	@BeforeTest
	public void OpenBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumSetup\\chromedriver_win32\\chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.manage().window().maximize();
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
		
	@Test(dataProvider="LoginData")
	public void Login(String uName,String pWord) {
		
		WebElement userName=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		
		userName.sendKeys(uName);
		
		WebElement password=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		
		password.sendKeys(pWord);
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}
