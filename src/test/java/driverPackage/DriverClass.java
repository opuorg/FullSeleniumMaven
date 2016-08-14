package driverPackage;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.*;

public class DriverClass {
	protected static WebDriver driver;
	
	@BeforeSuite
	@Parameters({"Browser"})
	public static void driverMethod(String Browser){
		if(Browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.firefox.marionette", "geckodriver");
		driver = new FirefoxDriver();
		System.out.println(Browser);
		}else if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver2");
			driver=new ChromeDriver();	
			System.out.println(Browser);
		}else if(Browser.equalsIgnoreCase("safari")){
			driver = new SafariDriver();
			System.out.println(Browser);
		}else{
			System.out.println("Please enter a valid browser in the suite parameter.");
		}
	}

}
