package tests;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import pages.LoginPage; 

public class errorlogin {

	@Test
	public void error() {
		System.setProperty("webdriver.gecko.driver", "C:\\Temp\\Drivers\\Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.saucedemo.com");
        LoginPage login = new LoginPage(driver);
        login.loginsaucedemo("locked_out_user", "secret_sauce");
		 Assert.assertEquals(login.getErrorMessage(),"Epic sadface: Sorry, this user has been locked out."); //(expected, actual)
		 
		 System.out.println("Success error validation, this user is locked out.");
	}
	
	

}
