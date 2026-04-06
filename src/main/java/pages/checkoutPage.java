<<<<<<< HEAD
package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
	
	WebDriver driver;
	
	public checkoutPage(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first-name")
	WebElement FirstName;
	
	@FindBy(id = "last-name")
	WebElement LastName; 
	
	@FindBy(id = "postal-code")
	WebElement PostalCode; 
	
	@FindBy(id = "continue")
	WebElement btncontinue; 
	
	public checkoutoverview Fillingoutfields(String name, String lastname, int cp ) {
		Actions entering = new Actions(driver);
		entering.moveToElement(FirstName).click().sendKeys(name).build().perform();
		entering.moveToElement(LastName).click().sendKeys(lastname).build().perform();
		entering.moveToElement(PostalCode).click().sendKeys(String.valueOf(cp)).perform();
		btncontinue.click();
		System.out.println("The first name is " + name + " and last name is " + lastname +
		" with CP "  + cp );
		
		return new checkoutoverview(driver);
		
	}
	
	
	
}
=======
package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutPage {
	
	WebDriver driver;
	
	public checkoutPage(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "first-name")
	WebElement FirstName;
	
	@FindBy(id = "last-name")
	WebElement LastName; 
	
	@FindBy(id = "postal-code")
	WebElement PostalCode; 
	
	@FindBy(id = "continue")
	WebElement btncontinue; 
	
	public checkoutoverview Fillingoutfields(String name, String lastname, int cp ) {
		Actions entering = new Actions(driver);
		entering.moveToElement(FirstName).click().sendKeys(name).build().perform();
		entering.moveToElement(LastName).click().sendKeys(lastname).build().perform();
		entering.moveToElement(PostalCode).click().sendKeys(String.valueOf(cp)).perform();
		btncontinue.click();
		System.out.println("The first name is " + name + " and last name is " + lastname +
		" with CP "  + cp );
		
		return new checkoutoverview(driver);
		
	}
	
	
	
}
>>>>>>> 8bb1e40 (Uploading the new changes from the new PC)
