package practice;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCokkies {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();		
		WebDriver driver=new ChromeDriver();		
		driver.get("https://www.support.xerox.com/");
		//How to capture the cookies from the browser
		Set<Cookie> cokkies=driver.manage().getCookies();
		System.out.println(cokkies.size());
		//System.out.println(cokkies);
		driver.manage().window().maximize();
		
		//How to print cookies form the browser
		
		for(Cookie cok:cokkies) {
			System.out.println(cok.getName()+" "+cok.getValue());
		}
		
		//how to add the cookies		
		Cookie cookie=new Cookie("Welcome", "Welcome@123");
		driver.manage().addCookie(cookie);		
		cokkies=driver.manage().getCookies();
		System.out.println(cokkies.size());
		
		for(Cookie cok:cokkies) {			
			System.out.println(cok.getName()+" "+cok.getValue());
		}
		
		//how to delete the specific cookies
		driver.manage().deleteCookie(cookie);
		cokkies=driver.manage().getCookies();
		System.out.println(cokkies.size());
		
		//how to delete all the cookies
		driver.manage().deleteAllCookies();
		cokkies=driver.manage().getCookies();
		System.out.println(cokkies.size());
	}

}
