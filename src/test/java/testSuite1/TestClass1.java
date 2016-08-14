package testSuite1;

import org.testng.annotations.*;

import driverPackage.DriverClass;
import helperSuite.HelperFunctions1;

public class TestClass1 extends DriverClass{
	@Test
	public static void LoginToFacebook(){
		HelperFunctions1.goToUrl("http://www.facebook.com", "Facebook - Log In or Sign Up");
		HelperFunctions1.fbLogin("Test1@yahoo.com", "Test12345");
	}
	
	@Test(dependsOnMethods="LoginToFacebook")
	public static void quitBrowser(){
		driver.quit();
	}

}
