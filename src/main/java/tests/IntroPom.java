package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pages.InventoryPage;
import pages.LoginPage;
import pages.cartPage;
import pages.checkoutPage;
import pages.checkoutcomplete;
import pages.checkoutoverview;

public class IntroPom {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.gecko.driver", "C:\\Temp\\Drivers\\Firefox\\geckodriver.exe");
		        WebDriver driver = new FirefoxDriver();
		        driver.get("https://www.saucedemo.com");
		        
		        //instancing loginpage class and calling the method
		        LoginPage loginpage = new LoginPage(driver);
		        loginpage.loginsaucedemo("standard_user", "secret_sauce");
		        
		        InventoryPage inventory = new InventoryPage(driver);
		        inventory.selectingBackpackandjacket();	
		        inventory.clickingCartIcon(); 
		        
		        cartPage cart = new cartPage(driver);
		        Boolean match =cart.verifybackpackandjacket("Sauce Labs Backpack", "Sauce Labs Fleece Jacket");
		        cart.clickcheckout();
		        
		        checkoutPage checkStep1 = new checkoutPage(driver);
		        checkStep1.Fillingoutfields("Test", "Romtest", 12345);
		        
		        //checkout-step-two.html
		        checkoutoverview checkStep2 = new checkoutoverview(driver);
		        checkStep2.gettinggtotal();
		        
		        //checkoutcomplete
		        checkoutcomplete complete = new checkoutcomplete (driver);
		        complete.catchingConfirmationMessag();
		        
		       
			}
	}



