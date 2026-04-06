package tests;

import java.io.IOException;

import org.testng.annotations.Test;

import pages.InventoryPage;
import pages.LoginPage;
import pages.cartPage;
import pages.checkoutPage;
import pages.checkoutcomplete;
import pages.checkoutoverview;
import testComponents.BaseTest;

public class IntroPom extends BaseTest {

	@Test
	public void runner() throws IOException{
		
			
		        
		        //instancing loginpage class and calling the method // I created the base test class, no need driver here.
		        LoginPage loginpage	=launchApplication();
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



