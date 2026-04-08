package pages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import AbstractComponents.abstractComponents2;

public class cartPage extends abstractComponents2 {
	WebDriver driver;
	
	public cartPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".inventory_item_name") 
    private List<WebElement> cartProducts;
	
	@FindBy(id = "checkout")
	WebElement btncheckout;
    
    
	//wait locator 
	private By cartProductslocator = By.cssSelector(".inventory_item_name");
	
	
	public Boolean verifybackpackandjacket(String backpack, String jacket) {
		waitForElementToAppear(cartProductslocator);
		boolean matchBackpack = cartProducts.stream().anyMatch(p -> p.getText().equalsIgnoreCase(backpack));// compares two strings for equality while ignoring differences in case (uppercase/lowercase).
        boolean matchJacket = cartProducts.stream().anyMatch(p -> p.getText().equalsIgnoreCase(jacket));
		return matchBackpack && matchJacket;
	}
	
	public void clickcheckout() {
		btncheckout.click();
	}
}
