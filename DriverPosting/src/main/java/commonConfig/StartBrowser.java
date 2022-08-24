package commonConfig;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class StartBrowser {
	//Declaration WebDriver Global	
	public static WebDriver driver;

	//extend HtML Report
	ExtentHtmlReporter htmlreporter;
	public static ExtentReports extent;
	public static ExtentTest parentTest;
	public static ExtentTest childTest;

	//report setup for all the test
	@BeforeTest
	public void report() {
		
		htmlreporter=new ExtentHtmlReporter("Reports/MyResult.html");
		extent=new ExtentReports();
		extent.attachReporter(htmlreporter);
	}
	
	

	@BeforeMethod
	public void method(Method method) {
		parentTest=extent.createTest(method.getName());
		
	}

	//Launch WebBrowser for test automation
	@BeforeClass
	  public void lanchBrowser() {
		  
		  WebDriverManager.chromedriver().setup();
		  driver= new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
		  //driver.get("https://www.support.xerox.com/en-us/product/global-printer-driver/downloads" );
		  //driver.get("https://www.support.xerox.com/");
	  }

	//Close the Browser
	  @AfterClass
	  public void closeBrowser() {
		  driver.quit();
		  extent.flush();
	  }

}