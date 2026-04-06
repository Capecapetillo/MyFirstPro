<<<<<<< HEAD
package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.abstractComponents2;

public class InventoryPage extends abstractComponents2  {
	
	WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement backpack;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement jacket;
	
	By listofproducts = By.xpath("//div[@class='inventory_item']");
	
	@FindBy(className="shopping_cart_link")
	WebElement carticon;
	
	public void selectingBackpackandjacket() {
		waitForElementToAppear(listofproducts);
		backpack.click();
		jacket.click();
		}
	
	public void clickingCartIcon() {
		carticon.click();
	}
	
}








//stream : Open the product list to process them one by one.
//ilter(...): Checks the text of each element. If the text contains "Sauce Labs Backpack", that element "passes the test".
//findFirst(): Keeps the first element that passed the filter.
//ifPresent(...): This is the safest way to handle the result. If the product is found, the click is executed; if it isn't,
//it simply does nothing and the test doesn't break due to a null error.

/*List <WebElement> allprod = driver.findElements(listofproducts);
allprod.stream().filter(item -> item.getText().contains("Sauce Labs Backpack")).
findFirst().ifPresent(product -> product.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click());*/

/*//searching and clicking the jacket
allprod.stream().filter(item -> item.getText().contains("Sauce Labs Fleece Jacket")).
findFirst().ifPresent(product -> product.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).
=======
package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.abstractComponents2;

public class InventoryPage extends abstractComponents2  {
	
	WebDriver driver;
	
	public InventoryPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-backpack']")
	WebElement backpack;
	
	@FindBy(xpath="//button[@id='add-to-cart-sauce-labs-fleece-jacket']")
	WebElement jacket;
	
	By listofproducts = By.xpath("//div[@class='inventory_item']");
	
	@FindBy(className="shopping_cart_link")
	WebElement carticon;
	
	public void selectingBackpackandjacket() {
		waitForElementToAppear(listofproducts);
		backpack.click();
		jacket.click();
		}
	
	public void clickingCartIcon() {
		carticon.click();
	}
	
}








//stream : Open the product list to process them one by one.
//ilter(...): Checks the text of each element. If the text contains "Sauce Labs Backpack", that element "passes the test".
//findFirst(): Keeps the first element that passed the filter.
//ifPresent(...): This is the safest way to handle the result. If the product is found, the click is executed; if it isn't,
//it simply does nothing and the test doesn't break due to a null error.

/*List <WebElement> allprod = driver.findElements(listofproducts);
allprod.stream().filter(item -> item.getText().contains("Sauce Labs Backpack")).
findFirst().ifPresent(product -> product.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']")).click());*/

/*//searching and clicking the jacket
allprod.stream().filter(item -> item.getText().contains("Sauce Labs Fleece Jacket")).
findFirst().ifPresent(product -> product.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']")).
>>>>>>> 8bb1e40 (Uploading the new changes from the new PC)
click());*/