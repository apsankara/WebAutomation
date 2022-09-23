package utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptExe {
	
	//Flashing Element
	public static void flashByJs(WebElement element, WebDriver driver) {
		//JavascriptExecutor js=((JavascriptExecutor) driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<10;i++) {
			changeColor("#000000",element, driver);//1
			changeColor(bgcolor,element, driver);//2
		}
	}
	

	public static void changeColor(String color, WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.backgroundColor='"+ color +"'",element);
		
		try {
			Thread.sleep(20);
		}catch(InterruptedException e) {
			
		}
	}

	//Drawing border & take screenshot of the Element
	public static void drawBorderByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].style.border='3px solid red'",element);
	}

	//Get the title of the page
	public static String getTitleByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		String title=js.executeScript("return document.title;").toString();
		return title;
	}

	//Click action
	public static void clickByJs(WebElement element, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("arguments[0].click();",element);	
	}

	//Generate alert
	public static void generateAlarttByJs(String message, WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("alart('"+message +"')");		
	}

	//Refreshing the page
	public static void refreshByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("history.go(0)");
	}
	
	//Scrolling down page
	public static void scrollDownByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
	//Scroll up page
	public static void scrollUpByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,-document.scrollHeight)");
	}

	//Zoom-In Zoom-Out page
	public static void ZoomByJs(WebDriver driver) {
		JavascriptExecutor js=((JavascriptExecutor) driver);
		js.executeScript("document.body.style.zoom='50%'");
	}

}
