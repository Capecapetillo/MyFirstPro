package AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class abstractComponents2 {
	
	WebDriver driver;//creating a one local object like this
	
	public abstractComponents2(WebDriver driver) {
		this.driver = driver;// giving life to the driver, this is how we are connecting the pieces 
		PageFactory.initElements(driver, this);
}
	
	public void waitForElementToAppear(By findby ) {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));	
	}
	
	public void waitForElementToDisappear(WebElement ele)  {
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(ele));
	}
}
