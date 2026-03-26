package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class checkoutoverview  {

	WebDriver driver;
	
	public checkoutoverview(WebDriver driver) {
		//super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@data-test='total-label']")
	WebElement Total;
	
	@FindBy(id="finish")
	WebElement btnfinish;
	
	public String gettinggtotal() {
		String qtytotal = Total.getText();
		System.out.println("The total to pay is " + qtytotal );
		btnfinish.click();
		return qtytotal;
	}
}
