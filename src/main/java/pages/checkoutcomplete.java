package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutcomplete {
WebDriver driver;
	
	public checkoutcomplete(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	WebElement confirmationMessage;
	
	public String catchingConfirmationMessag () {
		System.out.println("We got your meesage: " + confirmationMessage.getText());
		return confirmationMessage.getText();
	}
	
}
