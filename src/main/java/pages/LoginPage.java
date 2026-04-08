package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}	
	
	//page factory
	@FindBy(id="user-name") 
	WebElement username;
	
	@FindBy(id="password") 
	WebElement userpassword;
	
	@FindBy(id="login-button") 
	WebElement loginbutton;
	
	@FindBy(xpath="//h3[@data-test='error']") 
	WebElement errormessage;	
	
	/*driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();*/
	//Action Method
	public void loginsaucedemo(String Email, String Password) {
		username.sendKeys(Email);
		userpassword.sendKeys(Password);
		loginbutton.click();
	}
	
	public String getErrorMessage() {
		return errormessage.getText();
	}
	
	
	
	

}
