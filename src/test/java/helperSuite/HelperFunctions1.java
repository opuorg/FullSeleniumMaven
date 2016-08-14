package helperSuite;

import org.openqa.selenium.By;
import org.testng.Assert;

import driverPackage.DriverClass;

public class HelperFunctions1 extends DriverClass{
	public static void goToUrl(String url, String title){
		driver.get(url);
		Assert.assertEquals(driver.getTitle(), title);
		//driver.getTitle();
	}
	public static void fbLogin(String userName, String password){
		driver.findElement(By.cssSelector("#email")).sendKeys(userName);
		driver.findElement(By.cssSelector("#pass")).sendKeys(password);
		driver.findElement(By.cssSelector("#loginbutton")).click();
	}

}
